require 'java'

HOST=ARGV[0]
PORT=ARGV[1] || 8989
SUMMARY=true

module JMX
    include_package 'javax.management'
    include_package 'javax.management.remote'
    include_package 'java.util'

    class MBean
        include_class 'javax.management.ObjectName'

        def initialize(mbsc, object_name)
            @mbsc = mbsc
            @object_name = ObjectName.new object_name
            @info = mbsc.getMBeanInfo @object_name
        end

        def to_s pad="\t"
            string = ""
            @info.attributes.each do | mbean_attr |
                string << "#{pad}#{mbean_attr.name}: #{@mbsc.getAttribute @object_name, mbean_attr.name}\n"
            end

            string
        end

        def summary pad="\t"
            string = ""
            string << "#{pad}Events received: #{@mbsc.getAttribute(@object_name, 'Count').to_s.gsub(/(\d)(?=\d{3}+(?:\.|$))(\d{3}\..*)?/,'\1,\2')}\n"
            string << ("#{pad}Mean rate: %.3f events/s\n" % (@mbsc.getAttribute @object_name, 'MeanRate'))
            string << ("#{pad}95thPercentile: %.3f ms/event\n" % (@mbsc.getAttribute @object_name, '95thPercentile'))

            string
        end

        def self.pretty_print_api mbsc, type, name, summary=true
            mbean = MBean.new mbsc, "com.ning.metrics.collector.endpoint.resources:type=#{type},name=#{name}"
            puts name
            if summary
                puts mbean.summary
            else
                puts mbean.to_s
            end
        end
    end

    url = JMXServiceURL.new "service:jmx:rmi:///jndi/rmi://#{HOST}:#{PORT}/jmxrmi"
    connector = JMXConnectorFactory::connect url, HashMap.new
    mbsc = connector.mbean_server_connection

    MBean.pretty_print_api mbsc, "ScribeEventRequestHandler", "SCRIBE_API", SUMMARY

    MBean.pretty_print_api mbsc, "CollectorResource", "GET_API", SUMMARY
    MBean.pretty_print_api mbsc, "Base64CollectorResource", "GET_Base64_API", SUMMARY

    ["POST_Json_API", "POST_Smile_API", "POST_ThriftLegacy_API", "POST_Thrift_API"].each do |api|
        MBean.pretty_print_api mbsc, "BodyResource", api, SUMMARY
    end
end

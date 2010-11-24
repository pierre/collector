/**
 * SystemStatisticsPerformanceGraph.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsPerformanceGraph  implements java.io.Serializable {
    private java.lang.String graph_name;

    private java.lang.String graph_title;

    private java.lang.String graph_description;

    public SystemStatisticsPerformanceGraph() {
    }

    public SystemStatisticsPerformanceGraph(
           java.lang.String graph_name,
           java.lang.String graph_title,
           java.lang.String graph_description) {
           this.graph_name = graph_name;
           this.graph_title = graph_title;
           this.graph_description = graph_description;
    }


    /**
     * Gets the graph_name value for this SystemStatisticsPerformanceGraph.
     * 
     * @return graph_name
     */
    public java.lang.String getGraph_name() {
        return graph_name;
    }


    /**
     * Sets the graph_name value for this SystemStatisticsPerformanceGraph.
     * 
     * @param graph_name
     */
    public void setGraph_name(java.lang.String graph_name) {
        this.graph_name = graph_name;
    }


    /**
     * Gets the graph_title value for this SystemStatisticsPerformanceGraph.
     * 
     * @return graph_title
     */
    public java.lang.String getGraph_title() {
        return graph_title;
    }


    /**
     * Sets the graph_title value for this SystemStatisticsPerformanceGraph.
     * 
     * @param graph_title
     */
    public void setGraph_title(java.lang.String graph_title) {
        this.graph_title = graph_title;
    }


    /**
     * Gets the graph_description value for this SystemStatisticsPerformanceGraph.
     * 
     * @return graph_description
     */
    public java.lang.String getGraph_description() {
        return graph_description;
    }


    /**
     * Sets the graph_description value for this SystemStatisticsPerformanceGraph.
     * 
     * @param graph_description
     */
    public void setGraph_description(java.lang.String graph_description) {
        this.graph_description = graph_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsPerformanceGraph)) return false;
        SystemStatisticsPerformanceGraph other = (SystemStatisticsPerformanceGraph) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graph_name==null && other.getGraph_name()==null) || 
             (this.graph_name!=null &&
              this.graph_name.equals(other.getGraph_name()))) &&
            ((this.graph_title==null && other.getGraph_title()==null) || 
             (this.graph_title!=null &&
              this.graph_title.equals(other.getGraph_title()))) &&
            ((this.graph_description==null && other.getGraph_description()==null) || 
             (this.graph_description!=null &&
              this.graph_description.equals(other.getGraph_description())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGraph_name() != null) {
            _hashCode += getGraph_name().hashCode();
        }
        if (getGraph_title() != null) {
            _hashCode += getGraph_title().hashCode();
        }
        if (getGraph_description() != null) {
            _hashCode += getGraph_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemStatisticsPerformanceGraph.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.PerformanceGraph"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graph_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graph_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graph_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graph_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graph_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graph_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * ManagementSNMPConfigurationMibnumNameProgArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationMibnumNameProgArgs  implements java.io.Serializable {
    private java.lang.String mib_num;

    private iControl.ManagementSNMPConfigurationNameProgArgs name_prog_args;

    public ManagementSNMPConfigurationMibnumNameProgArgs() {
    }

    public ManagementSNMPConfigurationMibnumNameProgArgs(
           java.lang.String mib_num,
           iControl.ManagementSNMPConfigurationNameProgArgs name_prog_args) {
           this.mib_num = mib_num;
           this.name_prog_args = name_prog_args;
    }


    /**
     * Gets the mib_num value for this ManagementSNMPConfigurationMibnumNameProgArgs.
     * 
     * @return mib_num
     */
    public java.lang.String getMib_num() {
        return mib_num;
    }


    /**
     * Sets the mib_num value for this ManagementSNMPConfigurationMibnumNameProgArgs.
     * 
     * @param mib_num
     */
    public void setMib_num(java.lang.String mib_num) {
        this.mib_num = mib_num;
    }


    /**
     * Gets the name_prog_args value for this ManagementSNMPConfigurationMibnumNameProgArgs.
     * 
     * @return name_prog_args
     */
    public iControl.ManagementSNMPConfigurationNameProgArgs getName_prog_args() {
        return name_prog_args;
    }


    /**
     * Sets the name_prog_args value for this ManagementSNMPConfigurationMibnumNameProgArgs.
     * 
     * @param name_prog_args
     */
    public void setName_prog_args(iControl.ManagementSNMPConfigurationNameProgArgs name_prog_args) {
        this.name_prog_args = name_prog_args;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationMibnumNameProgArgs)) return false;
        ManagementSNMPConfigurationMibnumNameProgArgs other = (ManagementSNMPConfigurationMibnumNameProgArgs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mib_num==null && other.getMib_num()==null) || 
             (this.mib_num!=null &&
              this.mib_num.equals(other.getMib_num()))) &&
            ((this.name_prog_args==null && other.getName_prog_args()==null) || 
             (this.name_prog_args!=null &&
              this.name_prog_args.equals(other.getName_prog_args())));
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
        if (getMib_num() != null) {
            _hashCode += getMib_num().hashCode();
        }
        if (getName_prog_args() != null) {
            _hashCode += getName_prog_args().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationMibnumNameProgArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mib_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mib_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_prog_args");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name_prog_args"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgs"));
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

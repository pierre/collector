/**
 * ManagementRRList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementRRList  implements java.io.Serializable {
    private iControl.ManagementARecord[] a_list;

    private iControl.ManagementNSRecord[] ns_list;

    private iControl.ManagementCNAMERecord[] cname_list;

    private iControl.ManagementSOARecord[] soa_list;

    private iControl.ManagementPTRRecord[] ptr_list;

    private iControl.ManagementHINFORecord[] hinfo_list;

    private iControl.ManagementMXRecord[] mx_list;

    private iControl.ManagementTXTRecord[] txt_list;

    private iControl.ManagementSRVRecord[] srv_list;

    private iControl.ManagementKEYRecord[] key_list;

    private iControl.ManagementSIGRecord[] sig_list;

    private iControl.ManagementNXTRecord[] nxt_list;

    private iControl.ManagementAAAARecord[] aaaa_list;

    private iControl.ManagementA6Record[] a6_list;

    private iControl.ManagementDNAMERecord[] dname_list;

    public ManagementRRList() {
    }

    public ManagementRRList(
           iControl.ManagementARecord[] a_list,
           iControl.ManagementNSRecord[] ns_list,
           iControl.ManagementCNAMERecord[] cname_list,
           iControl.ManagementSOARecord[] soa_list,
           iControl.ManagementPTRRecord[] ptr_list,
           iControl.ManagementHINFORecord[] hinfo_list,
           iControl.ManagementMXRecord[] mx_list,
           iControl.ManagementTXTRecord[] txt_list,
           iControl.ManagementSRVRecord[] srv_list,
           iControl.ManagementKEYRecord[] key_list,
           iControl.ManagementSIGRecord[] sig_list,
           iControl.ManagementNXTRecord[] nxt_list,
           iControl.ManagementAAAARecord[] aaaa_list,
           iControl.ManagementA6Record[] a6_list,
           iControl.ManagementDNAMERecord[] dname_list) {
           this.a_list = a_list;
           this.ns_list = ns_list;
           this.cname_list = cname_list;
           this.soa_list = soa_list;
           this.ptr_list = ptr_list;
           this.hinfo_list = hinfo_list;
           this.mx_list = mx_list;
           this.txt_list = txt_list;
           this.srv_list = srv_list;
           this.key_list = key_list;
           this.sig_list = sig_list;
           this.nxt_list = nxt_list;
           this.aaaa_list = aaaa_list;
           this.a6_list = a6_list;
           this.dname_list = dname_list;
    }


    /**
     * Gets the a_list value for this ManagementRRList.
     * 
     * @return a_list
     */
    public iControl.ManagementARecord[] getA_list() {
        return a_list;
    }


    /**
     * Sets the a_list value for this ManagementRRList.
     * 
     * @param a_list
     */
    public void setA_list(iControl.ManagementARecord[] a_list) {
        this.a_list = a_list;
    }


    /**
     * Gets the ns_list value for this ManagementRRList.
     * 
     * @return ns_list
     */
    public iControl.ManagementNSRecord[] getNs_list() {
        return ns_list;
    }


    /**
     * Sets the ns_list value for this ManagementRRList.
     * 
     * @param ns_list
     */
    public void setNs_list(iControl.ManagementNSRecord[] ns_list) {
        this.ns_list = ns_list;
    }


    /**
     * Gets the cname_list value for this ManagementRRList.
     * 
     * @return cname_list
     */
    public iControl.ManagementCNAMERecord[] getCname_list() {
        return cname_list;
    }


    /**
     * Sets the cname_list value for this ManagementRRList.
     * 
     * @param cname_list
     */
    public void setCname_list(iControl.ManagementCNAMERecord[] cname_list) {
        this.cname_list = cname_list;
    }


    /**
     * Gets the soa_list value for this ManagementRRList.
     * 
     * @return soa_list
     */
    public iControl.ManagementSOARecord[] getSoa_list() {
        return soa_list;
    }


    /**
     * Sets the soa_list value for this ManagementRRList.
     * 
     * @param soa_list
     */
    public void setSoa_list(iControl.ManagementSOARecord[] soa_list) {
        this.soa_list = soa_list;
    }


    /**
     * Gets the ptr_list value for this ManagementRRList.
     * 
     * @return ptr_list
     */
    public iControl.ManagementPTRRecord[] getPtr_list() {
        return ptr_list;
    }


    /**
     * Sets the ptr_list value for this ManagementRRList.
     * 
     * @param ptr_list
     */
    public void setPtr_list(iControl.ManagementPTRRecord[] ptr_list) {
        this.ptr_list = ptr_list;
    }


    /**
     * Gets the hinfo_list value for this ManagementRRList.
     * 
     * @return hinfo_list
     */
    public iControl.ManagementHINFORecord[] getHinfo_list() {
        return hinfo_list;
    }


    /**
     * Sets the hinfo_list value for this ManagementRRList.
     * 
     * @param hinfo_list
     */
    public void setHinfo_list(iControl.ManagementHINFORecord[] hinfo_list) {
        this.hinfo_list = hinfo_list;
    }


    /**
     * Gets the mx_list value for this ManagementRRList.
     * 
     * @return mx_list
     */
    public iControl.ManagementMXRecord[] getMx_list() {
        return mx_list;
    }


    /**
     * Sets the mx_list value for this ManagementRRList.
     * 
     * @param mx_list
     */
    public void setMx_list(iControl.ManagementMXRecord[] mx_list) {
        this.mx_list = mx_list;
    }


    /**
     * Gets the txt_list value for this ManagementRRList.
     * 
     * @return txt_list
     */
    public iControl.ManagementTXTRecord[] getTxt_list() {
        return txt_list;
    }


    /**
     * Sets the txt_list value for this ManagementRRList.
     * 
     * @param txt_list
     */
    public void setTxt_list(iControl.ManagementTXTRecord[] txt_list) {
        this.txt_list = txt_list;
    }


    /**
     * Gets the srv_list value for this ManagementRRList.
     * 
     * @return srv_list
     */
    public iControl.ManagementSRVRecord[] getSrv_list() {
        return srv_list;
    }


    /**
     * Sets the srv_list value for this ManagementRRList.
     * 
     * @param srv_list
     */
    public void setSrv_list(iControl.ManagementSRVRecord[] srv_list) {
        this.srv_list = srv_list;
    }


    /**
     * Gets the key_list value for this ManagementRRList.
     * 
     * @return key_list
     */
    public iControl.ManagementKEYRecord[] getKey_list() {
        return key_list;
    }


    /**
     * Sets the key_list value for this ManagementRRList.
     * 
     * @param key_list
     */
    public void setKey_list(iControl.ManagementKEYRecord[] key_list) {
        this.key_list = key_list;
    }


    /**
     * Gets the sig_list value for this ManagementRRList.
     * 
     * @return sig_list
     */
    public iControl.ManagementSIGRecord[] getSig_list() {
        return sig_list;
    }


    /**
     * Sets the sig_list value for this ManagementRRList.
     * 
     * @param sig_list
     */
    public void setSig_list(iControl.ManagementSIGRecord[] sig_list) {
        this.sig_list = sig_list;
    }


    /**
     * Gets the nxt_list value for this ManagementRRList.
     * 
     * @return nxt_list
     */
    public iControl.ManagementNXTRecord[] getNxt_list() {
        return nxt_list;
    }


    /**
     * Sets the nxt_list value for this ManagementRRList.
     * 
     * @param nxt_list
     */
    public void setNxt_list(iControl.ManagementNXTRecord[] nxt_list) {
        this.nxt_list = nxt_list;
    }


    /**
     * Gets the aaaa_list value for this ManagementRRList.
     * 
     * @return aaaa_list
     */
    public iControl.ManagementAAAARecord[] getAaaa_list() {
        return aaaa_list;
    }


    /**
     * Sets the aaaa_list value for this ManagementRRList.
     * 
     * @param aaaa_list
     */
    public void setAaaa_list(iControl.ManagementAAAARecord[] aaaa_list) {
        this.aaaa_list = aaaa_list;
    }


    /**
     * Gets the a6_list value for this ManagementRRList.
     * 
     * @return a6_list
     */
    public iControl.ManagementA6Record[] getA6_list() {
        return a6_list;
    }


    /**
     * Sets the a6_list value for this ManagementRRList.
     * 
     * @param a6_list
     */
    public void setA6_list(iControl.ManagementA6Record[] a6_list) {
        this.a6_list = a6_list;
    }


    /**
     * Gets the dname_list value for this ManagementRRList.
     * 
     * @return dname_list
     */
    public iControl.ManagementDNAMERecord[] getDname_list() {
        return dname_list;
    }


    /**
     * Sets the dname_list value for this ManagementRRList.
     * 
     * @param dname_list
     */
    public void setDname_list(iControl.ManagementDNAMERecord[] dname_list) {
        this.dname_list = dname_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementRRList)) return false;
        ManagementRRList other = (ManagementRRList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.a_list==null && other.getA_list()==null) || 
             (this.a_list!=null &&
              java.util.Arrays.equals(this.a_list, other.getA_list()))) &&
            ((this.ns_list==null && other.getNs_list()==null) || 
             (this.ns_list!=null &&
              java.util.Arrays.equals(this.ns_list, other.getNs_list()))) &&
            ((this.cname_list==null && other.getCname_list()==null) || 
             (this.cname_list!=null &&
              java.util.Arrays.equals(this.cname_list, other.getCname_list()))) &&
            ((this.soa_list==null && other.getSoa_list()==null) || 
             (this.soa_list!=null &&
              java.util.Arrays.equals(this.soa_list, other.getSoa_list()))) &&
            ((this.ptr_list==null && other.getPtr_list()==null) || 
             (this.ptr_list!=null &&
              java.util.Arrays.equals(this.ptr_list, other.getPtr_list()))) &&
            ((this.hinfo_list==null && other.getHinfo_list()==null) || 
             (this.hinfo_list!=null &&
              java.util.Arrays.equals(this.hinfo_list, other.getHinfo_list()))) &&
            ((this.mx_list==null && other.getMx_list()==null) || 
             (this.mx_list!=null &&
              java.util.Arrays.equals(this.mx_list, other.getMx_list()))) &&
            ((this.txt_list==null && other.getTxt_list()==null) || 
             (this.txt_list!=null &&
              java.util.Arrays.equals(this.txt_list, other.getTxt_list()))) &&
            ((this.srv_list==null && other.getSrv_list()==null) || 
             (this.srv_list!=null &&
              java.util.Arrays.equals(this.srv_list, other.getSrv_list()))) &&
            ((this.key_list==null && other.getKey_list()==null) || 
             (this.key_list!=null &&
              java.util.Arrays.equals(this.key_list, other.getKey_list()))) &&
            ((this.sig_list==null && other.getSig_list()==null) || 
             (this.sig_list!=null &&
              java.util.Arrays.equals(this.sig_list, other.getSig_list()))) &&
            ((this.nxt_list==null && other.getNxt_list()==null) || 
             (this.nxt_list!=null &&
              java.util.Arrays.equals(this.nxt_list, other.getNxt_list()))) &&
            ((this.aaaa_list==null && other.getAaaa_list()==null) || 
             (this.aaaa_list!=null &&
              java.util.Arrays.equals(this.aaaa_list, other.getAaaa_list()))) &&
            ((this.a6_list==null && other.getA6_list()==null) || 
             (this.a6_list!=null &&
              java.util.Arrays.equals(this.a6_list, other.getA6_list()))) &&
            ((this.dname_list==null && other.getDname_list()==null) || 
             (this.dname_list!=null &&
              java.util.Arrays.equals(this.dname_list, other.getDname_list())));
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
        if (getA_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getA_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getA_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNs_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNs_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNs_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCname_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCname_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCname_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoa_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoa_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoa_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPtr_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPtr_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPtr_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHinfo_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHinfo_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHinfo_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMx_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMx_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMx_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTxt_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTxt_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTxt_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrv_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrv_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrv_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKey_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKey_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKey_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSig_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSig_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSig_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNxt_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNxt_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNxt_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAaaa_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAaaa_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAaaa_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getA6_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getA6_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getA6_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDname_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDname_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDname_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementRRList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.RRList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "a_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ARecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.NSRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cname_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cname_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.CNAMERecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soa_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soa_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SOARecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptr_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptr_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.PTRRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hinfo_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hinfo_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.HINFORecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mx_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mx_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.MXRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txt_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txt_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.TXTRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srv_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srv_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SRVRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KEYRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sig_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sig_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SIGRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nxt_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nxt_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.NXTRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aaaa_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aaaa_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.AAAARecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a6_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "a6_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.A6Record"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dname_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dname_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.DNAMERecord"));
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

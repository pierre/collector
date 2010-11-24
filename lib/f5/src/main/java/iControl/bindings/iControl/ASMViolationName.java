/**
 * ASMViolationName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMViolationName implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ASMViolationName(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIOLATION_EVASION_DETECTED = "VIOLATION_EVASION_DETECTED";
    public static final java.lang.String _VIOLATION_VIRUS_DETECTED = "VIOLATION_VIRUS_DETECTED";
    public static final java.lang.String _VIOLATION_REQUEST_TOO_LONG = "VIOLATION_REQUEST_TOO_LONG";
    public static final java.lang.String _VIOLATION_ILLEGAL_INGRESS_OBJECT = "VIOLATION_ILLEGAL_INGRESS_OBJECT";
    public static final java.lang.String _VIOLATION_PARSER_EXPIRED_INGRESS_OBJECT = "VIOLATION_PARSER_EXPIRED_INGRESS_OBJECT";
    public static final java.lang.String _VIOLATION_RESPONSE_SCRUBBING = "VIOLATION_RESPONSE_SCRUBBING";
    public static final java.lang.String _VIOLATION_ILLEGAL_SOAP_ATTACHMENT = "VIOLATION_ILLEGAL_SOAP_ATTACHMENT";
    public static final java.lang.String _VIOLATION_MISSING_MANDATORY_HEADER = "VIOLATION_MISSING_MANDATORY_HEADER";
    public static final java.lang.String _VIOLATION_HTTP_SANITY_CHECK_FAILED = "VIOLATION_HTTP_SANITY_CHECK_FAILED";
    public static final java.lang.String _VIOLATION_CHAR_CONV = "VIOLATION_CHAR_CONV";
    public static final java.lang.String _VIOLATION_CSRF = "VIOLATION_CSRF";
    public static final java.lang.String _VIOLATION_MALFORMED_XML = "VIOLATION_MALFORMED_XML";
    public static final java.lang.String _VIOLATION_XML_WSDL = "VIOLATION_XML_WSDL";
    public static final java.lang.String _VIOLATION_XML_FORMAT_SETTING = "VIOLATION_XML_FORMAT_SETTING";
    public static final java.lang.String _VIOLATION_PARSER_FAILED_SOAP_SECURITY = "VIOLATION_PARSER_FAILED_SOAP_SECURITY";
    public static final java.lang.String _VIOLATION_SOAP_METHOD_NOT_ALLOWED = "VIOLATION_SOAP_METHOD_NOT_ALLOWED";
    public static final java.lang.String _VIOLATION_BRUTE_FORCE_ATTACK_DETECTED = "VIOLATION_BRUTE_FORCE_ATTACK_DETECTED";
    public static final java.lang.String _VIOLATION_WEB_SCRAPING_DETECTED = "VIOLATION_WEB_SCRAPING_DETECTED";
    public static final java.lang.String _VIOLATION_CSRF_EXPIRED = "VIOLATION_CSRF_EXPIRED";
    public static final java.lang.String _VIOLATION_OBJ_LEN = "VIOLATION_OBJ_LEN";
    public static final java.lang.String _VIOLATION_COOKIE_LEN = "VIOLATION_COOKIE_LEN";
    public static final java.lang.String _VIOLATION_REQ_LEN = "VIOLATION_REQ_LEN";
    public static final java.lang.String _VIOLATION_QS_LEN = "VIOLATION_QS_LEN";
    public static final java.lang.String _VIOLATION_POST_DATA_LEN = "VIOLATION_POST_DATA_LEN";
    public static final java.lang.String _VIOLATION_MULTI_PART_PARAM_VAL = "VIOLATION_MULTI_PART_PARAM_VAL";
    public static final java.lang.String _VIOLATION_HEADER_LEN = "VIOLATION_HEADER_LEN";
    public static final java.lang.String _VIOLATION_REPEATED_PARAMETER_NAME = "VIOLATION_REPEATED_PARAMETER_NAME";
    public static final java.lang.String _VIOLATION_METACHAR_IN_OBJ = "VIOLATION_METACHAR_IN_OBJ";
    public static final java.lang.String _VIOLATION_METACHAR_IN_PARAM_NAME = "VIOLATION_METACHAR_IN_PARAM_NAME";
    public static final java.lang.String _VIOLATION_METACHAR_IN_DEF_PARAM = "VIOLATION_METACHAR_IN_DEF_PARAM";
    public static final java.lang.String _VIOLATION_OBJ_TYPE = "VIOLATION_OBJ_TYPE";
    public static final java.lang.String _VIOLATION_OBJ_DOESNT_EXIST = "VIOLATION_OBJ_DOESNT_EXIST";
    public static final java.lang.String _VIOLATION_FLOW_TO_OBJ = "VIOLATION_FLOW_TO_OBJ";
    public static final java.lang.String _VIOLATION_ILLEGAL_METHOD = "VIOLATION_ILLEGAL_METHOD";
    public static final java.lang.String _VIOLATION_SESSSION_ID_IN_URL = "VIOLATION_SESSSION_ID_IN_URL";
    public static final java.lang.String _VIOLATION_QS_OR_POST_DATA = "VIOLATION_QS_OR_POST_DATA";
    public static final java.lang.String _VIOLATION_PARAM = "VIOLATION_PARAM";
    public static final java.lang.String _VIOLATION_EMPTY_PARAM_VALUE = "VIOLATION_EMPTY_PARAM_VALUE";
    public static final java.lang.String _VIOLATION_STATIC_PARAM_VALUE = "VIOLATION_STATIC_PARAM_VALUE";
    public static final java.lang.String _VIOLATION_DYN_PARAM_VALUE = "VIOLATION_DYN_PARAM_VALUE";
    public static final java.lang.String _VIOLATION_PARAM_VALUE_LEN = "VIOLATION_PARAM_VALUE_LEN";
    public static final java.lang.String _VIOLATION_PARAM_DATA_TYPE = "VIOLATION_PARAM_DATA_TYPE";
    public static final java.lang.String _VIOLATION_PARAM_NUMERIC_VALUE = "VIOLATION_PARAM_NUMERIC_VALUE";
    public static final java.lang.String _VIOLATION_NUM_OF_MANDATORY_PARAMS = "VIOLATION_NUM_OF_MANDATORY_PARAMS";
    public static final java.lang.String _VIOLATION_PARAM_VALUE_NOT_MATCHING_REGEX = "VIOLATION_PARAM_VALUE_NOT_MATCHING_REGEX";
    public static final java.lang.String _VIOLATION_MOD_ASM_COOKIE = "VIOLATION_MOD_ASM_COOKIE";
    public static final java.lang.String _VIOLATION_MOD_DOMAIN_COOKIE = "VIOLATION_MOD_DOMAIN_COOKIE";
    public static final java.lang.String _VIOLATION_NOT_RFC_COOKIE = "VIOLATION_NOT_RFC_COOKIE";
    public static final java.lang.String _VIOLATION_ENTRY_POINT = "VIOLATION_ENTRY_POINT";
    public static final java.lang.String _VIOLATION_MSG_KEY = "VIOLATION_MSG_KEY";
    public static final java.lang.String _VIOLATION_EXPIRED_TIMESTAMP = "VIOLATION_EXPIRED_TIMESTAMP";
    public static final java.lang.String _VIOLATION_METACHAR_IN_HEADER = "VIOLATION_METACHAR_IN_HEADER";
    public static final java.lang.String _VIOLATION_HTTP_STATUS_IN_RESPONSE = "VIOLATION_HTTP_STATUS_IN_RESPONSE";
    public static final ASMViolationName VIOLATION_EVASION_DETECTED = new ASMViolationName(_VIOLATION_EVASION_DETECTED);
    public static final ASMViolationName VIOLATION_VIRUS_DETECTED = new ASMViolationName(_VIOLATION_VIRUS_DETECTED);
    public static final ASMViolationName VIOLATION_REQUEST_TOO_LONG = new ASMViolationName(_VIOLATION_REQUEST_TOO_LONG);
    public static final ASMViolationName VIOLATION_ILLEGAL_INGRESS_OBJECT = new ASMViolationName(_VIOLATION_ILLEGAL_INGRESS_OBJECT);
    public static final ASMViolationName VIOLATION_PARSER_EXPIRED_INGRESS_OBJECT = new ASMViolationName(_VIOLATION_PARSER_EXPIRED_INGRESS_OBJECT);
    public static final ASMViolationName VIOLATION_RESPONSE_SCRUBBING = new ASMViolationName(_VIOLATION_RESPONSE_SCRUBBING);
    public static final ASMViolationName VIOLATION_ILLEGAL_SOAP_ATTACHMENT = new ASMViolationName(_VIOLATION_ILLEGAL_SOAP_ATTACHMENT);
    public static final ASMViolationName VIOLATION_MISSING_MANDATORY_HEADER = new ASMViolationName(_VIOLATION_MISSING_MANDATORY_HEADER);
    public static final ASMViolationName VIOLATION_HTTP_SANITY_CHECK_FAILED = new ASMViolationName(_VIOLATION_HTTP_SANITY_CHECK_FAILED);
    public static final ASMViolationName VIOLATION_CHAR_CONV = new ASMViolationName(_VIOLATION_CHAR_CONV);
    public static final ASMViolationName VIOLATION_CSRF = new ASMViolationName(_VIOLATION_CSRF);
    public static final ASMViolationName VIOLATION_MALFORMED_XML = new ASMViolationName(_VIOLATION_MALFORMED_XML);
    public static final ASMViolationName VIOLATION_XML_WSDL = new ASMViolationName(_VIOLATION_XML_WSDL);
    public static final ASMViolationName VIOLATION_XML_FORMAT_SETTING = new ASMViolationName(_VIOLATION_XML_FORMAT_SETTING);
    public static final ASMViolationName VIOLATION_PARSER_FAILED_SOAP_SECURITY = new ASMViolationName(_VIOLATION_PARSER_FAILED_SOAP_SECURITY);
    public static final ASMViolationName VIOLATION_SOAP_METHOD_NOT_ALLOWED = new ASMViolationName(_VIOLATION_SOAP_METHOD_NOT_ALLOWED);
    public static final ASMViolationName VIOLATION_BRUTE_FORCE_ATTACK_DETECTED = new ASMViolationName(_VIOLATION_BRUTE_FORCE_ATTACK_DETECTED);
    public static final ASMViolationName VIOLATION_WEB_SCRAPING_DETECTED = new ASMViolationName(_VIOLATION_WEB_SCRAPING_DETECTED);
    public static final ASMViolationName VIOLATION_CSRF_EXPIRED = new ASMViolationName(_VIOLATION_CSRF_EXPIRED);
    public static final ASMViolationName VIOLATION_OBJ_LEN = new ASMViolationName(_VIOLATION_OBJ_LEN);
    public static final ASMViolationName VIOLATION_COOKIE_LEN = new ASMViolationName(_VIOLATION_COOKIE_LEN);
    public static final ASMViolationName VIOLATION_REQ_LEN = new ASMViolationName(_VIOLATION_REQ_LEN);
    public static final ASMViolationName VIOLATION_QS_LEN = new ASMViolationName(_VIOLATION_QS_LEN);
    public static final ASMViolationName VIOLATION_POST_DATA_LEN = new ASMViolationName(_VIOLATION_POST_DATA_LEN);
    public static final ASMViolationName VIOLATION_MULTI_PART_PARAM_VAL = new ASMViolationName(_VIOLATION_MULTI_PART_PARAM_VAL);
    public static final ASMViolationName VIOLATION_HEADER_LEN = new ASMViolationName(_VIOLATION_HEADER_LEN);
    public static final ASMViolationName VIOLATION_REPEATED_PARAMETER_NAME = new ASMViolationName(_VIOLATION_REPEATED_PARAMETER_NAME);
    public static final ASMViolationName VIOLATION_METACHAR_IN_OBJ = new ASMViolationName(_VIOLATION_METACHAR_IN_OBJ);
    public static final ASMViolationName VIOLATION_METACHAR_IN_PARAM_NAME = new ASMViolationName(_VIOLATION_METACHAR_IN_PARAM_NAME);
    public static final ASMViolationName VIOLATION_METACHAR_IN_DEF_PARAM = new ASMViolationName(_VIOLATION_METACHAR_IN_DEF_PARAM);
    public static final ASMViolationName VIOLATION_OBJ_TYPE = new ASMViolationName(_VIOLATION_OBJ_TYPE);
    public static final ASMViolationName VIOLATION_OBJ_DOESNT_EXIST = new ASMViolationName(_VIOLATION_OBJ_DOESNT_EXIST);
    public static final ASMViolationName VIOLATION_FLOW_TO_OBJ = new ASMViolationName(_VIOLATION_FLOW_TO_OBJ);
    public static final ASMViolationName VIOLATION_ILLEGAL_METHOD = new ASMViolationName(_VIOLATION_ILLEGAL_METHOD);
    public static final ASMViolationName VIOLATION_SESSSION_ID_IN_URL = new ASMViolationName(_VIOLATION_SESSSION_ID_IN_URL);
    public static final ASMViolationName VIOLATION_QS_OR_POST_DATA = new ASMViolationName(_VIOLATION_QS_OR_POST_DATA);
    public static final ASMViolationName VIOLATION_PARAM = new ASMViolationName(_VIOLATION_PARAM);
    public static final ASMViolationName VIOLATION_EMPTY_PARAM_VALUE = new ASMViolationName(_VIOLATION_EMPTY_PARAM_VALUE);
    public static final ASMViolationName VIOLATION_STATIC_PARAM_VALUE = new ASMViolationName(_VIOLATION_STATIC_PARAM_VALUE);
    public static final ASMViolationName VIOLATION_DYN_PARAM_VALUE = new ASMViolationName(_VIOLATION_DYN_PARAM_VALUE);
    public static final ASMViolationName VIOLATION_PARAM_VALUE_LEN = new ASMViolationName(_VIOLATION_PARAM_VALUE_LEN);
    public static final ASMViolationName VIOLATION_PARAM_DATA_TYPE = new ASMViolationName(_VIOLATION_PARAM_DATA_TYPE);
    public static final ASMViolationName VIOLATION_PARAM_NUMERIC_VALUE = new ASMViolationName(_VIOLATION_PARAM_NUMERIC_VALUE);
    public static final ASMViolationName VIOLATION_NUM_OF_MANDATORY_PARAMS = new ASMViolationName(_VIOLATION_NUM_OF_MANDATORY_PARAMS);
    public static final ASMViolationName VIOLATION_PARAM_VALUE_NOT_MATCHING_REGEX = new ASMViolationName(_VIOLATION_PARAM_VALUE_NOT_MATCHING_REGEX);
    public static final ASMViolationName VIOLATION_MOD_ASM_COOKIE = new ASMViolationName(_VIOLATION_MOD_ASM_COOKIE);
    public static final ASMViolationName VIOLATION_MOD_DOMAIN_COOKIE = new ASMViolationName(_VIOLATION_MOD_DOMAIN_COOKIE);
    public static final ASMViolationName VIOLATION_NOT_RFC_COOKIE = new ASMViolationName(_VIOLATION_NOT_RFC_COOKIE);
    public static final ASMViolationName VIOLATION_ENTRY_POINT = new ASMViolationName(_VIOLATION_ENTRY_POINT);
    public static final ASMViolationName VIOLATION_MSG_KEY = new ASMViolationName(_VIOLATION_MSG_KEY);
    public static final ASMViolationName VIOLATION_EXPIRED_TIMESTAMP = new ASMViolationName(_VIOLATION_EXPIRED_TIMESTAMP);
    public static final ASMViolationName VIOLATION_METACHAR_IN_HEADER = new ASMViolationName(_VIOLATION_METACHAR_IN_HEADER);
    public static final ASMViolationName VIOLATION_HTTP_STATUS_IN_RESPONSE = new ASMViolationName(_VIOLATION_HTTP_STATUS_IN_RESPONSE);
    public java.lang.String getValue() { return _value_;}
    public static ASMViolationName fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ASMViolationName enumeration = (ASMViolationName)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ASMViolationName fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASMViolationName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.ViolationName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

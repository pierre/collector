/**
 * ASMWebApplicationLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMWebApplicationLanguage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ASMWebApplicationLanguage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LANGUAGE_UNDEFINED = "LANGUAGE_UNDEFINED";
    public static final java.lang.String _UNICODE_UTF_8 = "UNICODE_UTF_8";
    public static final java.lang.String _WESTERN_EUROPEAN_ISO_8859_1 = "WESTERN_EUROPEAN_ISO_8859_1";
    public static final java.lang.String _WESTERN_EUROPEAN_WINDOWS_1252 = "WESTERN_EUROPEAN_WINDOWS_1252";
    public static final java.lang.String _WESTERN_EUROPEAN_ISO_8859_15 = "WESTERN_EUROPEAN_ISO_8859_15";
    public static final java.lang.String _CENTRAL_EUROPEAN_ISO_8859_2 = "CENTRAL_EUROPEAN_ISO_8859_2";
    public static final java.lang.String _CENTRAL_EUROPEAN_WINDOWS_1250 = "CENTRAL_EUROPEAN_WINDOWS_1250";
    public static final java.lang.String _SOUTH_EUROPEAN_ISO_8859_3 = "SOUTH_EUROPEAN_ISO_8859_3";
    public static final java.lang.String _GREEK_ISO_8859_7 = "GREEK_ISO_8859_7";
    public static final java.lang.String _GREEK_WINDOWS_1253 = "GREEK_WINDOWS_1253";
    public static final java.lang.String _NORDIC_ISO_8859_10 = "NORDIC_ISO_8859_10";
    public static final java.lang.String _CYRILLIC_WINDOWS_1251 = "CYRILLIC_WINDOWS_1251";
    public static final java.lang.String _CYRILLIC_KOI8_R = "CYRILLIC_KOI8_R";
    public static final java.lang.String _CYRILLIC_ISO_8859_5 = "CYRILLIC_ISO_8859_5";
    public static final java.lang.String _ROMANIAN_ISO_8859_16 = "ROMANIAN_ISO_8859_16";
    public static final java.lang.String _BALTIC_ISO_8859_4 = "BALTIC_ISO_8859_4";
    public static final java.lang.String _BALTIC_ISO_8859_13 = "BALTIC_ISO_8859_13";
    public static final java.lang.String _BALTIC_WINDOWS_1257 = "BALTIC_WINDOWS_1257";
    public static final java.lang.String _HEBREW_WINDOWS_1255 = "HEBREW_WINDOWS_1255";
    public static final java.lang.String _HEBREW_ISO_8859_8 = "HEBREW_ISO_8859_8";
    public static final java.lang.String _JAPANESE_SHIFT_JIS = "JAPANESE_SHIFT_JIS";
    public static final java.lang.String _JAPANESE_EUC_JP = "JAPANESE_EUC_JP";
    public static final java.lang.String _KOREAN_EUC_KR = "KOREAN_EUC_KR";
    public static final java.lang.String _CHINESE_BIG5 = "CHINESE_BIG5";
    public static final java.lang.String _CHINESE_GB2312 = "CHINESE_GB2312";
    public static final java.lang.String _THAI_CP874 = "THAI_CP874";
    public static final java.lang.String _ARABIC_ISO_8859_6 = "ARABIC_ISO_8859_6";
    public static final java.lang.String _CHINESE_GBK = "CHINESE_GBK";
    public static final java.lang.String _CHINESE_GB18030 = "CHINESE_GB18030";
    public static final ASMWebApplicationLanguage LANGUAGE_UNDEFINED = new ASMWebApplicationLanguage(_LANGUAGE_UNDEFINED);
    public static final ASMWebApplicationLanguage UNICODE_UTF_8 = new ASMWebApplicationLanguage(_UNICODE_UTF_8);
    public static final ASMWebApplicationLanguage WESTERN_EUROPEAN_ISO_8859_1 = new ASMWebApplicationLanguage(_WESTERN_EUROPEAN_ISO_8859_1);
    public static final ASMWebApplicationLanguage WESTERN_EUROPEAN_WINDOWS_1252 = new ASMWebApplicationLanguage(_WESTERN_EUROPEAN_WINDOWS_1252);
    public static final ASMWebApplicationLanguage WESTERN_EUROPEAN_ISO_8859_15 = new ASMWebApplicationLanguage(_WESTERN_EUROPEAN_ISO_8859_15);
    public static final ASMWebApplicationLanguage CENTRAL_EUROPEAN_ISO_8859_2 = new ASMWebApplicationLanguage(_CENTRAL_EUROPEAN_ISO_8859_2);
    public static final ASMWebApplicationLanguage CENTRAL_EUROPEAN_WINDOWS_1250 = new ASMWebApplicationLanguage(_CENTRAL_EUROPEAN_WINDOWS_1250);
    public static final ASMWebApplicationLanguage SOUTH_EUROPEAN_ISO_8859_3 = new ASMWebApplicationLanguage(_SOUTH_EUROPEAN_ISO_8859_3);
    public static final ASMWebApplicationLanguage GREEK_ISO_8859_7 = new ASMWebApplicationLanguage(_GREEK_ISO_8859_7);
    public static final ASMWebApplicationLanguage GREEK_WINDOWS_1253 = new ASMWebApplicationLanguage(_GREEK_WINDOWS_1253);
    public static final ASMWebApplicationLanguage NORDIC_ISO_8859_10 = new ASMWebApplicationLanguage(_NORDIC_ISO_8859_10);
    public static final ASMWebApplicationLanguage CYRILLIC_WINDOWS_1251 = new ASMWebApplicationLanguage(_CYRILLIC_WINDOWS_1251);
    public static final ASMWebApplicationLanguage CYRILLIC_KOI8_R = new ASMWebApplicationLanguage(_CYRILLIC_KOI8_R);
    public static final ASMWebApplicationLanguage CYRILLIC_ISO_8859_5 = new ASMWebApplicationLanguage(_CYRILLIC_ISO_8859_5);
    public static final ASMWebApplicationLanguage ROMANIAN_ISO_8859_16 = new ASMWebApplicationLanguage(_ROMANIAN_ISO_8859_16);
    public static final ASMWebApplicationLanguage BALTIC_ISO_8859_4 = new ASMWebApplicationLanguage(_BALTIC_ISO_8859_4);
    public static final ASMWebApplicationLanguage BALTIC_ISO_8859_13 = new ASMWebApplicationLanguage(_BALTIC_ISO_8859_13);
    public static final ASMWebApplicationLanguage BALTIC_WINDOWS_1257 = new ASMWebApplicationLanguage(_BALTIC_WINDOWS_1257);
    public static final ASMWebApplicationLanguage HEBREW_WINDOWS_1255 = new ASMWebApplicationLanguage(_HEBREW_WINDOWS_1255);
    public static final ASMWebApplicationLanguage HEBREW_ISO_8859_8 = new ASMWebApplicationLanguage(_HEBREW_ISO_8859_8);
    public static final ASMWebApplicationLanguage JAPANESE_SHIFT_JIS = new ASMWebApplicationLanguage(_JAPANESE_SHIFT_JIS);
    public static final ASMWebApplicationLanguage JAPANESE_EUC_JP = new ASMWebApplicationLanguage(_JAPANESE_EUC_JP);
    public static final ASMWebApplicationLanguage KOREAN_EUC_KR = new ASMWebApplicationLanguage(_KOREAN_EUC_KR);
    public static final ASMWebApplicationLanguage CHINESE_BIG5 = new ASMWebApplicationLanguage(_CHINESE_BIG5);
    public static final ASMWebApplicationLanguage CHINESE_GB2312 = new ASMWebApplicationLanguage(_CHINESE_GB2312);
    public static final ASMWebApplicationLanguage THAI_CP874 = new ASMWebApplicationLanguage(_THAI_CP874);
    public static final ASMWebApplicationLanguage ARABIC_ISO_8859_6 = new ASMWebApplicationLanguage(_ARABIC_ISO_8859_6);
    public static final ASMWebApplicationLanguage CHINESE_GBK = new ASMWebApplicationLanguage(_CHINESE_GBK);
    public static final ASMWebApplicationLanguage CHINESE_GB18030 = new ASMWebApplicationLanguage(_CHINESE_GB18030);
    public java.lang.String getValue() { return _value_;}
    public static ASMWebApplicationLanguage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ASMWebApplicationLanguage enumeration = (ASMWebApplicationLanguage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ASMWebApplicationLanguage fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ASMWebApplicationLanguage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.WebApplicationLanguage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

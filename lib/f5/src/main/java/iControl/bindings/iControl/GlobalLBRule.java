/**
 * GlobalLBRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBRule extends javax.xml.rpc.Service {

/**
 * The Rule interface enables you to manipulate a Global load balancer's
 * rules.  For example, use the Rule interface to get a list of all rules,
 * create rules, 
 *  delete rules, modify rules, and query rules.
 */
    public java.lang.String getGlobalLBRulePortAddress();

    public iControl.GlobalLBRulePortType getGlobalLBRulePort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBRulePortType getGlobalLBRulePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

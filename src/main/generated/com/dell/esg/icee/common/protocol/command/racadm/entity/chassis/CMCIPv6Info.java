//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cMCIPv6Info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cMCIPv6Info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPv6_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Autoconfiguration_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Link_Local_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Current_IPv6_Address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Current_IPv6_Gateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Current_IPv6_DNS_Server_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Current_IPv6_DNS_Server_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNS_Servers_from_DHCPv6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cMCIPv6Info", propOrder = {
    "iPv6Enabled",
    "autoconfigurationEnabled",
    "linkLocalAddress",
    "currentIPv6Address1",
    "currentIPv6Gateway",
    "currentIPv6DNSServer1",
    "currentIPv6DNSServer2",
    "dnsServersFromDHCPv6"
})
public class CMCIPv6Info {

    @XmlElement(name = "IPv6_Enabled")
    protected String iPv6Enabled;
    @XmlElement(name = "Autoconfiguration_Enabled")
    protected String autoconfigurationEnabled;
    @XmlElement(name = "Link_Local_Address")
    protected String linkLocalAddress;
    @XmlElement(name = "Current_IPv6_Address_1")
    protected String currentIPv6Address1;
    @XmlElement(name = "Current_IPv6_Gateway")
    protected String currentIPv6Gateway;
    @XmlElement(name = "Current_IPv6_DNS_Server_1")
    protected String currentIPv6DNSServer1;
    @XmlElement(name = "Current_IPv6_DNS_Server_2")
    protected String currentIPv6DNSServer2;
    @XmlElement(name = "DNS_Servers_from_DHCPv6")
    protected String dnsServersFromDHCPv6;

    /**
     * Gets the value of the iPv6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6Enabled() {
        return iPv6Enabled;
    }

    /**
     * Sets the value of the iPv6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv6Enabled(String value) {
        this.iPv6Enabled = value;
    }

    /**
     * Gets the value of the autoconfigurationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoconfigurationEnabled() {
        return autoconfigurationEnabled;
    }

    /**
     * Sets the value of the autoconfigurationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoconfigurationEnabled(String value) {
        this.autoconfigurationEnabled = value;
    }

    /**
     * Gets the value of the linkLocalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkLocalAddress() {
        return linkLocalAddress;
    }

    /**
     * Sets the value of the linkLocalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkLocalAddress(String value) {
        this.linkLocalAddress = value;
    }

    /**
     * Gets the value of the currentIPv6Address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPv6Address1() {
        return currentIPv6Address1;
    }

    /**
     * Sets the value of the currentIPv6Address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPv6Address1(String value) {
        this.currentIPv6Address1 = value;
    }

    /**
     * Gets the value of the currentIPv6Gateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPv6Gateway() {
        return currentIPv6Gateway;
    }

    /**
     * Sets the value of the currentIPv6Gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPv6Gateway(String value) {
        this.currentIPv6Gateway = value;
    }

    /**
     * Gets the value of the currentIPv6DNSServer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPv6DNSServer1() {
        return currentIPv6DNSServer1;
    }

    /**
     * Sets the value of the currentIPv6DNSServer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPv6DNSServer1(String value) {
        this.currentIPv6DNSServer1 = value;
    }

    /**
     * Gets the value of the currentIPv6DNSServer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIPv6DNSServer2() {
        return currentIPv6DNSServer2;
    }

    /**
     * Sets the value of the currentIPv6DNSServer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIPv6DNSServer2(String value) {
        this.currentIPv6DNSServer2 = value;
    }

    /**
     * Gets the value of the dnsServersFromDHCPv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNSServersFromDHCPv6() {
        return dnsServersFromDHCPv6;
    }

    /**
     * Sets the value of the dnsServersFromDHCPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNSServersFromDHCPv6(String value) {
        this.dnsServersFromDHCPv6 = value;
    }

}

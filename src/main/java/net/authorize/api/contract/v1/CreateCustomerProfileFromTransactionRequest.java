//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiRequest">
 *       &lt;sequence>
 *         &lt;element name="transId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString"/>
 *         &lt;element name="customer" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileBaseType" minOccurs="0"/>
 *         &lt;element name="customerProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="defaultPaymentProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultShippingAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="profileType" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transId",
    "customer",
    "customerProfileId",
    "defaultPaymentProfile",
    "defaultShippingAddress",
    "profileType"
})
@XmlRootElement(name = "createCustomerProfileFromTransactionRequest")
public class CreateCustomerProfileFromTransactionRequest
    extends ANetApiRequest
{

    @XmlElement(required = true)
    protected String transId;
    protected CustomerProfileBaseType customer;
    protected String customerProfileId;
    protected Boolean defaultPaymentProfile;
    protected Boolean defaultShippingAddress;
    @XmlSchemaType(name = "string")
    protected CustomerProfileTypeEnum profileType;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileBaseType }
     *     
     */
    public CustomerProfileBaseType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileBaseType }
     *     
     */
    public void setCustomer(CustomerProfileBaseType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the defaultPaymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultPaymentProfile() {
        return defaultPaymentProfile;
    }

    /**
     * Sets the value of the defaultPaymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultPaymentProfile(Boolean value) {
        this.defaultPaymentProfile = value;
    }

    /**
     * Gets the value of the defaultShippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    /**
     * Sets the value of the defaultShippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultShippingAddress(Boolean value) {
        this.defaultShippingAddress = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileTypeEnum }
     *     
     */
    public CustomerProfileTypeEnum getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileTypeEnum }
     *     
     */
    public void setProfileType(CustomerProfileTypeEnum value) {
        this.profileType = value;
    }

}
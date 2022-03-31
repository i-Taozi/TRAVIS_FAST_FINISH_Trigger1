//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriptionCustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriptionCustomerProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileExType">
 *       &lt;sequence>
 *         &lt;element name="paymentProfile" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerPaymentProfileMaskedType" minOccurs="0"/>
 *         &lt;element name="shippingProfile" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressExType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriptionCustomerProfileType", propOrder = {
    "paymentProfile",
    "shippingProfile"
})
public class SubscriptionCustomerProfileType
    extends CustomerProfileExType
{

    protected CustomerPaymentProfileMaskedType paymentProfile;
    protected CustomerAddressExType shippingProfile;

    /**
     * Gets the value of the paymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentProfileMaskedType }
     *     
     */
    public CustomerPaymentProfileMaskedType getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Sets the value of the paymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentProfileMaskedType }
     *     
     */
    public void setPaymentProfile(CustomerPaymentProfileMaskedType value) {
        this.paymentProfile = value;
    }

    /**
     * Gets the value of the shippingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressExType }
     *     
     */
    public CustomerAddressExType getShippingProfile() {
        return shippingProfile;
    }

    /**
     * Sets the value of the shippingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressExType }
     *     
     */
    public void setShippingProfile(CustomerAddressExType value) {
        this.shippingProfile = value;
    }

}
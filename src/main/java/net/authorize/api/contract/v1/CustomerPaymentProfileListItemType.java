//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerPaymentProfileListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerPaymentProfileListItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultPaymentProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerPaymentProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="customerProfileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billTo" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressType"/>
 *         &lt;element name="payment" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}paymentMaskedType"/>
 *         &lt;element name="originalNetworkTransId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}networkTransId" minOccurs="0"/>
 *         &lt;element name="originalAuthAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.00"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerPaymentProfileListItemType", propOrder = {
    "defaultPaymentProfile",
    "customerPaymentProfileId",
    "customerProfileId",
    "billTo",
    "payment",
    "originalNetworkTransId",
    "originalAuthAmount"
})
public class CustomerPaymentProfileListItemType {

    protected Boolean defaultPaymentProfile;
    protected int customerPaymentProfileId;
    protected int customerProfileId;
    @XmlElement(required = true)
    protected CustomerAddressType billTo;
    @XmlElement(required = true)
    protected PaymentMaskedType payment;
    protected String originalNetworkTransId;
    protected BigDecimal originalAuthAmount;

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
     * Gets the value of the customerPaymentProfileId property.
     * 
     */
    public int getCustomerPaymentProfileId() {
        return customerPaymentProfileId;
    }

    /**
     * Sets the value of the customerPaymentProfileId property.
     * 
     */
    public void setCustomerPaymentProfileId(int value) {
        this.customerPaymentProfileId = value;
    }

    /**
     * Gets the value of the customerProfileId property.
     * 
     */
    public int getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     */
    public void setCustomerProfileId(int value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setBillTo(CustomerAddressType value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMaskedType }
     *     
     */
    public PaymentMaskedType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMaskedType }
     *     
     */
    public void setPayment(PaymentMaskedType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the originalNetworkTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalNetworkTransId() {
        return originalNetworkTransId;
    }

    /**
     * Sets the value of the originalNetworkTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalNetworkTransId(String value) {
        this.originalNetworkTransId = value;
    }

    /**
     * Gets the value of the originalAuthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalAuthAmount() {
        return originalAuthAmount;
    }

    /**
     * Sets the value of the originalAuthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalAuthAmount(BigDecimal value) {
        this.originalAuthAmount = value;
    }

}
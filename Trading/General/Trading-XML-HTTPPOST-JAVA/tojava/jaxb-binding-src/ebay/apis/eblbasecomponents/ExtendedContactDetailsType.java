//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains extended contact information for an eBay user.
 * 		
 * 
 * <p>Java class for ExtendedContactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedContactDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactHoursDetails" type="{urn:ebay:apis:eBLBaseComponents}ContactHoursDetailsType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayPerLeadPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedContactDetailsType", propOrder = {
    "contactHoursDetails",
    "classifiedAdContactByEmailEnabled",
    "payPerLeadPhoneNumber"
})
public class ExtendedContactDetailsType {

    @XmlElement(name = "ContactHoursDetails")
    protected ContactHoursDetailsType contactHoursDetails;
    @XmlElement(name = "ClassifiedAdContactByEmailEnabled")
    protected Boolean classifiedAdContactByEmailEnabled;
    @XmlElement(name = "PayPerLeadPhoneNumber")
    protected String payPerLeadPhoneNumber;

    /**
     * Gets the value of the contactHoursDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactHoursDetailsType }
     *     
     */
    public ContactHoursDetailsType getContactHoursDetails() {
        return contactHoursDetails;
    }

    /**
     * Sets the value of the contactHoursDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactHoursDetailsType }
     *     
     */
    public void setContactHoursDetails(ContactHoursDetailsType value) {
        this.contactHoursDetails = value;
    }

    /**
     * Gets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByEmailEnabled() {
        return classifiedAdContactByEmailEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByEmailEnabled(Boolean value) {
        this.classifiedAdContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the payPerLeadPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPerLeadPhoneNumber() {
        return payPerLeadPhoneNumber;
    }

    /**
     * Sets the value of the payPerLeadPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPerLeadPhoneNumber(String value) {
        this.payPerLeadPhoneNumber = value;
    }

}

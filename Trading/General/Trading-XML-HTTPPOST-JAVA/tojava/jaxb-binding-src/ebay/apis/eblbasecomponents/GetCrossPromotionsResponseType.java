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
 * 				Returns a list of either upsell or cross-sell items for a given item ID.
 * 				The list can be filtered by the viewer's role, either buyer or seller.
 * 			
 * 
 * <p>Java class for GetCrossPromotionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCrossPromotionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CrossPromotion" type="{urn:ebay:apis:eBLBaseComponents}CrossPromotionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrossPromotionsResponseType", propOrder = {
    "crossPromotion"
})
public class GetCrossPromotionsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CrossPromotion")
    protected CrossPromotionsType crossPromotion;

    /**
     * Gets the value of the crossPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link CrossPromotionsType }
     *     
     */
    public CrossPromotionsType getCrossPromotion() {
        return crossPromotion;
    }

    /**
     * Sets the value of the crossPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossPromotionsType }
     *     
     */
    public void setCrossPromotion(CrossPromotionsType value) {
        this.crossPromotion = value;
    }

}

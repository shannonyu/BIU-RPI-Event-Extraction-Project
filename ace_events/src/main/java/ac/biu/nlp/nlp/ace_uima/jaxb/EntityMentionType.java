//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.29 at 01:36:36 PM IST 
//


package ac.biu.nlp.nlp.ace_uima.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityMentionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMentionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extent" type="{}ExtentType"/>
 *         &lt;element name="head" type="{}ExtentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * - Modified by Ofer Bronstein July 2013 - added ID, TYPE, LDCTYPE, LDCATR
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityMentionType", propOrder = {
    "extent",
    "head"
})
public class EntityMentionType {

    @XmlElement(required = true)
    protected ExtentType extent;
    @XmlElement(required = true)
    protected ExtentType head;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "TYPE", required = true)
    protected String type;
    @XmlAttribute(name = "LDCTYPE", required = true)
    protected String ldctype;
    @XmlAttribute(name = "LDCATR", required = true)
    protected String ldcatr;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link ExtentType }
     *     
     */
    public ExtentType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentType }
     *     
     */
    public void setExtent(ExtentType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link ExtentType }
     *     
     */
    public ExtentType getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentType }
     *     
     */
    public void setHead(ExtentType value) {
        this.head = value;
    }
    
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the ldctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDCTYPE() {
        return ldctype;
    }

    /**
     * Sets the value of the ldctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDCTYPE(String value) {
        this.ldctype = value;
    }

    /**
     * Gets the value of the ldcatr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDCATR() {
        return ldcatr;
    }

    /**
     * Sets the value of the ldcatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDCATR(String value) {
        this.ldcatr = value;
    }

}

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
 * <p>Java class for raidController complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="raidController">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="section_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriverVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RebuildRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BgiRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckConsistencyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReconstructRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatrolReadRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatrolReadMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatrolReadState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckConsistencyMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoadBalanceSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopybackMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreservedCache" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CacheMemorySize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersistHotspare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpindownUnconfiguredDrives" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpindownHotspare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timeintervalforspindown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncryptionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SasAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciSubdeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciSubvendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PciFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlotLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlotType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapableSpeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LearnMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighAvailabilityMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "raidController", propOrder = {
    "sectionIdentifier",
    "status",
    "rollupStatus",
    "name",
    "firmwareVersion",
    "driverVersion",
    "rebuildRate",
    "bgiRate",
    "checkConsistencyRate",
    "reconstructRate",
    "patrolReadRate",
    "patrolReadMode",
    "patrolReadState",
    "checkConsistencyMode",
    "loadBalanceSetting",
    "copybackMode",
    "preservedCache",
    "cacheMemorySize",
    "persistHotspare",
    "spindownUnconfiguredDrives",
    "spindownHotspare",
    "timeintervalforspindown",
    "securityStatus",
    "encryptionMode",
    "sasAddress",
    "pciDeviceId",
    "pciSubdeviceId",
    "pciVendorId",
    "pciSubvendorId",
    "pciBus",
    "pciDevice",
    "pciFunction",
    "busWidth",
    "slotLength",
    "slotType",
    "capableSpeeds",
    "learnMode",
    "highAvailabilityMode"
})
public class RaidController {

    @XmlElement(name = "section_identifier")
    protected String sectionIdentifier;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "RollupStatus")
    protected String rollupStatus;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "DriverVersion")
    protected String driverVersion;
    @XmlElement(name = "RebuildRate")
    protected String rebuildRate;
    @XmlElement(name = "BgiRate")
    protected String bgiRate;
    @XmlElement(name = "CheckConsistencyRate")
    protected String checkConsistencyRate;
    @XmlElement(name = "ReconstructRate")
    protected String reconstructRate;
    @XmlElement(name = "PatrolReadRate")
    protected String patrolReadRate;
    @XmlElement(name = "PatrolReadMode")
    protected String patrolReadMode;
    @XmlElement(name = "PatrolReadState")
    protected String patrolReadState;
    @XmlElement(name = "CheckConsistencyMode")
    protected String checkConsistencyMode;
    @XmlElement(name = "LoadBalanceSetting")
    protected String loadBalanceSetting;
    @XmlElement(name = "CopybackMode")
    protected String copybackMode;
    @XmlElement(name = "PreservedCache")
    protected String preservedCache;
    @XmlElement(name = "CacheMemorySize")
    protected String cacheMemorySize;
    @XmlElement(name = "PersistHotspare")
    protected String persistHotspare;
    @XmlElement(name = "SpindownUnconfiguredDrives")
    protected String spindownUnconfiguredDrives;
    @XmlElement(name = "SpindownHotspare")
    protected String spindownHotspare;
    @XmlElement(name = "Timeintervalforspindown")
    protected String timeintervalforspindown;
    @XmlElement(name = "SecurityStatus")
    protected String securityStatus;
    @XmlElement(name = "EncryptionMode")
    protected String encryptionMode;
    @XmlElement(name = "SasAddress")
    protected String sasAddress;
    @XmlElement(name = "PciDeviceId")
    protected String pciDeviceId;
    @XmlElement(name = "PciSubdeviceId")
    protected String pciSubdeviceId;
    @XmlElement(name = "PciVendorId")
    protected String pciVendorId;
    @XmlElement(name = "PciSubvendorId")
    protected String pciSubvendorId;
    @XmlElement(name = "PciBus")
    protected String pciBus;
    @XmlElement(name = "PciDevice")
    protected String pciDevice;
    @XmlElement(name = "PciFunction")
    protected String pciFunction;
    @XmlElement(name = "BusWidth")
    protected String busWidth;
    @XmlElement(name = "SlotLength")
    protected String slotLength;
    @XmlElement(name = "SlotType")
    protected String slotType;
    @XmlElement(name = "CapableSpeeds")
    protected String capableSpeeds;
    @XmlElement(name = "LearnMode")
    protected String learnMode;
    @XmlElement(name = "HighAvailabilityMode")
    protected String highAvailabilityMode;

    /**
     * Gets the value of the sectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * Sets the value of the sectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIdentifier(String value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rollupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupStatus() {
        return rollupStatus;
    }

    /**
     * Sets the value of the rollupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupStatus(String value) {
        this.rollupStatus = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the driverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * Sets the value of the driverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverVersion(String value) {
        this.driverVersion = value;
    }

    /**
     * Gets the value of the rebuildRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebuildRate() {
        return rebuildRate;
    }

    /**
     * Sets the value of the rebuildRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebuildRate(String value) {
        this.rebuildRate = value;
    }

    /**
     * Gets the value of the bgiRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgiRate() {
        return bgiRate;
    }

    /**
     * Sets the value of the bgiRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgiRate(String value) {
        this.bgiRate = value;
    }

    /**
     * Gets the value of the checkConsistencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckConsistencyRate() {
        return checkConsistencyRate;
    }

    /**
     * Sets the value of the checkConsistencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckConsistencyRate(String value) {
        this.checkConsistencyRate = value;
    }

    /**
     * Gets the value of the reconstructRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconstructRate() {
        return reconstructRate;
    }

    /**
     * Sets the value of the reconstructRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconstructRate(String value) {
        this.reconstructRate = value;
    }

    /**
     * Gets the value of the patrolReadRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrolReadRate() {
        return patrolReadRate;
    }

    /**
     * Sets the value of the patrolReadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrolReadRate(String value) {
        this.patrolReadRate = value;
    }

    /**
     * Gets the value of the patrolReadMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrolReadMode() {
        return patrolReadMode;
    }

    /**
     * Sets the value of the patrolReadMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrolReadMode(String value) {
        this.patrolReadMode = value;
    }

    /**
     * Gets the value of the patrolReadState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatrolReadState() {
        return patrolReadState;
    }

    /**
     * Sets the value of the patrolReadState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatrolReadState(String value) {
        this.patrolReadState = value;
    }

    /**
     * Gets the value of the checkConsistencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckConsistencyMode() {
        return checkConsistencyMode;
    }

    /**
     * Sets the value of the checkConsistencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckConsistencyMode(String value) {
        this.checkConsistencyMode = value;
    }

    /**
     * Gets the value of the loadBalanceSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadBalanceSetting() {
        return loadBalanceSetting;
    }

    /**
     * Sets the value of the loadBalanceSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadBalanceSetting(String value) {
        this.loadBalanceSetting = value;
    }

    /**
     * Gets the value of the copybackMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopybackMode() {
        return copybackMode;
    }

    /**
     * Sets the value of the copybackMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopybackMode(String value) {
        this.copybackMode = value;
    }

    /**
     * Gets the value of the preservedCache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservedCache() {
        return preservedCache;
    }

    /**
     * Sets the value of the preservedCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservedCache(String value) {
        this.preservedCache = value;
    }

    /**
     * Gets the value of the cacheMemorySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheMemorySize() {
        return cacheMemorySize;
    }

    /**
     * Sets the value of the cacheMemorySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheMemorySize(String value) {
        this.cacheMemorySize = value;
    }

    /**
     * Gets the value of the persistHotspare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistHotspare() {
        return persistHotspare;
    }

    /**
     * Sets the value of the persistHotspare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistHotspare(String value) {
        this.persistHotspare = value;
    }

    /**
     * Gets the value of the spindownUnconfiguredDrives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpindownUnconfiguredDrives() {
        return spindownUnconfiguredDrives;
    }

    /**
     * Sets the value of the spindownUnconfiguredDrives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpindownUnconfiguredDrives(String value) {
        this.spindownUnconfiguredDrives = value;
    }

    /**
     * Gets the value of the spindownHotspare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpindownHotspare() {
        return spindownHotspare;
    }

    /**
     * Sets the value of the spindownHotspare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpindownHotspare(String value) {
        this.spindownHotspare = value;
    }

    /**
     * Gets the value of the timeintervalforspindown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeintervalforspindown() {
        return timeintervalforspindown;
    }

    /**
     * Sets the value of the timeintervalforspindown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeintervalforspindown(String value) {
        this.timeintervalforspindown = value;
    }

    /**
     * Gets the value of the securityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityStatus() {
        return securityStatus;
    }

    /**
     * Sets the value of the securityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityStatus(String value) {
        this.securityStatus = value;
    }

    /**
     * Gets the value of the encryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionMode() {
        return encryptionMode;
    }

    /**
     * Sets the value of the encryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionMode(String value) {
        this.encryptionMode = value;
    }

    /**
     * Gets the value of the sasAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSasAddress() {
        return sasAddress;
    }

    /**
     * Sets the value of the sasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSasAddress(String value) {
        this.sasAddress = value;
    }

    /**
     * Gets the value of the pciDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciDeviceId() {
        return pciDeviceId;
    }

    /**
     * Sets the value of the pciDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciDeviceId(String value) {
        this.pciDeviceId = value;
    }

    /**
     * Gets the value of the pciSubdeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciSubdeviceId() {
        return pciSubdeviceId;
    }

    /**
     * Sets the value of the pciSubdeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciSubdeviceId(String value) {
        this.pciSubdeviceId = value;
    }

    /**
     * Gets the value of the pciVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciVendorId() {
        return pciVendorId;
    }

    /**
     * Sets the value of the pciVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciVendorId(String value) {
        this.pciVendorId = value;
    }

    /**
     * Gets the value of the pciSubvendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciSubvendorId() {
        return pciSubvendorId;
    }

    /**
     * Sets the value of the pciSubvendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciSubvendorId(String value) {
        this.pciSubvendorId = value;
    }

    /**
     * Gets the value of the pciBus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciBus() {
        return pciBus;
    }

    /**
     * Sets the value of the pciBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciBus(String value) {
        this.pciBus = value;
    }

    /**
     * Gets the value of the pciDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciDevice() {
        return pciDevice;
    }

    /**
     * Sets the value of the pciDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciDevice(String value) {
        this.pciDevice = value;
    }

    /**
     * Gets the value of the pciFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciFunction() {
        return pciFunction;
    }

    /**
     * Sets the value of the pciFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciFunction(String value) {
        this.pciFunction = value;
    }

    /**
     * Gets the value of the busWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusWidth() {
        return busWidth;
    }

    /**
     * Sets the value of the busWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusWidth(String value) {
        this.busWidth = value;
    }

    /**
     * Gets the value of the slotLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotLength() {
        return slotLength;
    }

    /**
     * Sets the value of the slotLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotLength(String value) {
        this.slotLength = value;
    }

    /**
     * Gets the value of the slotType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotType() {
        return slotType;
    }

    /**
     * Sets the value of the slotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotType(String value) {
        this.slotType = value;
    }

    /**
     * Gets the value of the capableSpeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapableSpeeds() {
        return capableSpeeds;
    }

    /**
     * Sets the value of the capableSpeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapableSpeeds(String value) {
        this.capableSpeeds = value;
    }

    /**
     * Gets the value of the learnMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnMode() {
        return learnMode;
    }

    /**
     * Sets the value of the learnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnMode(String value) {
        this.learnMode = value;
    }

    /**
     * Gets the value of the highAvailabilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighAvailabilityMode() {
        return highAvailabilityMode;
    }

    /**
     * Sets the value of the highAvailabilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighAvailabilityMode(String value) {
        this.highAvailabilityMode = value;
    }

}
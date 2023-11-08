package com.apmm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.List;


//@Entity(name = "location_details")
//@Table
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDetails {

    public List<bdas> bdas=new ArrayList<>();
    public String name;
    public String locationId;
    public String status;
    public String bdaType;
    //public List<country> country;
    public String geoType;
    public List<parents> parents;
    public String validTo;
    public String huluName;
    public String latitude;
    public String portFlag;
    public String timeZone;
    public String longitude;
    public String validFrom;
    public String restricted;
    public String description;
    public String dialingCode;
    public List<bdaLocations> bdaLocations;
    public String isDuskCity;
    public String olsonTimezone;
    public List<alternateCodes> alternateCodes;
    public List<alternateNames> alternateNames;
    public String subCityParents;
    public String utcOffsetMinutes;
    public String workaroundReason;
    public String daylightSavingEnd;
    public String daylightSavingTime;
    public String daylightSavingStart;
    public String postalCodeMandatory;
    public String dialingCodeDescription;
    public String stateProvinceMandatory;
    public String daylightSavingShiftMinutes;
    public LocationDetails() {
        super();
    }
    public LocationDetails(List<com.apmm.domain.bdas> bdas, String name, String locationId, String status, String bdaType, String geoType, List<com.apmm.domain.parents> parents, String validTo, String huluName, String latitude, String portFlag, String timeZone, String longitude, String validFrom, String restricted, String description, String dialingCode, List<com.apmm.domain.bdaLocations> bdaLocations, String isDuskCity, String olsonTimezone, List<com.apmm.domain.alternateCodes> alternateCodes, List<com.apmm.domain.alternateNames> alternateNames, String subCityParents, String utcOffsetMinutes, String workaroundReason, String daylightSavingEnd, String daylightSavingTime, String daylightSavingStart, String postalCodeMandatory, String dialingCodeDescription, String stateProvinceMandatory, String daylightSavingShiftMinutes) {
        this.bdas = bdas;
        this.name = name;
        this.locationId = locationId;
        this.status = status;
        this.bdaType = bdaType;
        this.geoType = geoType;
        this.parents = parents;
        this.validTo = validTo;
        this.huluName = huluName;
        this.latitude = latitude;
        this.portFlag = portFlag;
        this.timeZone = timeZone;
        this.longitude = longitude;
        this.validFrom = validFrom;
        this.restricted = restricted;
        this.description = description;
        this.dialingCode = dialingCode;
        this.bdaLocations = bdaLocations;
        this.isDuskCity = isDuskCity;
        this.olsonTimezone = olsonTimezone;
        this.alternateCodes = alternateCodes;
        this.alternateNames = alternateNames;
        this.subCityParents = subCityParents;
        this.utcOffsetMinutes = utcOffsetMinutes;
        this.workaroundReason = workaroundReason;
        this.daylightSavingEnd = daylightSavingEnd;
        this.daylightSavingTime = daylightSavingTime;
        this.daylightSavingStart = daylightSavingStart;
        this.postalCodeMandatory = postalCodeMandatory;
        this.dialingCodeDescription = dialingCodeDescription;
        this.stateProvinceMandatory = stateProvinceMandatory;
        this.daylightSavingShiftMinutes = daylightSavingShiftMinutes;
    }

    public List<com.apmm.domain.bdas> getBdas() {
        return bdas;
    }

    public void setBdas(List<com.apmm.domain.bdas> bdas) {
        this.bdas = bdas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBdaType() {
        return bdaType;
    }

    public void setBdaType(String bdaType) {
        this.bdaType = bdaType;
    }

    public String getGeoType() {
        return geoType;
    }

    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    public List<com.apmm.domain.parents> getParents() {
        return parents;
    }

    public void setParents(List<com.apmm.domain.parents> parents) {
        this.parents = parents;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getHuluName() {
        return huluName;
    }

    public void setHuluName(String huluName) {
        this.huluName = huluName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPortFlag() {
        return portFlag;
    }

    public void setPortFlag(String portFlag) {
        this.portFlag = portFlag;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getRestricted() {
        return restricted;
    }

    public void setRestricted(String restricted) {
        this.restricted = restricted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDialingCode() {
        return dialingCode;
    }

    public void setDialingCode(String dialingCode) {
        this.dialingCode = dialingCode;
    }

    public List<com.apmm.domain.bdaLocations> getBdaLocations() {
        return bdaLocations;
    }

    public void setBdaLocations(List<com.apmm.domain.bdaLocations> bdaLocations) {
        this.bdaLocations = bdaLocations;
    }

    public String getIsDuskCity() {
        return isDuskCity;
    }

    public void setIsDuskCity(String isDuskCity) {
        this.isDuskCity = isDuskCity;
    }

    public String getOlsonTimezone() {
        return olsonTimezone;
    }

    public void setOlsonTimezone(String olsonTimezone) {
        this.olsonTimezone = olsonTimezone;
    }

    public List<com.apmm.domain.alternateCodes> getAlternateCodes() {
        return alternateCodes;
    }

    public void setAlternateCodes(List<com.apmm.domain.alternateCodes> alternateCodes) {
        this.alternateCodes = alternateCodes;
    }

    public List<com.apmm.domain.alternateNames> getAlternateNames() {
        return alternateNames;
    }

    public void setAlternateNames(List<com.apmm.domain.alternateNames> alternateNames) {
        this.alternateNames = alternateNames;
    }

    public String getSubCityParents() {
        return subCityParents;
    }

    public void setSubCityParents(String subCityParents) {
        this.subCityParents = subCityParents;
    }

    public String getUtcOffsetMinutes() {
        return utcOffsetMinutes;
    }

    public void setUtcOffsetMinutes(String utcOffsetMinutes) {
        this.utcOffsetMinutes = utcOffsetMinutes;
    }

    public String getWorkaroundReason() {
        return workaroundReason;
    }

    public void setWorkaroundReason(String workaroundReason) {
        this.workaroundReason = workaroundReason;
    }

    public String getDaylightSavingEnd() {
        return daylightSavingEnd;
    }

    public void setDaylightSavingEnd(String daylightSavingEnd) {
        this.daylightSavingEnd = daylightSavingEnd;
    }

    public String getDaylightSavingTime() {
        return daylightSavingTime;
    }

    public void setDaylightSavingTime(String daylightSavingTime) {
        this.daylightSavingTime = daylightSavingTime;
    }

    public String getDaylightSavingStart() {
        return daylightSavingStart;
    }

    public void setDaylightSavingStart(String daylightSavingStart) {
        this.daylightSavingStart = daylightSavingStart;
    }

    public String getPostalCodeMandatory() {
        return postalCodeMandatory;
    }

    public void setPostalCodeMandatory(String postalCodeMandatory) {
        this.postalCodeMandatory = postalCodeMandatory;
    }

    public String getDialingCodeDescription() {
        return dialingCodeDescription;
    }

    public void setDialingCodeDescription(String dialingCodeDescription) {
        this.dialingCodeDescription = dialingCodeDescription;
    }

    public String getStateProvinceMandatory() {
        return stateProvinceMandatory;
    }

    public void setStateProvinceMandatory(String stateProvinceMandatory) {
        this.stateProvinceMandatory = stateProvinceMandatory;
    }

    public String getDaylightSavingShiftMinutes() {
        return daylightSavingShiftMinutes;
    }

    public void setDaylightSavingShiftMinutes(String daylightSavingShiftMinutes) {
        this.daylightSavingShiftMinutes = daylightSavingShiftMinutes;
    }
}

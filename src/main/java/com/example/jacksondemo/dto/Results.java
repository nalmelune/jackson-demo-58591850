package com.example.jacksondemo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Results {
    private List<TeleCommunications> teleCommunications;

    private Delegate delegate;

    private String name;

    private ComposedKey composedKey;

    private boolean isBranchAddress;

    private List<EmailAddresses> emailAddresses;

    private String zipCodeCity;

    private String salutation;

    private LocalDate openingDate;

    private String streetHouseNumber;

    private LocalDate modificationTimestamp;

    public void setTeleCommunications(List<TeleCommunications> teleCommunications) {
        this.teleCommunications = teleCommunications;
    }

    public List<TeleCommunications> getTeleCommunications() {
        return this.teleCommunications;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public Delegate getDelegate() {
        return this.delegate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setComposedKey(ComposedKey composedKey) {
        this.composedKey = composedKey;
    }

    public ComposedKey getComposedKey() {
        return this.composedKey;
    }

    public void setIsBranchAddress(boolean isBranchAddress) {
        this.isBranchAddress = isBranchAddress;
    }

    public boolean getIsBranchAddress() {
        return this.isBranchAddress;
    }

    public void setEmailAddresses(List<EmailAddresses> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public List<EmailAddresses> getEmailAddresses() {
        return this.emailAddresses;
    }

    public void setZipCodeCity(String zipCodeCity) {
        this.zipCodeCity = zipCodeCity;
    }

    public String getZipCodeCity() {
        return this.zipCodeCity;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDate getOpeningDate() {
        return this.openingDate;
    }

    public void setStreetHouseNumber(String streetHouseNumber) {
        this.streetHouseNumber = streetHouseNumber;
    }

    public String getStreetHouseNumber() {
        return this.streetHouseNumber;
    }

    public void setModificationTimestamp(LocalDate modificationTimestamp) {
        this.modificationTimestamp = modificationTimestamp;
    }

    public LocalDate getModificationTimestamp() {
        return this.modificationTimestamp;
    }
}

package com.example.jacksondemo.dto;

public class EmailAddresses {
    private int emailAddressType;

    private String emailAddress;

    public void setEmailAddressType(int emailAddressType) {
        this.emailAddressType = emailAddressType;
    }

    public int getEmailAddressType() {
        return this.emailAddressType;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}

package com.example.jacksondemo.dto;

public class TeleCommunications
{
    private String areaCode;

    private String telephoneNumber;

    private String internationalAreaCode;

    private int communicationType;

    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    public String getAreaCode(){
        return this.areaCode;
    }
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public void setInternationalAreaCode(String internationalAreaCode){
        this.internationalAreaCode = internationalAreaCode;
    }
    public String getInternationalAreaCode(){
        return this.internationalAreaCode;
    }
    public void setCommunicationType(int communicationType){
        this.communicationType = communicationType;
    }
    public int getCommunicationType(){
        return this.communicationType;
    }
}

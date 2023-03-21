package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class ContactASO extends AbstractDTO {
    private String contactType;
    private String address;
    private String phoneNumber;

    public String getContactType() {return contactType;}
    public void setContactType(String contactType) {this.contactType = contactType;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentASO{");
        sb.append("contactType='").append(this.getContactType()).append("'");
        sb.append(", address='").append(this.getAddress()).append("'");
        sb.append(", phoneNumber='").append(this.getPhoneNumber()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

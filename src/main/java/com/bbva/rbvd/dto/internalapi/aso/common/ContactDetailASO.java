package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class ContactDetailASO extends AbstractDTO {
    private ContactASO contact;

    public ContactASO getContact() {return contact;}
    public void setContact(ContactASO contact) {this.contact = contact;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactDetailASO{");
        sb.append("contact=").append(this.getContact());
        sb.append('}');
        return sb.toString();
    }
}

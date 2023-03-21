package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class IdentityDocumentASO extends AbstractDTO {
    private String documentNumber;
    private GenericTypeASO documentType;

    public String getDocumentNumber() {return documentNumber;}
    public void setDocumentNumber(String documentNumber) {this.documentNumber = documentNumber;}
    public GenericTypeASO getDocumentType() {return documentType;}
    public void setDocumentType(GenericTypeASO documentType) {this.documentType = documentType;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdentityDocumentASO{");
        sb.append("documentNumber=").append(this.getDocumentNumber());
        sb.append(", documentType=").append(this.getDocumentType());
        sb.append('}');
        return sb.toString();
    }
}

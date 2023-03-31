package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class RelatedContractASO extends AbstractDTO {
    private String number;

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RelatedContractASO{");
        sb.append("number='").append(this.getNumber()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

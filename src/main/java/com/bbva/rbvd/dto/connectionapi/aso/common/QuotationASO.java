package com.bbva.rbvd.dto.connectionapi.aso.common;

public class QuotationASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

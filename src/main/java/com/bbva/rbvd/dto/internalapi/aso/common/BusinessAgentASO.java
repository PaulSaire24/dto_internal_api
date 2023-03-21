package com.bbva.rbvd.dto.internalapi.aso.common;

public class BusinessAgentASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusinessAgentASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

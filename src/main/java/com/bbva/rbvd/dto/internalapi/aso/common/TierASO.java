package com.bbva.rbvd.dto.internalapi.aso.common;

public class TierASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TierASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

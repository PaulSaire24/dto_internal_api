package com.bbva.rbvd.dto.connectionapi.aso.common;

public class GenericTypeASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericTypeASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", description='").append(this.getDescription()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

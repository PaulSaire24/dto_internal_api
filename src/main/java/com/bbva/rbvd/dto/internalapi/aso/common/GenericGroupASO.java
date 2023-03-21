package com.bbva.rbvd.dto.internalapi.aso.common;

public class GenericGroupASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericGroupDTO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", description='").append(this.getDescription()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

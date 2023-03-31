package com.bbva.rbvd.dto.connectionapi.aso.common;

public class VehicleCirculationASO extends CommonASO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VehicleCirculationASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

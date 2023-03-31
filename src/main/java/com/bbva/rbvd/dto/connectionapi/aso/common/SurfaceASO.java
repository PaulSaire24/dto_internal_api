package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

import java.math.BigDecimal;

public class SurfaceASO extends AbstractDTO {
    private BigDecimal value;
    private GenericTypeASO surfaceType;
    private GenericTypeASO measurementUnit;

    public BigDecimal getValue() {return value;}
    public void setValue(BigDecimal value) {this.value = value;}
    public GenericTypeASO getSurfaceType() {return surfaceType;}
    public void setSurfaceType(GenericTypeASO surfaceType) {this.surfaceType = surfaceType;}
    public GenericTypeASO getMeasurementUnit() {return measurementUnit;}
    public void setMeasurementUnit(GenericTypeASO measurementUnit) {this.measurementUnit = measurementUnit;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SurfaceASO{");
        sb.append("value=").append(this.getValue());
        sb.append(", surfaceType=").append(this.getSurfaceType());
        sb.append(", measurementUnit=").append(this.getMeasurementUnit());
        sb.append("}");
        return sb.toString();
    }
}

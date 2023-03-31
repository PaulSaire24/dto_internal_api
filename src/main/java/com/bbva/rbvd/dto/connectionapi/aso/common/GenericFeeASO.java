package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class GenericFeeASO extends AbstractDTO {
    private Double percentageValue;
    private GenericAmountASO paymentAmount;
    private GenericAmountASO unit;

    public Double getPercentageValue() { return percentageValue; }
    public void setPercentageValue(Double percentageValue) { this.percentageValue = percentageValue; }
    public GenericAmountASO getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(GenericAmountASO paymentAmount) { this.paymentAmount = paymentAmount; }
    public GenericAmountASO getUnit() { return unit; }
    public void setUnit(GenericAmountASO unit) { this.unit = unit; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericFeeDTO{");
        sb.append("percentageValue='").append(this.getPercentageValue()).append("'");
        sb.append(", paymentAmount=").append(this.getPaymentAmount());
        sb.append(", unit=").append(this.getUnit());
        sb.append('}');
        return sb.toString();
    }
}

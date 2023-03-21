package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class GenericFeeASO extends AbstractDTO {
    private Integer percentageValue;
    private GenericAmountASO paymentAmount;
    private GenericAmountASO unit;

    public Integer getPercentageValue() { return percentageValue; }
    public void setPercentageValue(Integer percentageValue) { this.percentageValue = percentageValue; }
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

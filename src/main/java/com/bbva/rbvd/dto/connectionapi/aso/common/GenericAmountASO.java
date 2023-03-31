package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

import java.math.BigDecimal;

public class GenericAmountASO extends AbstractDTO {
    private String unitType;
    private BigDecimal amount;
    private String currency;
    private String text;

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public String getUnitType() { return unitType; }
    public void setUnitType(String unitType) { this.unitType = unitType; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericAmountDTO{");
        sb.append("unitType='").append(unitType).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

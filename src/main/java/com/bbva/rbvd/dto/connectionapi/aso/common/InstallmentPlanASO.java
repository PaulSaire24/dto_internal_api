package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class InstallmentPlanASO extends AbstractDTO {
    private Integer totalInstallmentsNumber;
    private GenericAmountASO premiumAmount;
    private PeriodASO period;

    public Integer getTotalInstallmentsNumber() {return totalInstallmentsNumber;}
    public void setTotalInstallmentsNumber(Integer totalInstallmentsNumber) {this.totalInstallmentsNumber = totalInstallmentsNumber;}
    public GenericAmountASO getPremiumAmount() {return premiumAmount;}
    public void setPremiumAmount(GenericAmountASO premiumAmount) {this.premiumAmount = premiumAmount;}
    public PeriodASO getPeriod() {return period;}
    public void setPeriod(PeriodASO period) {this.period = period;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InstallmentPlanASO{");
        sb.append("totalInstallmentsNumber=").append(this.getTotalInstallmentsNumber());
        sb.append(", premiumAmount=").append(this.getPremiumAmount());
        sb.append(", period=").append(this.getPeriod());
        sb.append("}");
        return sb.toString();
    }
}

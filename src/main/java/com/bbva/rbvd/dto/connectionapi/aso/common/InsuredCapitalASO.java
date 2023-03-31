package com.bbva.rbvd.dto.connectionapi.aso.common;

public class InsuredCapitalASO extends CommonASO {
    private GenericAmountASO insuredAmount;

    public GenericAmountASO getInsuredAmount() {return insuredAmount;}
    public void setInsuredAmount(GenericAmountASO insuredAmount) {this.insuredAmount = insuredAmount;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuredCapitalASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", insuredAmount=").append(this.getInsuredAmount());
        sb.append('}');
        return sb.toString();
    }
}

package com.bbva.rbvd.dto.internalapi.aso.common;

import java.util.List;

public class PaymentMethodASO extends CommonASO {
    private String paymentType;
    private List<RelatedContractASO> relatedContracts;

    public String getPaymentType() {return paymentType;}
    public void setPaymentType(String paymentType) {this.paymentType = paymentType;}
    public List<RelatedContractASO> getRelatedContracts() {return relatedContracts;}
    public void setRelatedContracts(List<RelatedContractASO> relatedContracts) {this.relatedContracts = relatedContracts;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentMethodASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", paymentType='").append(this.getPaymentType()).append("'");
        sb.append(", relatedContracts=").append(this.getRelatedContracts());
        sb.append('}');
        return sb.toString();
    }
}

package com.bbva.rbvd.dto.internalapi.aso.common;

public class InsuranceASO extends CommonASO {
    private PaymentMethodASO paymentMethod;

    public PaymentMethodASO getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(PaymentMethodASO paymentMethod) {this.paymentMethod = paymentMethod;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", paymentMethod=").append(this.getPaymentMethod());
        sb.append('}');
        return sb.toString();
    }
}

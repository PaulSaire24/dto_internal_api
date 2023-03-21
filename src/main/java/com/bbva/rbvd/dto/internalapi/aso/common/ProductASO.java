package com.bbva.rbvd.dto.internalapi.aso.common;

public class ProductASO extends CommonASO {
    private ProductModalityASO plan;

    public ProductModalityASO getPlan() {return plan;}
    public void setPlan(ProductModalityASO plan) {this.plan = plan;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", plan=").append(this.getPlan());
        sb.append('}');
        return sb.toString();
    }
}

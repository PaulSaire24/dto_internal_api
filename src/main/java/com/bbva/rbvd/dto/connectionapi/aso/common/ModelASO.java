package com.bbva.rbvd.dto.connectionapi.aso.common;

public class ModelASO extends CommonASO {
    private Integer year;
    private BrandASO brand;

    public Integer getYear() {return year;}
    public void setYear(Integer year) {this.year = year;}
    public BrandASO getBrand() {return brand;}
    public void setBrand(BrandASO brand) {this.brand = brand;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModelASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", year=").append(this.getYear());
        sb.append(", brand=").append(this.getBrand());
        sb.append('}');
        return sb.toString();
    }
}

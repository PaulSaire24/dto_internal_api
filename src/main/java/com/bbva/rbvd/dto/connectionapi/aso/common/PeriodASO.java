package com.bbva.rbvd.dto.connectionapi.aso.common;

public class PeriodASO extends CommonASO {
    private String startDate;
    private String endDate;

    public String getStartDate() {return startDate;}
    public void setStartDate(String startDate) {this.startDate = startDate;}
    public String getEndDate() {return endDate;}
    public void setEndDate(String endDate) {this.endDate = endDate;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PeriodASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", startDate='").append(this.getStartDate()).append("'");
        sb.append(", endDate='").append(this.getEndDate()).append("'");
        sb.append('}');
        return sb.toString();
    }
}

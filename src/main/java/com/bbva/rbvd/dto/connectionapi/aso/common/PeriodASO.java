package com.bbva.rbvd.dto.connectionapi.aso.common;

import java.util.Date;

public class PeriodASO extends CommonASO {
    private Date startDate;
    private Date endDate;

    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
    public Date getEndDate() {return endDate;}
    public void setEndDate(Date endDate) {this.endDate = endDate;}

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

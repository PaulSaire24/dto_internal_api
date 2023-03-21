package com.bbva.rbvd.dto.internalapi.aso.common;

import java.util.List;

public class CoverageASO extends CommonASO {
    private GenericGroupASO coverageGroup;
    private List<GenericFeeASO> coverageFees;

    public GenericGroupASO getCoverageGroup() {return coverageGroup;}
    public void setCoverageGroup(GenericGroupASO coverageGroup) {this.coverageGroup = coverageGroup;}
    public List<GenericFeeASO> getCoverageFees() {return coverageFees;}
    public void setCoverageFees(List<GenericFeeASO> coverageFees) {this.coverageFees = coverageFees;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoverageASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", coverageGroup=").append(this.getCoverageGroup());
        sb.append(", coverageFees=").append(this.getCoverageFees());
        sb.append('}');
        return sb.toString();
    }
}

package com.bbva.rbvd.dto.connectionapi.aso.common;

import java.util.List;

public class ProductModalityASO extends CommonASO {

    private List<CoverageASO> coverages;

    public List<CoverageASO> getCoverages() {return coverages;}
    public void setCoverages(List<CoverageASO> coverages) {this.coverages = coverages;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductModalityASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", name='").append(this.getName()).append("'");
        sb.append(", coverages=").append(this.getCoverages());
        sb.append('}');
        return sb.toString();
    }
}

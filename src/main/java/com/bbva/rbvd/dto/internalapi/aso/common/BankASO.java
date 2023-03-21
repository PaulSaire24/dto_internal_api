package com.bbva.rbvd.dto.internalapi.aso.common;

public class BankASO extends CommonASO{
    private BranchASO branch;

    public BranchASO getBranch() {return branch;}
    public void setBranch(BranchASO branch) {this.branch = branch;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankASO{");
        sb.append("id='").append(this.getId()).append("'");
        sb.append(", branch=").append(this.getBranch());
        sb.append('}');
        return sb.toString();
    }
}

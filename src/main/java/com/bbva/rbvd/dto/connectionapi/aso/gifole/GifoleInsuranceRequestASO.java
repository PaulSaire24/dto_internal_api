package com.bbva.rbvd.dto.connectionapi.aso.gifole;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.rbvd.dto.connectionapi.aso.common.BankASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.BusinessAgentASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.GenericAmountASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.GoodASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.HolderASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.InstallmentPlanASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.InsuranceASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.LocationASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.PeriodASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.ProductASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.QuotationASO;
import com.bbva.rbvd.dto.connectionapi.aso.common.ScheduleContactASO;

public class GifoleInsuranceRequestASO extends AbstractDTO {
    private String operationDate;
    private String channel;
    private String operationType;
    private String policyNumber;
    private String couponCode;
    private String externalSimulationId;
    private ProductASO product;
    private GoodASO good;
    private InstallmentPlanASO installmentPlan;
    private GenericAmountASO totalPremiumAmount;
    private HolderASO holder;
    private QuotationASO quotation;
    private BankASO bank;
    private BusinessAgentASO businessAgent;
    private ScheduleContactASO scheduleContact;
    private InsuranceASO insurance;
    private PeriodASO validityPeriod;
    private LocationASO location;

    public String getOperationDate() {return operationDate;}
    public void setOperationDate(String operationDate) {this.operationDate = operationDate;}
    public String getChannel() {return channel;}
    public void setChannel(String channel) {this.channel = channel;}
    public String getOperationType() {return operationType;}
    public void setOperationType(String operationType) {this.operationType = operationType;}
    public String getPolicyNumber() {return policyNumber;}
    public void setPolicyNumber(String policyNumber) {this.policyNumber = policyNumber;}
    public ProductASO getProduct() {return product;}
    public void setProduct(ProductASO product) {this.product = product;}
    public GoodASO getGood() {return good;}
    public void setGood(GoodASO good) {this.good = good;}
    public InstallmentPlanASO getInstallmentPlan() {return installmentPlan;}
    public void setInstallmentPlan(InstallmentPlanASO installmentPlan) {this.installmentPlan = installmentPlan;}
    public GenericAmountASO getTotalPremiumAmount() {return totalPremiumAmount;}
    public void setTotalPremiumAmount(GenericAmountASO totalPremiumAmount) {this.totalPremiumAmount = totalPremiumAmount;}
    public HolderASO getHolder() {return holder;}
    public void setHolder(HolderASO holder) {this.holder = holder;}
    public QuotationASO getQuotation() {return quotation;}
    public void setQuotation(QuotationASO quotation) {this.quotation = quotation;}
    public BankASO getBank() {return bank;}
    public void setBank(BankASO bank) {this.bank = bank;}
    public BusinessAgentASO getBusinessAgent() {return businessAgent;}
    public void setBusinessAgent(BusinessAgentASO businessAgent) {this.businessAgent = businessAgent;}
    public ScheduleContactASO getScheduleContact() {return scheduleContact;}
    public void setScheduleContact(ScheduleContactASO scheduleContact) {this.scheduleContact = scheduleContact;}
    public InsuranceASO getInsurance() {return insurance;}
    public void setInsurance(InsuranceASO insurance) {this.insurance = insurance;}
    public PeriodASO getValidityPeriod() {return validityPeriod;}
    public void setValidityPeriod(PeriodASO validityPeriod) {this.validityPeriod = validityPeriod;}
    public LocationASO getLocation() {return location;}
    public void setLocation(LocationASO location) {this.location = location;}
    public String getCouponCode() {return couponCode;}
    public void setCouponCode(String couponCode) {this.couponCode = couponCode;}
    public String getExternalSimulationid() {return externalSimulationId;}
    public void setExternalSimulationid(String externalSimulationid) {this.externalSimulationId = externalSimulationid;}

    @Override
    public String toString() {
        return "GifoleInsuranceRequestASO{" +
                "operationDate='" + operationDate + '\'' +
                ", channel='" + channel + '\'' +
                ", operationType='" + operationType + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", externalSimulationId='" + externalSimulationId + '\'' +
                ", product=" + product +
                ", good=" + good +
                ", installmentPlan=" + installmentPlan +
                ", totalPremiumAmount=" + totalPremiumAmount +
                ", holder=" + holder +
                ", quotation=" + quotation +
                ", bank=" + bank +
                ", businessAgent=" + businessAgent +
                ", scheduleContact=" + scheduleContact +
                ", insurance=" + insurance +
                ", validityPeriod=" + validityPeriod +
                ", location=" + location +
                '}';
    }
}

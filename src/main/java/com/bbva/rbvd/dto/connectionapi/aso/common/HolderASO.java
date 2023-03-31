package com.bbva.rbvd.dto.connectionapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class HolderASO extends AbstractDTO {
    private String firstName;
    private String lastName;
    private Boolean isDataTreatment;
    private Boolean isBankCustomer;
    private Boolean hasBankAccount;
    private Boolean hasCreditCard;
    private IdentityDocumentASO identityDocument;
    private TierASO tier;
    private List<ContactDetailASO> contactDetails;

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public Boolean getIsDataTreatment() {return isDataTreatment;}
    public void setIsDataTreatment(Boolean dataTreatment) {isDataTreatment = dataTreatment;}
    public Boolean getIsBankCustomer() {return isBankCustomer;}
    public void setIsBankCustomer(Boolean bankCustomer) {isBankCustomer = bankCustomer;}
    public Boolean getHasBankAccount() {return hasBankAccount;}
    public void setHasBankAccount(Boolean hasBankAccount) {this.hasBankAccount = hasBankAccount;}
    public Boolean getHasCreditCard() {return hasCreditCard;}
    public void setHasCreditCard(Boolean hasCreditCard) {this.hasCreditCard = hasCreditCard;}
    public IdentityDocumentASO getIdentityDocument() {return identityDocument;}
    public void setIdentityDocument(IdentityDocumentASO identityDocument) {this.identityDocument = identityDocument;}
    public TierASO getTier() {return tier;}
    public void setTier(TierASO tier) {this.tier = tier;}
    public List<ContactDetailASO> getContactDetails() {return contactDetails;}
    public void setContactDetails(List<ContactDetailASO> contactDetails) {this.contactDetails = contactDetails;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderASO{");
        sb.append("firstName='").append(this.getFirstName()).append("'");
        sb.append(", lastName='").append(this.getLastName()).append("'");
        sb.append(", isDataTreatment=").append(this.getIsDataTreatment());
        sb.append(", isBankCustomer=").append(this.getIsBankCustomer());
        sb.append(", hasBankAccount=").append(this.getHasBankAccount());
        sb.append(", hasCreditCard=").append(this.getHasCreditCard());
        sb.append(", identityDocument=").append(this.getIdentityDocument());
        sb.append(", tier=").append(this.getTier());
        sb.append(", contactDetails=").append(this.getContactDetails());
        sb.append('}');
        return sb.toString();
    }
}

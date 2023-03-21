package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class GoodDetailASO extends AbstractDTO {
    private String insuranceType;
    private String licensePlate;
    private Integer buildingAge;
    private Integer floorsNumber;
    private Integer basementLevels;
    private Boolean hasPowerSupplyConvertion;
    private ModelASO model;
    private GenericAmountASO price;
    private VehicleCirculationASO vehicleCirculation;
    private GenericTypeASO usageType;
    private GenericTypeASO propertyType;
    private GenericTypeASO buildMaterialType;
    private GenericTypeASO holderType;
    private GenericTypeASO usabilityType;
    private LocationASO location;
    private List<InsuredCapitalASO> insuredCapitals;
    private List<SurfaceASO> surfaces;
    private List<GenericTypeASO> buildMaterialTypes;

    public String getInsuranceType() {return insuranceType;}
    public void setInsuranceType(String insuranceType) {this.insuranceType = insuranceType;}
    public String getLicensePlate() {return licensePlate;}
    public void setLicensePlate(String licensePlate) {this.licensePlate = licensePlate;}
    public Integer getBuildingAge() {return buildingAge;}
    public void setBuildingAge(Integer buildingAge) {this.buildingAge = buildingAge;}
    public Integer getFloorsNumber() {return floorsNumber;}
    public void setFloorsNumber(Integer floorsNumber) {this.floorsNumber = floorsNumber;}
    public Integer getBasementLevels() {return basementLevels;}
    public void setBasementLevels(Integer basementLevels) {this.basementLevels = basementLevels;}
    public Boolean getHasPowerSupplyConvertion() {return hasPowerSupplyConvertion;}
    public void setHasPowerSupplyConvertion(Boolean hasPowerSupplyConvertion) {this.hasPowerSupplyConvertion = hasPowerSupplyConvertion;}
    public ModelASO getModel() {return model;}
    public void setModel(ModelASO model) {this.model = model;}
    public GenericAmountASO getPrice() {return price;}
    public void setPrice(GenericAmountASO price) {this.price = price;}
    public VehicleCirculationASO getVehicleCirculation() {return vehicleCirculation;}
    public void setVehicleCirculation(VehicleCirculationASO vehicleCirculation) {this.vehicleCirculation = vehicleCirculation;}
    public GenericTypeASO getUsageType() {return usageType;}
    public void setUsageType(GenericTypeASO usageType) {this.usageType = usageType;}
    public GenericTypeASO getPropertyType() {return propertyType;}
    public void setPropertyType(GenericTypeASO propertyType) {this.propertyType = propertyType;}
    public GenericTypeASO getBuildMaterialType() {return buildMaterialType;}
    public void setBuildMaterialType(GenericTypeASO buildMaterialType) {this.buildMaterialType = buildMaterialType;}
    public GenericTypeASO getHolderType() {return holderType;}
    public void setHolderType(GenericTypeASO holderType) {this.holderType = holderType;}
    public LocationASO getLocation() {return location;}
    public void setLocation(LocationASO location) {this.location = location;}
    public List<InsuredCapitalASO> getInsuredCapitals() {return insuredCapitals;}
    public void setInsuredCapitals(List<InsuredCapitalASO> insuredCapitals) {this.insuredCapitals = insuredCapitals;}
    public List<SurfaceASO> getSurfaces() {return surfaces;}
    public void setSurfaces(List<SurfaceASO> surfaces) {this.surfaces = surfaces;}
    public GenericTypeASO getUsabilityType() {return usabilityType;}
    public void setUsabilityType(GenericTypeASO usabilityType) {this.usabilityType = usabilityType;}
    public List<GenericTypeASO> getBuildMaterialTypes() {return buildMaterialTypes;}
    public void setBuildMaterialTypes(List<GenericTypeASO> buildMaterialTypes) {this.buildMaterialTypes = buildMaterialTypes;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GoodDetailASO{");
        sb.append("insuranceType='").append(this.getInsuranceType()).append("'");
        sb.append(", licensePlate='").append(this.getInsuranceType()).append("'");
        sb.append(", buildingAge=").append(this.getBuildingAge());
        sb.append(", floorsNumber=").append(this.getFloorsNumber());
        sb.append(", basementLevels=").append(this.getBasementLevels());
        sb.append(", hasPowerSupplyConvertion=").append(this.getHasPowerSupplyConvertion());
        sb.append(", model=").append(this.getModel());
        sb.append(", price=").append(this.getPrice());
        sb.append(", vehicleCirculation=").append(this.getVehicleCirculation());
        sb.append(", usageType=").append(this.getUsageType());
        sb.append(", propertyType=").append(this.getPropertyType());
        sb.append(", buildMaterialType=").append(this.getBuildMaterialType());
        sb.append(", holderType=").append(this.getHolderType());
        sb.append(", location=").append(this.getLocation());
        sb.append(", insuredCapitals=").append(this.getInsuredCapitals());
        sb.append(", surfaces=").append(this.getSurfaces());
        sb.append("}");
        return sb.toString();
    }
}

package com.bbva.rbvd.dto.internalapi.aso.common;

import com.bbva.apx.dto.AbstractDTO;

public class CommonASO extends AbstractDTO {
    private String id;
    private String name;
    private String number;
    private String description;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}

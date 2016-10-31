package com.brightworks.sg.ims.dto;

import com.brightworks.sg.ims.entities.model.user.AddressType;

/**
 * Created by kyel on 10/31/2016.
 */
public class AddressDTO {

    private String street;

    private String city;

    private String zipCode;

    private AddressType type;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }
}

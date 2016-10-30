package com.brightworks.sg.ims.entities.model;

import javax.persistence.Embeddable;

/**
 * Created by kyel on 10/29/2016.
 */
@Embeddable
public class Price {

    private Double regularPrice;

    private Double salePrice;

    public Double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}

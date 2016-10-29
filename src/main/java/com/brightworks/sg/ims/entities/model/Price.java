package com.brightworks.sg.ims.entities.model;

import javax.persistence.Embeddable;

/**
 * Created by kyel on 10/29/2016.
 */
@Embeddable
public class Price {

    private Double price;

    private Double salePrice;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}

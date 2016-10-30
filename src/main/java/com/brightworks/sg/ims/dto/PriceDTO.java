package com.brightworks.sg.ims.dto;

/**
 * Created by Dell on 29/10/2016.
 */
public class PriceDTO {

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

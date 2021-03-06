package com.brightworks.sg.ims.dto;

import java.util.List;

/**
 * Created by Dell on 29/10/2016.
 */
public class VariantDTO {

    private Long id;

    private String size;

    private String SKU;

    private Integer quantity;

    private FootWearDTO footwear;

    private String colorWay;

    private List<ImageDTO> assets;

    private boolean defaultVariant;

    private PriceDTO price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isDefaultVariant() {
        return defaultVariant;
    }

    public void setDefaultVariant(boolean defaultVariant) {
        this.defaultVariant = defaultVariant;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    public FootWearDTO getFootwear() {
        return footwear;
    }

    public void setFootwear(FootWearDTO footwear) {
        this.footwear = footwear;
    }

    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public List<ImageDTO> getAssets() {
        return assets;
    }

    public void setAssets(List<ImageDTO> assets) {
        this.assets = assets;
    }
}

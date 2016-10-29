package com.brightworks.sg.ims.entities.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/29/2016.
 */
@Entity
@Table(name = "VARIANTS")
public class Variant {

    @Id
    private Long id;

    @Column(name="SIZE")
    private String size;

    @Column(name="SKU")
    private String SKU;

    @Column(name="QUANTITY")
    private Long quantity;

    @OneToMany
    private List<Image> assets;

    @ManyToOne
    private FootWear product;

    @Column(name = "IS_DEFAULT")
    private boolean defaultVariant;

    @Column(name = "colorWay")
    private String colorWay;

    @Embedded
    private Price price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FootWear getProduct() {
        return product;
    }

    public void setProduct(FootWear product) {
        this.product = product;
    }

    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
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

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public List<Image> getAssets() {
        return assets;
    }

    public void setAssets(List<Image> assets) {
        this.assets = assets;
    }

    public boolean isDefaultVariant() {
        return defaultVariant;
    }

    public void setDefaultVariant(boolean defaultVariant) {
        this.defaultVariant = defaultVariant;
    }
}

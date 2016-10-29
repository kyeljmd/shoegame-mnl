package com.brightworks.sg.ims.dto;

import java.util.List;

/**
 * Created by Dell on 29/10/2016.
 */
public class FootWearDTO {

    private Long id;

    private String name;

    private BrandDTO brand;

    private List<VariantDTO> variants;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrandDTO getBrand() {
        return brand;
    }

    public void setBrand(BrandDTO brand) {
        this.brand = brand;
    }

    public List<VariantDTO> getVariants() {
        return variants;
    }

    public void setVariants(List<VariantDTO> variants) {
        this.variants = variants;
    }
}

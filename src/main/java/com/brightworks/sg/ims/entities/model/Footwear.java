package com.brightworks.sg.ims.entities.model;

import com.brightworks.sg.ims.entities.Brand;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/29/2016.
 */
@Entity
@Table(name = "FOOTWEARS")
public class FootWear {

    @Id
    private Long id;

    /**
     * Generale name of the sneaker
     */
    @Column(name = "name")
    private String name;

    /**
     * Must be unique throughout the system
     * this will be used on search for REST
     * friendly URLS
     */
    @Column(name = "CANONICAL_NAME")
    private String canonicalName;

    @ManyToOne
    private Brand brand;

    @OneToMany
    private List<Variant> variants;

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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

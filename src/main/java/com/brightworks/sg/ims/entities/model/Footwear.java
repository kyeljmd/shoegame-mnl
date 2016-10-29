package com.brightworks.sg.ims.entities.model;

import com.brightworks.sg.ims.entities.Brand;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/29/2016.
 */
@Entity
@Table(name = "FOOTWEARS")
public class Footwear {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;


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

package com.brightworks.sg.ims.entities;

import com.brightworks.sg.ims.entities.model.Footwear;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by kyel on 10/22/2016.
 */
@Entity
@Table(name = "BRANDS")
public class Brand {

    @Id
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

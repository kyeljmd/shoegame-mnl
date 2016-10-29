package com.brightworks.sg.ims.entities.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kyel on 10/29/2016.
 */
@Entity
@Table(name = "IMAGES")
public class Image {

    @Id
    private Long Id;

    private String source;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

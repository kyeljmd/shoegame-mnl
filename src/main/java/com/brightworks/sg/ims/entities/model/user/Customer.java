package com.brightworks.sg.ims.entities.model.user;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/22/2016.
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Customer extends User{

    @OneToMany
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}

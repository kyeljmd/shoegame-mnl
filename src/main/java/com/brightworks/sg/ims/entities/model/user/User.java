package com.brightworks.sg.ims.entities.model.user;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kyel on 10/20/2016.
 */
@Entity
@Table(name = "USERS")
public class User {

    @Id
    private Long id;

    @Embedded
    private Name name;

    @Column(name = "EMAIL_ADDRESS")
    private Long email;

    @OneToMany
    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmail() {
        return email;
    }

    public void setEmail(Long email) {
        this.email = email;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setGivenName(String givenName){
        this.name.setGivenName(givenName);
    }

    public void setMiddleName(String middleName){
        this.name.setMiddleName(middleName);
    }

    public void setFamilyName(String lastName){
        this.name.setFamilyName(lastName);
    }

    public String getGivenName(){
        return this.name.getGivenName();
    }

    public String getFamilyname(){
        return this.name.getFamilyName();
    }

    public String getMiddleName(){
        return this.name.getMiddleName();
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}

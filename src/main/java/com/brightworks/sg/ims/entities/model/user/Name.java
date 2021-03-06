package com.brightworks.sg.ims.entities.model.user;

import javax.persistence.Embeddable;

/**
 * Created by kyel on 10/20/2016.
 */
@Embeddable
public class Name {

    private String givenName;

    private String middleName;

    private String familyName;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}

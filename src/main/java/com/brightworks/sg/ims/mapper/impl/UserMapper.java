package com.brightworks.sg.ims.mapper.impl;

import com.brightworks.sg.ims.dto.UserDTO;
import com.brightworks.sg.ims.entities.model.user.User;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by kyel on 10/31/2016.
 */
@Component
public class UserMapper extends CustomMapper<User, UserDTO> {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void mapAtoB(User model, UserDTO dto, MappingContext context) {
        dto.setFamilyName(model.getFamilyname());
        dto.setGivenName(model.getGivenName());
        dto.setMiddleName(model.getMiddleName());
    }

    public void mapBtoA(UserDTO dto, User model, MappingContext context) {
        model.setGivenName(dto.getGivenName());
        model.setMiddleName(dto.getMiddleName());
        model.setFamilyName(dto.getFamilyName());

        if(dto.isNew()) {
            model.setPassword(passwordEncoder.encode(dto.getPassword()));
        }
    }
}

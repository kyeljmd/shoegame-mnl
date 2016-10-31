package com.brightworks.sg.ims.service.impl;

import com.brightworks.sg.ims.dto.UserDTO;
import com.brightworks.sg.ims.entities.model.user.User;
import com.brightworks.sg.ims.mapper.OrikaBeanMapper;
import com.brightworks.sg.ims.repo.user.UserRepo;
import com.brightworks.sg.ims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import sun.security.util.Password;

/**
 * Created by kyel on 10/31/2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private OrikaBeanMapper mapper;

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDTO findUserByEmail(String email) {
        UserDTO user = mapper.map(userRepo.findByEmail(email), UserDTO.class);
        return user;
    }

    @Override
    public boolean disableUser(String email) {
        User user = userRepo.findByEmail(email);
        user.setEnabled(false);
        return userRepo.save(user) != null;
    }

    @Override
    public Long saveOrUpdate(UserDTO dto) {
        User user = mapper.map(dto,User.class);
        user = userRepo.save(user);
        return user.getId();
    }
}

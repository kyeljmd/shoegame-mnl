package com.brightworks.sg.ims.service;

import com.brightworks.sg.ims.dto.UserDTO;
import com.brightworks.sg.ims.mapper.OrikaBeanMapperTestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Test
    public void fetchUserByEmailTest() {
        String email = "admin@gmail.com";
        UserDTO user = userService.findUserByEmail(email);
        assertNotNull(user);
    }

    @Test
    public void disableUserByEmail() {
        String email = "admin@gmail.com";
        boolean success = userService.disableUser(email);
        assertTrue(success);
    }

    @Test
    public void saveOrUpdateUser() {
        UserDTO dto = OrikaBeanMapperTestUtils.userDTO();
        Long savedResult = userService.saveOrUpdate(dto);
        assertNotNull(savedResult);
    }
}

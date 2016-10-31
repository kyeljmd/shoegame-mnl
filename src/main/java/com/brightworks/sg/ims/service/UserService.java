package com.brightworks.sg.ims.service;

import com.brightworks.sg.ims.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * Created by kyel on 10/31/2016.
 */
@Service
public interface UserService {

    UserDTO findUserByEmail(String email);

    boolean disableUser(String email);

    Long saveOrUpdate(UserDTO dto);

}

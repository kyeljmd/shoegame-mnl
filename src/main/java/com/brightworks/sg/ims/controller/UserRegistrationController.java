package com.brightworks.sg.ims.controller;

import com.brightworks.sg.ims.entities.repo.UserRepo;
import org.springframework.stereotype.Controller;

/**
 * Created by kyel on 10/29/2016.
 */
@Controller
public class UserRegistrationController {

    private UserRepo userRepo;

    public String register(){
        return "register";
    }
}

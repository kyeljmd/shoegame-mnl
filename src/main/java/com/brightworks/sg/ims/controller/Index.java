package com.brightworks.sg.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kyel on 10/29/2016.
 */
@Controller
public class Index {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String home(){
        return "dashboard/index";
    }
}

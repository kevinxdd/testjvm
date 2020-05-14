package com.xdd.testjvm.controller;/**
 * Create by xdd on 2020/5/13.
 */

import org.springframework.web.bind.annotation.RestController;

/**
 * @author xdd
 */
@RestController
public class UserController
{
    public String getUser(String a){
        return "";
    }

    private String getMsg(){
        return "1";
    }

}

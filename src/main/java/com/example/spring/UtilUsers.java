/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring;

import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author fvasile
 */
@Component
public class UtilUsers {
    
    @Autowired
    private ApplicationContext app;
    public void message(){
        System.out.println(app.getBean(UserService.class).list());
    }
    
}

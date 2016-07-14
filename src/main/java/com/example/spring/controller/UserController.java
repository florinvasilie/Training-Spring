package com.example.spring.controller;

import com.example.spring.UtilUsers;
import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserController {
    @Autowired
    private UtilUsers util;
      @Autowired
      @Qualifier(value="service1")
       private UserService service;
	public void createUser(User user){
		user.setFirstName("Florin");
                user.setLastName("Vasilie");
                user.setAge(22);
                user.setId(1);
                service.save(user);
                List<User> users=new ArrayList<>();
                users=service.list();
                System.out.println("CONTROLLER");
                for(User us:users){
                    System.out.println(us.getFirstName());
                }
                util.message();
	}
      
}

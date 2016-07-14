package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("service1")
public class UserServiceImpl implements UserService {
        @Autowired
        private UserRepository userRep;
        
	@Override
	public List<User> list() {
		System.out.println("Service list");
		return userRep.list();
	}

	@Override
	public User get(int id) {
		System.out.println("Service get");
                return userRep.get(id);
	}

	@Override
	public void save(User user) {
		System.out.println("Service save");
                userRep.save(user);
	}
}
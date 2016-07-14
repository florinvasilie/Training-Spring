package com.example.spring.repository.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository

public class UserRepositoryImpl implements UserRepository{
        private List<User> users=new ArrayList<User>();
	@Override
	public List<User> list() {
            System.out.println("User Repository List");
            return this.users;
	}

	@Override
	public User get(int id) {
            
            System.out.println("User Repository Get id");
		for(User user : list()){
                   if(id==user.getId()) return user;
                }
            return null;
	}

	@Override
	public void save(User user) {
            System.out.println("User Repository save");
            users.add(user);
	}

}

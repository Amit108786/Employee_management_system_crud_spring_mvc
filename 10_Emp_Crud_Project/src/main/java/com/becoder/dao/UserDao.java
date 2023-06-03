package com.becoder.dao;


import org.springframework.stereotype.Service;

import com.becoder.entity.User;

@Service
public interface UserDao {
	
     public int saveUser(User user);
     
     public User loginUser(String email,String password);
}

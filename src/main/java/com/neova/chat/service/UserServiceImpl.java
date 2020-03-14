package com.neova.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neova.chat.domain.User;
import com.neova.chat.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repo;
	
	@Override
	public List<User> getAllUsers() {
		List<User> list = null;
		try {
			list = repo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}

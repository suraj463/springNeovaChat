package com.neova.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.neova.chat.domain.User;
import com.neova.chat.service.UserService;

@Controller
public class ChatController {

	@Autowired
	UserService user;
	
	@RequestMapping(value = "/getusers", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)  	
	@ResponseBody
	public String getAllUsers() {
		List<User> allUsers = user.getAllUsers();
		return new Gson().toJson(allUsers).toString();
	}
	
}

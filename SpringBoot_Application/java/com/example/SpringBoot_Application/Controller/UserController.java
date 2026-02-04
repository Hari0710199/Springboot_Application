package com.example.SpringBoot_Application.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Application.model.UserModel;
import com.example.SpringBoot_Application.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public UserModel save(@RequestBody UserModel userModel) {
		System.out.println("Inside save");
		return userService.save(userModel);
	}

	@GetMapping("/get")
	public List<UserModel> getAll() {
		System.out.println("Inside get");
		return userService.getAll();
	}

	@GetMapping("/get/{id}")
	public UserModel findById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@GetMapping("/getbyemail/{emailid}")
	public UserModel findByEmailId(@PathVariable String emailid) {
		return userService.getUserByEmailId(emailid);
	}
}

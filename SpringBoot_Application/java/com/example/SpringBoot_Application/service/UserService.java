package com.example.SpringBoot_Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_Application.Repository.UserRepository;
import com.example.SpringBoot_Application.model.UserModel;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public UserModel save(UserModel userModel) {
		return userRepository.save(userModel);
	}

	public List<UserModel> getAll() {
		return userRepository.findAll();
	}

	public UserModel getUserById(int id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
	}

	public UserModel getUserByEmailId(String email) {
		return userRepository.findByEmailIgnoreCase(email)
				.orElseThrow(() -> new RuntimeException("User not found with emailid: " + email));
	}
}

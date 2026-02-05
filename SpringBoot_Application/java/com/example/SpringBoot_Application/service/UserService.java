package com.example.SpringBoot_Application.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_Application.Exception.UserNotFoundException;
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
		return userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
	}

	public UserModel getUserByEmailId(String email) {
		return userRepository.findByEmailIgnoreCase(email)
				.orElseThrow(() -> new UserNotFoundException("User not found with emailid: " + email));
	}

	public List<UserModel> getUserByRole(String role) throws RoleNotFoundException {
		List<UserModel> usersByRole = userRepository.findAll()
	            .stream()
	            .filter(user -> user.getRole() != null)
	            .filter(user -> user.getRole().equalsIgnoreCase(role))
	            .toList();

	    if (usersByRole.isEmpty()) {
	        throw new RoleNotFoundException("Role not found: " + role);
	    }

	    return usersByRole;
	}	
}

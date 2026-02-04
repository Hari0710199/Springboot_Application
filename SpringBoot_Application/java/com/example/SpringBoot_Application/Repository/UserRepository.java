package com.example.SpringBoot_Application.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_Application.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

	Optional<UserModel> findByEmailIgnoreCase(String email);

	
}

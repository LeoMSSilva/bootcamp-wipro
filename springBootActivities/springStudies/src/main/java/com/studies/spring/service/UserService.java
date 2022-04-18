package com.studies.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studies.spring.model.User;
import com.studies.spring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public User update(String id, User obj) {
		User newObj = findById(id);
		newObj.setName(obj.getName());
		newObj.setLastName(obj.getLastName());
		newObj.setEmail(obj.getEmail());
		newObj.setPassword(obj.getPassword());
		return repository.save(newObj);
	}

	public User create(User obj) {
		return repository.save(obj);
	}

	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}

}

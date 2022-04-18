package com.studies.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studies.spring.model.User;
import com.studies.spring.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/{id}")
	public ResponseEntity<User> GetbyId(@PathVariable String id) {
		User obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<User>> GetAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<User> Post(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(user));
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> Put(@PathVariable String id, @RequestBody User obj) {
		User newUser = service.update(id, obj);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(newUser);
	}

	@DeleteMapping
	public ResponseEntity<Void> Delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}

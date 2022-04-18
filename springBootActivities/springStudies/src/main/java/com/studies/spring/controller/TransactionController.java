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

import com.studies.spring.model.Transaction;
import com.studies.spring.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("*")
public class TransactionController {

	@Autowired
	private TransactionService service;

	@GetMapping("/{id}")
	public ResponseEntity<Transaction> GetbyId(@PathVariable String id) {
		Transaction newTransaction = this.service.findById(id);
		return ResponseEntity.ok().body(newTransaction);
	}

	@GetMapping
	public ResponseEntity<List<Transaction>> GetAll() {
		List<Transaction> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<Transaction> Post(@RequestBody Transaction transaction) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(transaction));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Transaction> Put(@PathVariable String id, @RequestBody Transaction transaction) {
		Transaction newTransaction = service.update(id, transaction);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(newTransaction);
	}

	@DeleteMapping
	public ResponseEntity<Void> Delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}

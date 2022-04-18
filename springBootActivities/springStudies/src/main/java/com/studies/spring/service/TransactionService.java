package com.studies.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studies.spring.model.Transaction;
import com.studies.spring.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	public Transaction findById(String id) {
		Optional<Transaction> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Transaction> findAll() {
		return repository.findAll();
	}

	public Transaction update(String id, Transaction obj) {
		Transaction newObj = findById(id);
		newObj.setCardNumber(obj.getCardNumber());
		newObj.setclientName(obj.getclientName());
		newObj.setTransactionAmount(obj.getTransactionAmount());
		newObj.setTransactionDate(obj.getTransactionDate());
		return repository.save(newObj);
	}

	public Transaction create(Transaction obj) {
		return repository.save(obj);
	}

	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}

}

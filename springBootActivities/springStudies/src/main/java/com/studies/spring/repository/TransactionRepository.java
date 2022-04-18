package com.studies.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.spring.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}

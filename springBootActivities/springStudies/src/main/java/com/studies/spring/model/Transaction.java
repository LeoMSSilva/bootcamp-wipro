package com.studies.spring.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;
	private String cardNumber;
	private String clientName;
	private String transactionDate;
	private double transactionAmount;

	public Transaction() {
		super();
		this.cardNumber = createCard();
	}

	public Transaction(String transactionDate, String clientName, String cardNumber, double transactionAmount) {
		super();
		this.transactionDate = transactionDate;
		this.clientName = clientName;
		this.transactionAmount = transactionAmount;
		this.cardNumber = createCard();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getclientName() {
		return clientName;
	}

	public void setclientName(String clientName) {
		this.clientName = clientName;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(id, other.id);
	}

	private String createCard() {
		Random random = new Random();
		String prefix = "111122223333";
		String sufix = String.valueOf(random.nextInt(9999 - 4444) + 4444);
		return cardNumber = prefix.concat(sufix);
	}
}

package com.mayatech.sebocabank.repository;

import com.mayatech.sebocabank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}

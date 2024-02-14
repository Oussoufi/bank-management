package com.mayatech.sebocabank.service;

import com.mayatech.sebocabank.dto.TransactionDto;
import com.mayatech.sebocabank.model.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}

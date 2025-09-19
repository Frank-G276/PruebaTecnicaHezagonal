package com.financial.institution.transaction.domain.ports;

import com.financial.institution.transaction.domain.models.Transaction;
import com.financial.institution.transaction.domain.models.valueObjects.IdTransaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository {
    Optional<Transaction> findById(IdTransaction idTransaction);
    List<Transaction> findAll();
    void deleteById(IdTransaction idTransaction);
    Transaction save(Transaction transaction);
}

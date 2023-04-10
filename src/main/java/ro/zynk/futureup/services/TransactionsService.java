package ro.zynk.futureup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.zynk.futureup.controllers.responses.TransactionResponse;
import ro.zynk.futureup.domain.dtos.Transaction;
import ro.zynk.futureup.domain.repositories.TransactionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionsService {
    private final TransactionRepository transactionRepository;
    @Autowired
    public TransactionsService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<TransactionResponse> getAllTransactions() {
        var transactionList = this.transactionRepository.findAll();
        var transactionResponseList = new ArrayList<TransactionResponse>();
        for (Transaction transaction: transactionList) {
            transactionResponseList.add(new TransactionResponse(transaction));
        }
        return transactionResponseList;
    }

    public Transaction createTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public List<TransactionResponse> listAllTransactionsGreaterThan(Double amountOfUsd){
        var transactionList = this.transactionRepository.findAll();
        var transactionResponseList = new ArrayList<TransactionResponse>();
        for (Transaction transaction: transactionList){
            if (transaction.getTotalValue() > amountOfUsd){
                transactionResponseList.add(new TransactionResponse(transaction));
            }
        }
        return transactionResponseList;
    }
}

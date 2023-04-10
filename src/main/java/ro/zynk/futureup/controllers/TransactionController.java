package ro.zynk.futureup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.zynk.futureup.controllers.responses.CoinResponse;
import ro.zynk.futureup.controllers.responses.TransactionResponse;
import ro.zynk.futureup.domain.dtos.Transaction;
import ro.zynk.futureup.domain.repositories.TransactionRepository;
import ro.zynk.futureup.services.TransactionsService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    private TransactionsService transactionsService;
    @GetMapping
    public List<TransactionResponse> getAllTransactions(){
        return transactionsService.getAllTransactions();
    }
    @GetMapping(value = "greater_than/{amountOfUsd}")
    public List<TransactionResponse> listAllTransactionsGreaterThan(@PathVariable("amountOfUsd") Double amountOfUsd){
        return transactionsService.listAllTransactionsGreaterThan(amountOfUsd);
    }
}

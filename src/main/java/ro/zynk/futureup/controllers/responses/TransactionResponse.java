package ro.zynk.futureup.controllers.responses;

import ro.zynk.futureup.domain.dtos.Coin;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionResponse extends BaseResponse {
    private Long id;
    private String date;
    private String coin;
    private Double amount;
    private Double totalValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public TransactionResponse(Transaction transaction){
        this.id = transaction.getId();
        this.date = transaction.getDate();
        this.coin = transaction.getCoin();
        this.amount = transaction.getAmount();
        this.totalValue = transaction.getTotalValue();
    }
    public TransactionResponse(Long id, String date, String coin, Double amount, Double totalValue) {
        this.id = id;
        this.date = date;
        this.coin = coin;
        this.amount = amount;
        this.totalValue = totalValue;
    }
}

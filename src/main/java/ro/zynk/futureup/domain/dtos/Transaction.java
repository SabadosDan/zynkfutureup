package ro.zynk.futureup.domain.dtos;

import ro.zynk.futureup.controllers.responses.CoinResponse;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
    @Column(name = "date")
    private String date;

//    @ManyToOne
//    @JoinColumn(name = "coin_id")
//    private Coin coin;
    @Column(name = "coin_id_name_value")
    private String coin;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "total_value")
    private Double totalValue;

    public Transaction(String date, String coin, Double amount, Double totalValue) {
        this.date = date;
        this.coin = coin;
        this.amount = amount;
        this.totalValue = totalValue;
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

    public Transaction() {

    }
}

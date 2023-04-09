package ro.zynk.futureup.domain.dtos;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
    @Column
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "coin(id, name, value")
    private Coin coin;

    @Column
    private Double amount;

    @Column
    private Double totalValue;

    public Transaction(LocalDateTime date, Coin coin, Double amount, Double totalValue) {
        this.date = date;
        this.coin = coin;
        this.amount = amount;
        this.totalValue = totalValue;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
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

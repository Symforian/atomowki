package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Long billId;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(nullable = false)
    private LocalDateTime date;

    public Payment(Long billId, BigDecimal amount, LocalDateTime date) {
        this.billId = billId;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

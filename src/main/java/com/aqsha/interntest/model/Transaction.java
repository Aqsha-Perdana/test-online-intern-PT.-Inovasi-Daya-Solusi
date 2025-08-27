package com.aqsha.interntest.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    @Id
    private Integer id;

    @Column(name = "productid")
    private String productId;

    @Column(name = "productname")   // huruf N besar
    private String productName;

    private BigDecimal amount;

    @Column(name = "customername")  // huruf N besar
    private String customerName;

    @Column(name = "status")
    private Integer status;

    @Column(name = "transactiondate")  // huruf D besar
    private LocalDateTime transactionDate;

    @Column(name = "createby")      // huruf B besar
    private String createdBy;

    @Column(name = "createon")      // huruf O besar
    private LocalDateTime createdOn;
}

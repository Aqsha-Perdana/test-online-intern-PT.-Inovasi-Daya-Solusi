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

    @Column(name = "productname")   
    private String productName;

    private BigDecimal amount;

    @Column(name = "customername")  
    private String customerName;

    @Column(name = "status")
    private Integer status;

    @Column(name = "transactiondate")  
    private LocalDateTime transactionDate;

    @Column(name = "createby")      
    private String createdBy;

    @Column(name = "createon")      // huruf O besar
    private LocalDateTime createdOn;
}

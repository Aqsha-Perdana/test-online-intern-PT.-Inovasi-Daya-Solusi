package com.aqsha.interntest.dto;

import lombok.Data;

@Data
public class TransactionItemDTO {
    private Integer id;
    private String productID;
    private String productName;
    private String amount;
    private String customerName;
    private Integer status;
    private String transactionDate;
    private String createBy;
    private String createOn;
}

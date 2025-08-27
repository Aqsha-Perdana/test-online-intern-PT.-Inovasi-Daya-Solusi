package com.aqsha.interntest.service;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aqsha.interntest.dto.StatusItemDTO;
import com.aqsha.interntest.dto.TransactionItemDTO;
import com.aqsha.interntest.dto.ViewResponseDTO;
import com.aqsha.interntest.repository.StatusRepository;
import com.aqsha.interntest.repository.TransactionRepository;

@Service
public class ApiService {

    private final TransactionRepository transactionRepository;
    private final StatusRepository statusRepository;
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ApiService(TransactionRepository transactionRepository, StatusRepository statusRepository) {
        this.transactionRepository = transactionRepository;
        this.statusRepository = statusRepository;
    }

    public ViewResponseDTO getViewData() {
    ViewResponseDTO resp = new ViewResponseDTO();

    List<TransactionItemDTO> data = transactionRepository.findAll().stream().map(t -> {
        TransactionItemDTO dto = new TransactionItemDTO();
        dto.setId(t.getId());
        dto.setProductID(t.getProductId());
        dto.setProductName(t.getProductName());
        dto.setAmount(
            t.getAmount() != null ? t.getAmount().stripTrailingZeros().toPlainString() : null
        );
        dto.setCustomerName(t.getCustomerName());
        dto.setStatus(t.getStatus());  
        dto.setTransactionDate(
            t.getTransactionDate() != null ? t.getTransactionDate().format(FMT) : null
        );
        dto.setCreateBy(t.getCreatedBy());
        dto.setCreateOn(
            t.getCreatedOn() != null ? t.getCreatedOn().format(FMT) : null
        );
        return dto;
    }).toList();

    List<StatusItemDTO> status = statusRepository.findAll().stream().map(s -> {
        StatusItemDTO dto = new StatusItemDTO();
        dto.setId(s.getId());
        dto.setName(s.getName());
        return dto;
    }).toList();

    resp.setData(data);
    resp.setStatus(status);

    return resp;
}}

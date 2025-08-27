package com.aqsha.interntest.dto;

import java.util.List;

import lombok.Data;

@Data
public class ViewResponseDTO {
    private List<TransactionItemDTO> data;
    private List<StatusItemDTO> status;
}
package com.productapp.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ErrorInfo {
     private LocalDateTime timestamp;
     private String status;
     private String errorMessage;
    private String toContact;
    private Map<String, String> errorMap;
}

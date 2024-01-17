package com.productapp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;

    @NotEmpty(message = "product name must not be empty")
    private String name;

    private double price;

}

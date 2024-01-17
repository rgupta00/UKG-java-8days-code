package com.productapp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;

    @NotEmpty(message = "product name must not be empty")
    private String name;

    private double price;

}

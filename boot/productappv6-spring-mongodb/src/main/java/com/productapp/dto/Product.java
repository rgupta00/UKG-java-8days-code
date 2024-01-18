package com.productapp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document("p_table2")
public class Product {
    @Id
    private int id;

    @NotEmpty(message = "product name must not be empty")
    private String name;

    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

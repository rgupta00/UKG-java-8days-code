package com.productapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "p_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "product name must not be empty")
    @Column(name="p_name")
    private String name;
    @Column(name="p_price")
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

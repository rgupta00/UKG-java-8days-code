package com.productapp.service;

import com.productapp.dto.Product;

import java.util.List;

public interface ProductService {
        public List<Product> getAll();
        public Product getById(int id);
        public Product addProduct(Product product);
        public Product deleteProduct(int id);
        public Product updateProduct(int id, Product product);
}

package com.productapp.repo;

import com.productapp.dto.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {
    public List<Product> findByName(String name);
}

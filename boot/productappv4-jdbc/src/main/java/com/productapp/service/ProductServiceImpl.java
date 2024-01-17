package com.productapp.service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.dto.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

   //field setter(optional dep) ctr(mandatory dep)

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAll() {
        return productRepo.getAll();
    }

    @Override
    public Product getById(int id) {
        Product product=productRepo.getById(id);
        if(product==null)
            throw  new ProductNotFoundException("product with id "+ id +" is not found");
        return product;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.addProduct(product);
    }

    @Override
    public Product deleteProduct(int id) {
        return productRepo.deleteProduct(id);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        return productRepo.updateProduct(id, product);
    }
}

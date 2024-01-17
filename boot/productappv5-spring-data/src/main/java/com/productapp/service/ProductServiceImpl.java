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
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product getById(int id) {
        Product product=productRepo.findById(id)
                .orElseThrow(()-> new ProductNotFoundException("product with id "+ id +" is not found"));

        return product;
    }

    @Override
    public Product addProduct(Product product) {

         productRepo.save(product);

         return product;
    }

    @Override
    public Product deleteProduct(int id) {
         Product productToDelete= getById(id);
         productRepo.delete(productToDelete);
         return productToDelete;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate= getById(id);
        productToUpdate.setPrice(product.getPrice());

        productRepo.save(productToUpdate);

       return productToUpdate;
    }
}

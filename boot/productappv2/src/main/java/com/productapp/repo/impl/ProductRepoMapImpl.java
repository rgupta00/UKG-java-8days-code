package com.productapp.repo.impl;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepoMapImpl implements ProductRepo {

    public static Map<Integer, Product> map=new HashMap<>();
    private static int counter=2;

    static {
        map.put(1, new Product(1,"laptop",79000.00));
        map.put(2, new Product(2,"laptop cover",400.00));

    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Product getById(int id) {
        return map.get(id);
    }

    @Override
    public Product addProduct(Product product) {
        product.setId(++counter);
        map.put(counter, product);
        return product;
    }

    @Override
    public Product deleteProduct(int id) {
        Product productToDelete= getById(id);
        if(productToDelete!=null){
            map.remove(id);
        }
        return productToDelete;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productToUpdate= getById(id);
        if(productToUpdate!=null){
            productToUpdate.setPrice(product.getPrice());
            map.put(id, productToUpdate);
        }
        return productToUpdate;
    }
}

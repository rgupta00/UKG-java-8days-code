package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@Controller + @ResponseBody : java --> json
                //              @RequestBody: json --> java
@AllArgsConstructor
public class ProductRestController {

    private ProductService productService;

    //--get all products------------
    @GetMapping(path = "products")
    public List<Product> getAll(){
        return productService.getAll();
    }

    //--get product by id----------
    @GetMapping(path = "products/{id}")
    public Product getById(@PathVariable int id){
        return productService.getById(id);
    }

    //parser jakson parser java <---> json
    //add
    @PostMapping(path = "products")
    public Product addProduct( @RequestBody Product product){
        return productService.addProduct(product);
    }
    //delete
    @DeleteMapping(path = "products/{id}")
    public Product deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
    //update
    @PutMapping(path = "products/{id}")
    public Product updateProduct( @PathVariable int id,  @RequestBody Product product){
        return productService.updateProduct(id, product);
    }


}

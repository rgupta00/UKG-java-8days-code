package com.productapp.controller;

import com.productapp.dto.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@Controller + @ResponseBody : java --> json
                //              @RequestBody: json --> java
@AllArgsConstructor
public class ProductRestController {

    private ProductService productService;

    //--get all products------------
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products= productService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    //--get product by id----------
    @GetMapping(path = "products/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
    }

    //ResponseEntity : class : bag that contain 2 things data + status code

    //parser jakson parser java <---> json
    //add
    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct( @RequestBody @Valid Product product){
        Product addedProduct= productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedProduct);
    }
    //delete
    @DeleteMapping(path = "products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id){
        Product deletedProduct= productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    //update
    @PutMapping(path = "products/{id}")
    public ResponseEntity<Product> updateProduct( @PathVariable int id,  @RequestBody Product product){
        Product updatedProduct= productService.updateProduct(id, product);
        return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
    }


}

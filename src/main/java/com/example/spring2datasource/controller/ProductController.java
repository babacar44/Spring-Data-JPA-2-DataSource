package com.example.spring2datasource.controller;

import com.example.spring2datasource.dao.product.ProductRepository;
import com.example.spring2datasource.dto.product.ProductDto;
import com.example.spring2datasource.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public ResponseEntity<ProductDto> add(@RequestBody ProductDto productDto){
        Product product = new Product();
        product.setPrice(productDto.getPrice());
        product.setName(productDto.getName());
        var result = productRepository.save(product);
        productDto.setId(result.getId());
        return new ResponseEntity<>(productDto, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Product>> list(){
        List<Product> result = (List<Product>) productRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

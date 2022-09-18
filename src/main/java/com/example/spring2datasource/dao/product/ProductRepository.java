package com.example.spring2datasource.dao.product;

import com.example.spring2datasource.model.product.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {


    List<Product> findAllByPrice(double price, Pageable pageable);
}
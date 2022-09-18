package com.example.spring2datasource.dto.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class ProductDto {

    private int id;

    private String name;

    private double price;
}

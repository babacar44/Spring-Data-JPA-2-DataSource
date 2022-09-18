package com.example.spring2datasource.model.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private double price;

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Product [name=")
                .append(name)
                .append(", id=")
                .append(id)
                .append("]");
        return builder.toString();
    }
}
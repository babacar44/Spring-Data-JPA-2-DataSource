package com.example.spring2datasource.model.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Possession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Possesion [id=").append(id).append(", name=").append(name).append("]");
        return builder.toString();
    }

}

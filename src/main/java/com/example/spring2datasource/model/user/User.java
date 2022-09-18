package com.example.spring2datasource.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    @Column(unique = true, nullable = false)
    private String email;
    private boolean status;

    @OneToMany
    List<Possession> possessionList;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("User [name=").append(name).append(", id=").append(id).append("]");
        return builder.toString();
    }

}

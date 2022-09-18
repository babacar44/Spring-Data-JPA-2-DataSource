package com.example.spring2datasource.dto.user;

import com.example.spring2datasource.model.user.Possession;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@RequiredArgsConstructor
public class UserDto implements Serializable {

    private int id;
    private String name;
    private int age;
    private String email;
    private boolean status;

    List<PossessionDto> possessionList;
}

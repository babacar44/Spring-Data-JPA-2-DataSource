package com.example.spring2datasource.dto.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class PossessionDto implements Serializable {

    private long id;
    private String name;
}

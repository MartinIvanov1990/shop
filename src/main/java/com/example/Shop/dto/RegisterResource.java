package com.example.Shop.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RegisterResource {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;
    private String password;
    }

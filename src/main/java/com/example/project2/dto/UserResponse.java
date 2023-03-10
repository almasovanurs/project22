package com.example.project2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class UserResponse {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate created;
}

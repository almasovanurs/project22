package com.example.project2.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CompanyResponse {

    private Long id;
    private String companyName;
    private String locatedCountry;
}

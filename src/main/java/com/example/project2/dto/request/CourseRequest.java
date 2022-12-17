package com.example.project2.dto.request;


import com.example.project2.model.Company;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
public class CourseRequest {

    @NotNull
    private String courseName;
    @NotNull
    private String durationMonth;
    private Company company;
    private Long companyId;
}

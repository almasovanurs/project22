package com.example.project2.dto.response;

import com.example.project2.model.Company;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CourseResponse {

    private Long id;
    private String courseName;
    private String durationMonth;
    private Company company;
    private Long companyId;
}

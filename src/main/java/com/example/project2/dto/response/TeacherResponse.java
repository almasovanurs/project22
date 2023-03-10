package com.example.project2.dto.response;

import com.example.project2.model.Courses;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TeacherResponse {

    private Long id;
    private String firstName;

    private String lastName;

    private String email;
    private Courses courses;
    Long courseId;
}

package com.example.project2.dto.response;

import com.example.project2.model.Groups;
import com.example.project2.model.StudyFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class StudentResponse {

    private Long id;
    private String firstName;
    private String email;
    private String lastName;
    private Groups groups;
    private Long groupId;
    private StudyFormat studyFormat;
}

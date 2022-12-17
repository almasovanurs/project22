package com.example.project2.dto.request;


import com.example.project2.model.Groups;
import com.example.project2.model.StudyFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
public class StudentRequest {

    @NotNull
    private String firstName;
    @NotNull
    private String email;
    @NotNull
    private String lastName;
    private Groups groups;
    private Long groupId;
    private StudyFormat studyFormat;
}

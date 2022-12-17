package com.example.project2.dto.request;

import com.example.project2.model.Courses;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class GroupRequest {

    @NotNull
    private String groupName;
    @NotNull
    private String dateOfStart;
    @NotNull
    private  String dateOfFinish;
    private Long courseId;
    private List<Courses> courses;
}

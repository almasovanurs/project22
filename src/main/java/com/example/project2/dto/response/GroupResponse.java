package com.example.project2.dto.response;

import com.example.project2.model.Courses;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class GroupResponse {

    private Long id;
    private String groupName;
    private String dateOfStart;
    private  String dateOfFinish;
    private Long courseId;
    private List<Courses> courses;
}

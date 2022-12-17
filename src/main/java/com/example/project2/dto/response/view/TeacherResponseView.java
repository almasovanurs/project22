package com.example.project2.dto.response.view;

import com.example.project2.dto.response.TeacherResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class TeacherResponseView {
    List<TeacherResponse> teacherResponse;
}

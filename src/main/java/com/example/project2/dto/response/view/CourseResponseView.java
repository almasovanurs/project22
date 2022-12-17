package com.example.project2.dto.response.view;

import com.example.project2.dto.response.CourseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CourseResponseView {
    List<CourseResponse> courseResponses;
}

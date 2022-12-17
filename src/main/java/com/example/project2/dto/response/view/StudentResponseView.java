package com.example.project2.dto.response.view;

import com.example.project2.dto.response.StudentResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class StudentResponseView {

    private List<StudentResponse> responses;
}

package com.example.project2.dto.response.view;

import com.example.project2.dto.response.GroupResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class GroupsResponseView {
    List<GroupResponse> groupResponses;
}

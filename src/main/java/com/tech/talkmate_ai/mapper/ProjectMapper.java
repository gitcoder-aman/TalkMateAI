package com.tech.talkmate_ai.mapper;

import com.tech.talkmate_ai.dto.project.ProjectResponse;
import com.tech.talkmate_ai.dto.project.ProjectSummaryResponse;
import com.tech.talkmate_ai.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(source = "name",target = "projectName")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}

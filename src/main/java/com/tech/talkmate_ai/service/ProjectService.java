package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.project.ProjectRequest;
import com.tech.talkmate_ai.dto.project.ProjectResponse;
import com.tech.talkmate_ai.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest projectRequest, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest projectRequest, Long userId);

    void softDelete(Long id, Long userId);
}

package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.project.ProjectRequest;
import com.tech.talkmate_ai.dto.project.ProjectResponse;
import com.tech.talkmate_ai.dto.project.ProjectSummaryResponse;
import com.tech.talkmate_ai.entity.Project;
import com.tech.talkmate_ai.entity.User;
import com.tech.talkmate_ai.mapper.ProjectMapper;
import com.tech.talkmate_ai.repository.ProjectRepository;
import com.tech.talkmate_ai.repository.UserRepository;
import com.tech.talkmate_ai.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder()
                .name(projectRequest.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest projectRequest, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}

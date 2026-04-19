package com.tech.talkmate_ai.controller;

import com.tech.talkmate_ai.dto.project.ProjectRequest;
import com.tech.talkmate_ai.dto.project.ProjectResponse;
import com.tech.talkmate_ai.dto.project.ProjectSummaryResponse;
import com.tech.talkmate_ai.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/projects")
@RestController
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>>getMyProjects(){
        Long userId = 1L; //TODO: update later with real spring Security
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse>getUserProjectById(@PathVariable Long id){
        return  ResponseEntity.ok(projectService.getUserProjectById(id));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse>createProject(@RequestBody ProjectRequest projectRequest){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(projectRequest,userId));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse>updateProject(@PathVariable Long id,@RequestBody ProjectRequest projectRequest){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id,projectRequest,userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteProject(@PathVariable Long id){
        Long userId = 1L;
        projectService.softDelete(id,userId);
        return ResponseEntity.notFound().build();
    }
}

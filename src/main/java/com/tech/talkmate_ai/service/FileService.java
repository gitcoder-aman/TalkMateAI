package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.project.FileContentResponse;
import com.tech.talkmate_ai.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}

package com.tech.talkmate_ai.controller;

import com.tech.talkmate_ai.dto.member.InviteMemberRequest;
import com.tech.talkmate_ai.dto.member.MemberResponse;
import com.tech.talkmate_ai.dto.member.UpdateMemberRoleRequest;
import com.tech.talkmate_ai.entity.ProjectMember;
import com.tech.talkmate_ai.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>>getProjectMembers(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));
    }
    @PostMapping
    public ResponseEntity<MemberResponse>inviteMember(@PathVariable Long projectId,@RequestBody InviteMemberRequest inviteMemberRequest){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                projectMemberService.inviteMember(projectId,inviteMemberRequest,userId)
        );
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse>updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            UpdateMemberRoleRequest updateMemberRoleRequest
    ){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId,memberId,updateMemberRoleRequest,userId));
    }
    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse>deleteMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId,memberId,userId));
    }

}

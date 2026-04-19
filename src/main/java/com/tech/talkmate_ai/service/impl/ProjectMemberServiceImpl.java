package com.tech.talkmate_ai.service.impl;

import com.tech.talkmate_ai.dto.member.InviteMemberRequest;
import com.tech.talkmate_ai.dto.member.MemberResponse;
import com.tech.talkmate_ai.dto.member.UpdateMemberRoleRequest;
import com.tech.talkmate_ai.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest updateMemberRoleRequest, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}

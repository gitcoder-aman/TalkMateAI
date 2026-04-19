package com.tech.talkmate_ai.service;

import com.tech.talkmate_ai.dto.member.InviteMemberRequest;
import com.tech.talkmate_ai.dto.member.MemberResponse;
import com.tech.talkmate_ai.dto.member.UpdateMemberRoleRequest;
import com.tech.talkmate_ai.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest updateMemberRoleRequest, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}

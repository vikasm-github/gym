package com.gym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.Member;
import com.gym.model.MemberEnquiry;
import com.gym.repository.MemberRepo;
import com.gym.service.MemberEnquiryService;
import com.gym.service.MemberService;

@Service
public class MemberImpl implements MemberService{

	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private MemberEnquiryService enquiryService;
	
	@Override
	public Member addMember(Member member) {
//		MemberEnquiry memberEnquiry = enquiryService.getrEnquiryMember(member.getMemberEnquiry().getEnq_id());		
//		member.setMemberEnquiry(memberEnquiry);
		memberRepo.save(member);
//		memberEnquiry.setMember(member);
//		enquiryService.updateEnquiry(memberEnquiry);
		return member;
	}

	@Override
	public List<Member> getMembersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMember(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}

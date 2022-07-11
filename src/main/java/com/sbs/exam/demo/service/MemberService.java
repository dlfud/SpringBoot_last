package com.sbs.exam.demo.service;

import org.springframework.stereotype.Service;

import com.sbs.exam.demo.repository.MemberRepository;
import com.sbs.exam.demo.vo.Member;

@Service
public class MemberService {
	
//	@Autowired
	private MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	public int join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
		//로그인 중복체크
		Member oldMember = memberRepository.getMemberByLoginId(loginId);
		
		if(oldMember != null) {
			return -1;
		}
		
		//이름 이메일 중복체크
		oldMember = memberRepository.getMemberNameEmail(name, email);
		if(oldMember != null) {
			return -2;
		}
		
		memberRepository.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		return memberRepository.getLastInsertId();
	}
	
	public Member getMemberById(int id) {
		return memberRepository.getMemberById(id);
	}
	
	
}

package com.iu.s3.member;

public class MemberService {
	
	//서비스는 멤버디에오에게 의존성이있다. 의존성 주입 :  세터 1, 생성자에다가 2  
	private MemberDAO memberDAO;
	
	public MemberService() {

	}
	
	//주입방법 2  생성자
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	//주입방법1  세터
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
		
	}

}

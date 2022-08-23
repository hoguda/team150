package com.team150.domain;

public class MemberVO {

	private int memberSeq; 					/* 회원번호 */
	
	private String memberName; 				/* 회원이름 */
	
	// TODO 비밀번호는 임시로 암호화하지 않고 저장함 
	private String memeberPw;				/* 회원비밀번호 */
	
	private String memberEmail; 			/* 회원이메일 */

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemeberPw() {
		return memeberPw;
	}

	public void setMemeberPw(String memeberPw) {
		this.memeberPw = memeberPw;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Override
	public String toString() {
		return "MemberVO [memberSeq=" + memberSeq + ", memberName=" + memberName + ", memeberPw=" + memeberPw
				+ ", memberEmail=" + memberEmail + "]";
	}
	
	
}

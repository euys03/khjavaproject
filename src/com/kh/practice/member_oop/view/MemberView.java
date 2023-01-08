package com.kh.practice.member_oop.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member_oop.model.vo.Member;

/** 3. VIEW (Model / View[v] / Controller[v])
 * 출력하는 역할
 * - Controller에서 결정한 데이터의 결과값을 출력하는 부분
**/

//	======= 회원관리 프로그램 =======
//			1. 회원정보 전체조회
//			2. 회원 아이디로 조회
//			3. 회원 이름으로 조회
//			4. 회원가입
//			5. 회원정보 변경
//			6. 회원탈퇴
//			0. 프로그램 종료
//			메뉴 선택 :

public class MemberView {
	// 초기화면
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 변경");
		System.out.println("6. 회원탈퇴(삭제)");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int value = sc.nextInt();	// value값 Run의 choice로 전달.
		return value;	// return을 통해 호출한 곳에서 value를 사용할 수 있도록 한다.
						// *return(반환형) : void -> int
	}
	
	
// ([1]) showAllMember : 여러 데이터를 찾기 위한 메소드
		
	// [1] 회원정보 전체조회
	// 출력 : getter() 메소드 사용
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === 회원정보 전체조회 === === ===");
		for(Member mOne : mList) {
			// > 전달받은 mList를 통해 생성된 mOne에 9개의 데이터가 존재하는지 확인하기 위한 코드(테스트)
//			System.out.println(mOne.toString());
			// > 출력결과 (toString()사용하여 아래와 같이 정보들이 출력됨)
			//Member [memberId=dkdpdldhdn1, memberPwd=pass1, memberName=일용자, memberAge=11, memberGender=ㅇ,
			//memberEmail=뎌누대, memberPhone=010-123-123, memberAddress=서울시 종로구, memberHobby=취미]
			
			// > 출력방법 : getter() 메소드 사용
			System.out.println("회원 아이디 : " + mOne.getMemberId());
			System.out.println("회원 비밀번호 : " + mOne.getMemberPwd());
			System.out.println("회원 이름 : " + mOne.getMemberName());
			System.out.println("회원 성별 : " + mOne.getMemberGender());
			System.out.println("회원 나이 : " + mOne.getMemberAge());
			System.out.println("회원 이메일 : " + mOne.getMemberEmail());
			System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
			System.out.println("회원 주소 : " + mOne.getMemberAddress());
			System.out.println("회원 취미 : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");
		}
	}


	// [2] 회원 아이디로 조회
	// inputMemberId()에 category라는 변수를 만들어 입력되는 값을 출력하도록 한다.
	public String inputMemberId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 아이디 입력 : ");
		String memberId = sc.next();	// 입력받은 값 memberId로 반환
		return memberId;	// memberId 데이터타입: string,  void -> String
	}

	
	// [3] 회원 이름으로 조회
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 회원이름 입력 : ");
		String memberName = sc.next();
		return memberName;		// memberName의 타입은 string이므로 void -> String
	}
	
// ([2], [3]) showOneMember : 하나의 id, 이름 데이터 찾기 위한 메소드
	public void showOneMember(Member mOne) {
		System.out.println("=== === === 회원정보 상세조회 === === ===");
		System.out.println("회원 아이디 : " + mOne.getMemberId());
		System.out.println("회원 이름 : " + mOne.getMemberName());
		System.out.println("회원 성별 : " + mOne.getMemberGender());
		System.out.println("회원 나이 : " + mOne.getMemberAge());
		System.out.println("회원 이메일 : " + mOne.getMemberEmail());
		System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
		System.out.println("회원 주소 : " + mOne.getMemberAddress());
		System.out.println("회원 취미 : " + mOne.getMemberHobby());
	}

	
	
	// [4] 회원가입
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next(); 
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();	// nextLine() 사용시 주의!
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		// (*참조변수) 
		// 참조변수 member를 통해 9개의 데이터를 모델(Model)에 저장하여 모델(Model)을 통해
		// 다른 클래스에 전달 및 받아서 사용이 가능 
		// 9개의 데이터들을 하나의 변수(참조변수)로 다루기 위해 객체(member) 생성
		Member member = new Member();
		// member객체에 입력받은 값 저장(세팅)
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		
		// 모든 정보가 담겨있는 'member' 반환 -> Controller로 전달
		return member;	// return(반환형) : 멤버객체 타입 Member
						// void -> Member
	}
	

	// [5] 회원정보 수정
	public Member modifyMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next(); 
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();	// nextLine() 사용시 주의!
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		// member 객체에 입력받은 값 저장(세팅)
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		// 수정된 모든 정보가 담겨있는 'member' 반환 -> Controller로 전달
		return member;
	}
	

	// 성공하는 메시지 출력 (성공 메소드를 새로 만들어 한 번에 처리)
	public void displaySuccess(String message) {
		System.out.println("[처리 결과] : " + message);
	}

	// 실패(에러)하는 메시지 출력 (실패 메소드를 새로 만들어 한번에 처리)
	public void displayError(String message) {
		System.out.println("[오류 발생] : " + message);
	}

}

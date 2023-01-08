package com.kh.practice.member_oop.run;

import java.util.List;

import com.kh.practice.member_oop.controller.MemberController;
import com.kh.practice.member_oop.model.vo.Member;
import com.kh.practice.member_oop.view.MemberView;

/** 4. RUN
 * 각 역할이 존재하는 클래스들을 연결해주는 공간
 * - 생성한 클래스들을 사용하기 위해 객체를 생성하는 부분이다.
**/


public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();	// View담당 객체 생성 : MemberView파일을 불러온다 (import)
		MemberController mCon = new MemberController(); // Controller담당 객체 생성
		
		done:
		while(true) {
			int choice = view.mainMenu();  // view의 mainMenu()메소드 호출(value 반환)
			switch(choice) {
				case 1 : 
				// 회원정보 전체 조회
					List<Member> mList = mCon.printAllMember();	// Controller에서 printAllMember는 mList를 반환함.
					view.showAllMember(mList);
					// view.showAllMember(mCon.printAllMember()); => 가능
					if(mList == null) {
						System.out.println("현재 회원이 존재하지 않습니다.");
					}
					break;
					
				case 2 : 
				// 아이디로 조회
					String memberId = view.inputMemberId("검색");
					/* // # 방법1 사용 - ( cf) mCon. 인덱스를 리턴 )
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						System.out.println("해당 id를 가진 회원이 존재하지 않습니다.");
					}
					Member mOne = mCon.printOneByIndex(index);
					view.printOneById(mOne);
					 */

					// # 방법2 사용 - ( cf) mCon. 객체를 리턴 -> 인덱스 없이 하는 법 )
					Member mOne = mCon.findMemberid(memberId);
					if(mOne == null) {
						System.out.println("해당 id를 가진 회원이 존재하지 않습니다.");
					}
					view.showOneMember(mOne);
					break;
					
				case 3 : 
				// 이름으로 조회
					String memberName = view.inputMemberName();	
						// view에서 회원이름 입력받기 -> 입력받은 값 Controller로 전달
					Member memberOne = mCon.findMemberName(memberName);
					if(memberOne == null) {
						System.out.println("해당 이름을 가진 회원이 존재하지 않습니다.");
					}
					view.showOneMember(memberOne);
					break;
					
				case 4 : 
				// 회원가입
						// view의 inputMember(모든 입력값)를 받아와 member로 저장
					Member member = view.inputMember();
						// 모든 입력값이 저장된 member를 Controller의 registerMember로 전달하여 mList에 저장
					mCon.registerMember(member);
					//System.out.println("가입이 완료되었습니다.");
					view.displaySuccess("가입이 완료되었습니다.");
					break;
					
				case 5 : 
				// 회원정보 수정
					member = view.modifyMember();
					mCon.updateMember(member);
					view.displaySuccess("수정이 완료되었습니다.");
					break;
					
				case 6 : 
				// 회원탈퇴
					memberId = view.inputMemberId("삭제");
					int index = mCon.findMemberIndex(memberId);
					mCon.removeMember(index);
					//System.out.println("계정이 삭제되었습니다.");
					view.displaySuccess("계정이 삭제되었습니다.");
					break;
					
				case 0 : 
				// 프로그램 종료
					break done;
				
				
			}
		}

	}

}

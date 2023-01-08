package com.kh.practice.member_oop.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member_oop.model.vo.Member;

/** 2. CONTROLLER (Model / View / Controller[v])
 * 공간을 할당받고 데이터를 넘겨받는 공간 (기능들)
 * - Model에서 넘겨받은 데이터를 저장할지 말지 결정한다
**/


// 1. 레퍼런스변수
public class MemberController {
	List<Member> mList;	// 배열 대신 ArrayList 추가
	
	// 2. 공간할당 ( mList[0] ~ mList[n], ArrayList는 배열과 달리 공간을 계속하여 늘릴 수 있다.)
	public MemberController() {	// 생성자의 역할 : 객체를 초기화(mList)
	// 배열의 단점을 보완한 List 사용: 배열, 메소드를 통해 순서 유지, 중복으로 저장 및 나열 가능
		mList = new ArrayList<Member>();
	}
	
	// 3. 할당된 공간에 값 추가 ( mList[0]= , mList[1]= , )
	// - 값 추가하는 메소드들 ( 입력한 값들 받아서 저장하는 역할)
	/**
	 * [4] 회원가입
	 * @param
	**/
	public void registerMember(Member member) {	// view에서 return한 매개변수 member를 전달받음(외부변수)
	// c[i] = new Circle();	=> 배열: 전달받지 않고 '객체'를 넣어주었다.
		mList.add(member);	// ArrayList: 넘겨받은 member만 추가하여 최종저장소(mList)에 저장 및 객체 연결		
	}

	
	/**
	 * [1] 회원정보 전체조회
	 * @param
	 * @return mList
	**/
	public List<Member> printAllMember() {
		return mList;	// 모든 데이터는 mList 안에 있으므로 mList를 반환 및 View로 전달.
						// return(반환형): mList의 자료형인 List<Member>로 변경
	}
	
	
	/**
	 * [2] (방법1) 회원 아이디로 조회
	 * @param 
	 * @return memberId
	 * */
	// - 회원 아이디로 조회 ( inputMemberId()로 썼었지만 회원삭제파트와 inputMemberIndex()로 동일하게 사용 )
	
	// # 방법1) 동일한 값이 존재할 때 '인덱스'를 리턴 (인덱스를 찾는 것)
	/*
	public int findMemberId(String memberId) { 		// 1) view에서 입력받은 memberId데이터 받기
			// (매개변수자리에 변수명은 memberId가 아닌 ID 등 view와 달라도 되며, 같은 데이터 타입이 오는 것이 중요)
		
		for(int i = 0; i < mList.size(); i++) {			// 2) memberId와 같은 데이터가 mList에 있는지 찾아보기!
			Member mOne = mList.get(i);					// 3) mList의 데이터를 하나 꺼내어 레퍼런스 변수(mOne)에 넣어주기
			if(memberId.equals(mOne.getMemberId())) {	// 4) 넘겨받은 memberId가 mOne에 있는지 확인
				//System.out.println(mOne.toString());	// 출력은 view(printOneById)에서 실행

				return i;					// 인덱스를 리턴하여 view로 전달. (void -> int)
				// but. view로 전달하여도 view에는 mList가 없어 출력 불가능하므로 리턴된 인덱스 값을 이용하여
				// 데이터를 찾은 결과(member변수)를 view.printOneById()에 전달한다.
			}
		}
		return -1;					// 동일한 데이터를 찾지 못한 경우 -1 반환
	}
	// # 방법1-1) 리턴된 인덱스 값[i]을 이용하여 데이터 찾기
	public Member printOneByIndex(int index) {	// 리턴값 i 가 매개변수로 넘어와서
		Member member = mList.get(index);	// mList에서 하나의 인덱스[i]를 꺼내온다.
		return member;	// void -> Member
	}
	*/
	
	public int findMemberIndex(String memberId) {	// 1) view에서 입력받은 memberId데이터 받기
		for(int i = 0; i < mList.size(); i++) {		// 2) memberId와 같은 데이터가 mList에 있는지 찾아보기!
			Member mOne = mList.get(i);				// 3) mList의 데이터를 하나 꺼내어 레퍼런스 변수(mOne)에 저장
			if(memberId.equals(mOne.getMemberId())) {	// 4) 넘겨받은 memberId가 mOne에 있는지 확인

				return i;					// 인덱스를 리턴하여 view로 전달. (void -> int)
			}
		}
		return -1;
	}
	/**
	 * [2] (방법2) 회원 아이디로 조회
	 * @param
	 * @return memberId
	**/
	// # 방법2) 같은 값이 있을 때 '객체'를 리턴 (인덱스 없이 하는 법)
	public Member findMemberid(String memberId) {		// 1) view에서 입력받은 memberId데이터 받기
		for(int i = 0; i < mList.size(); i++) {			// 2) memberId와 같은 데이터가 mList에 있는지 찾아보기!
			Member mOne =  mList.get(i);				// 3) mList의 데이터를 하나 꺼내어 레퍼런스 변수(mOne)에 저장
			if(memberId.equals(mOne.getMemberId())) {	// 4) 넘겨받은 memberId가 mOne에 있는지 확인
				return mOne; // mOne의 자료형 Member	// 5) 존재한다면 인덱스 리턴이 아닌 mOne객체를 바로 view.printOneById로 전달
			}
		}
		return null;
	}	// 객체를 리턴하는 방법을 사용하면 아래 인덱스를 통해 찾는(#방법1-1) Member 코드가 필요없다.

	
	
	/**
	 * [3] 회원 이름으로 조회
	 * @param
	 * @return memberName
	**/
	// - 회원 이름으로 조회 ( inputMemberName() )
	public Member findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return mOne;	// mOne의 자료형 Member
			}
		}
		return null;
	}

	
	/** 
	 * [5] 회원정보 수정
	 * @param
	**/
	// view에서 수정된 모든 정보가 담겨있는 'member'를 전달받음
	public void updateMember(Member member) {			// 1) view에서 수정된 member데이터 받기
		for(int i = 0; i < mList.size(); i++) {			// 2) member와 같은 데이터가 mList에 있는지 찾아보기!
			String memberId = member.getMemberId();		// 3) 수정한 값이 있는 member에서 데이터를 가져와 memberId에 저장
			Member storedMember = mList.get(i);			// 4) mList의 데이터를 하나씩 꺼내어 레퍼런스 변수(storedMember)에 저장
			String storedId = storedMember.getMemberId(); // 5) storedMember의 id를 하나 꺼내어 레퍼런스 변수(storedId)에 저장
			if(storedId.equals(memberId)) {				// 6) 입력(수정)한 id(memberId)와 하나 꺼낸 id(storedId)가 일치(존재)하는지 확인
				// 일치(존재)한다면 (비밀번호,이메일,전화번호,주소,취미)의 정보를 수정하겠다.
				storedMember.setMemberPwd(member.getMemberPwd());
				storedMember.setMemberEmail(member.getMemberEmail());
				storedMember.setMemberPhone(member.getMemberPhone());
				storedMember.setMemberAddress(member.getMemberAddress());
				storedMember.setMemberHobby(member.getMemberHobby());
			}
		}
	}

	
	/**
	 * [6] 회원탈퇴(회원 삭제)
	 * - remove()
	**/
	public void removeMember(int index) {
		mList.remove(index);
	}
	
}

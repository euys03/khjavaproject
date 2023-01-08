package com.kh.practice.member_oop.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member_oop.model.vo.Member;

/** 2. CONTROLLER (Model / View / Controller[v])
 * ������ �Ҵ�ް� �����͸� �Ѱܹ޴� ���� (��ɵ�)
 * - Model���� �Ѱܹ��� �����͸� �������� ���� �����Ѵ�
**/


// 1. ���۷�������
public class MemberController {
	List<Member> mList;	// �迭 ��� ArrayList �߰�
	
	// 2. �����Ҵ� ( mList[0] ~ mList[n], ArrayList�� �迭�� �޸� ������ ����Ͽ� �ø� �� �ִ�.)
	public MemberController() {	// �������� ���� : ��ü�� �ʱ�ȭ(mList)
	// �迭�� ������ ������ List ���: �迭, �޼ҵ带 ���� ���� ����, �ߺ����� ���� �� ���� ����
		mList = new ArrayList<Member>();
	}
	
	// 3. �Ҵ�� ������ �� �߰� ( mList[0]= , mList[1]= , )
	// - �� �߰��ϴ� �޼ҵ�� ( �Է��� ���� �޾Ƽ� �����ϴ� ����)
	/**
	 * [4] ȸ������
	 * @param
	**/
	public void registerMember(Member member) {	// view���� return�� �Ű����� member�� ���޹���(�ܺκ���)
	// c[i] = new Circle();	=> �迭: ���޹��� �ʰ� '��ü'�� �־��־���.
		mList.add(member);	// ArrayList: �Ѱܹ��� member�� �߰��Ͽ� ���������(mList)�� ���� �� ��ü ����		
	}

	
	/**
	 * [1] ȸ������ ��ü��ȸ
	 * @param
	 * @return mList
	**/
	public List<Member> printAllMember() {
		return mList;	// ��� �����ʹ� mList �ȿ� �����Ƿ� mList�� ��ȯ �� View�� ����.
						// return(��ȯ��): mList�� �ڷ����� List<Member>�� ����
	}
	
	
	/**
	 * [2] (���1) ȸ�� ���̵�� ��ȸ
	 * @param 
	 * @return memberId
	 * */
	// - ȸ�� ���̵�� ��ȸ ( inputMemberId()�� ������� ȸ��������Ʈ�� inputMemberIndex()�� �����ϰ� ��� )
	
	// # ���1) ������ ���� ������ �� '�ε���'�� ���� (�ε����� ã�� ��)
	/*
	public int findMemberId(String memberId) { 		// 1) view���� �Է¹��� memberId������ �ޱ�
			// (�Ű������ڸ��� �������� memberId�� �ƴ� ID �� view�� �޶� �Ǹ�, ���� ������ Ÿ���� ���� ���� �߿�)
		
		for(int i = 0; i < mList.size(); i++) {			// 2) memberId�� ���� �����Ͱ� mList�� �ִ��� ã�ƺ���!
			Member mOne = mList.get(i);					// 3) mList�� �����͸� �ϳ� ������ ���۷��� ����(mOne)�� �־��ֱ�
			if(memberId.equals(mOne.getMemberId())) {	// 4) �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
				//System.out.println(mOne.toString());	// ����� view(printOneById)���� ����

				return i;					// �ε����� �����Ͽ� view�� ����. (void -> int)
				// but. view�� �����Ͽ��� view���� mList�� ���� ��� �Ұ����ϹǷ� ���ϵ� �ε��� ���� �̿��Ͽ�
				// �����͸� ã�� ���(member����)�� view.printOneById()�� �����Ѵ�.
			}
		}
		return -1;					// ������ �����͸� ã�� ���� ��� -1 ��ȯ
	}
	// # ���1-1) ���ϵ� �ε��� ��[i]�� �̿��Ͽ� ������ ã��
	public Member printOneByIndex(int index) {	// ���ϰ� i �� �Ű������� �Ѿ�ͼ�
		Member member = mList.get(index);	// mList���� �ϳ��� �ε���[i]�� �����´�.
		return member;	// void -> Member
	}
	*/
	
	public int findMemberIndex(String memberId) {	// 1) view���� �Է¹��� memberId������ �ޱ�
		for(int i = 0; i < mList.size(); i++) {		// 2) memberId�� ���� �����Ͱ� mList�� �ִ��� ã�ƺ���!
			Member mOne = mList.get(i);				// 3) mList�� �����͸� �ϳ� ������ ���۷��� ����(mOne)�� ����
			if(memberId.equals(mOne.getMemberId())) {	// 4) �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��

				return i;					// �ε����� �����Ͽ� view�� ����. (void -> int)
			}
		}
		return -1;
	}
	/**
	 * [2] (���2) ȸ�� ���̵�� ��ȸ
	 * @param
	 * @return memberId
	**/
	// # ���2) ���� ���� ���� �� '��ü'�� ���� (�ε��� ���� �ϴ� ��)
	public Member findMemberid(String memberId) {		// 1) view���� �Է¹��� memberId������ �ޱ�
		for(int i = 0; i < mList.size(); i++) {			// 2) memberId�� ���� �����Ͱ� mList�� �ִ��� ã�ƺ���!
			Member mOne =  mList.get(i);				// 3) mList�� �����͸� �ϳ� ������ ���۷��� ����(mOne)�� ����
			if(memberId.equals(mOne.getMemberId())) {	// 4) �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
				return mOne; // mOne�� �ڷ��� Member	// 5) �����Ѵٸ� �ε��� ������ �ƴ� mOne��ü�� �ٷ� view.printOneById�� ����
			}
		}
		return null;
	}	// ��ü�� �����ϴ� ����� ����ϸ� �Ʒ� �ε����� ���� ã��(#���1-1) Member �ڵ尡 �ʿ����.

	
	
	/**
	 * [3] ȸ�� �̸����� ��ȸ
	 * @param
	 * @return memberName
	**/
	// - ȸ�� �̸����� ��ȸ ( inputMemberName() )
	public Member findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return mOne;	// mOne�� �ڷ��� Member
			}
		}
		return null;
	}

	
	/** 
	 * [5] ȸ������ ����
	 * @param
	**/
	// view���� ������ ��� ������ ����ִ� 'member'�� ���޹���
	public void updateMember(Member member) {			// 1) view���� ������ member������ �ޱ�
		for(int i = 0; i < mList.size(); i++) {			// 2) member�� ���� �����Ͱ� mList�� �ִ��� ã�ƺ���!
			String memberId = member.getMemberId();		// 3) ������ ���� �ִ� member���� �����͸� ������ memberId�� ����
			Member storedMember = mList.get(i);			// 4) mList�� �����͸� �ϳ��� ������ ���۷��� ����(storedMember)�� ����
			String storedId = storedMember.getMemberId(); // 5) storedMember�� id�� �ϳ� ������ ���۷��� ����(storedId)�� ����
			if(storedId.equals(memberId)) {				// 6) �Է�(����)�� id(memberId)�� �ϳ� ���� id(storedId)�� ��ġ(����)�ϴ��� Ȯ��
				// ��ġ(����)�Ѵٸ� (��й�ȣ,�̸���,��ȭ��ȣ,�ּ�,���)�� ������ �����ϰڴ�.
				storedMember.setMemberPwd(member.getMemberPwd());
				storedMember.setMemberEmail(member.getMemberEmail());
				storedMember.setMemberPhone(member.getMemberPhone());
				storedMember.setMemberAddress(member.getMemberAddress());
				storedMember.setMemberHobby(member.getMemberHobby());
			}
		}
	}

	
	/**
	 * [6] ȸ��Ż��(ȸ�� ����)
	 * - remove()
	**/
	public void removeMember(int index) {
		mList.remove(index);
	}
	
}

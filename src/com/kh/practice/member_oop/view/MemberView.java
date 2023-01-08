package com.kh.practice.member_oop.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member_oop.model.vo.Member;

/** 3. VIEW (Model / View[v] / Controller[v])
 * ����ϴ� ����
 * - Controller���� ������ �������� ������� ����ϴ� �κ�
**/

//	======= ȸ������ ���α׷� =======
//			1. ȸ������ ��ü��ȸ
//			2. ȸ�� ���̵�� ��ȸ
//			3. ȸ�� �̸����� ��ȸ
//			4. ȸ������
//			5. ȸ������ ����
//			6. ȸ��Ż��
//			0. ���α׷� ����
//			�޴� ���� :

public class MemberView {
	// �ʱ�ȭ��
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== === === ȸ������ ���α׷� === === ===");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ȸ��Ż��(����)");
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ���� : ");
		int value = sc.nextInt();	// value�� Run�� choice�� ����.
		return value;	// return�� ���� ȣ���� ������ value�� ����� �� �ֵ��� �Ѵ�.
						// *return(��ȯ��) : void -> int
	}
	
	
// ([1]) showAllMember : ���� �����͸� ã�� ���� �޼ҵ�
		
	// [1] ȸ������ ��ü��ȸ
	// ��� : getter() �޼ҵ� ���
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === ȸ������ ��ü��ȸ === === ===");
		for(Member mOne : mList) {
			// > ���޹��� mList�� ���� ������ mOne�� 9���� �����Ͱ� �����ϴ��� Ȯ���ϱ� ���� �ڵ�(�׽�Ʈ)
//			System.out.println(mOne.toString());
			// > ��°�� (toString()����Ͽ� �Ʒ��� ���� �������� ��µ�)
			//Member [memberId=dkdpdldhdn1, memberPwd=pass1, memberName=�Ͽ���, memberAge=11, memberGender=��,
			//memberEmail=������, memberPhone=010-123-123, memberAddress=����� ���α�, memberHobby=���]
			
			// > ��¹�� : getter() �޼ҵ� ���
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� ��й�ȣ : " + mOne.getMemberPwd());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");
		}
	}


	// [2] ȸ�� ���̵�� ��ȸ
	// inputMemberId()�� category��� ������ ����� �ԷµǴ� ���� ����ϵ��� �Ѵ�.
	public String inputMemberId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "�� ���̵� �Է� : ");
		String memberId = sc.next();	// �Է¹��� �� memberId�� ��ȯ
		return memberId;	// memberId ������Ÿ��: string,  void -> String
	}

	
	// [3] ȸ�� �̸����� ��ȸ
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ȸ���̸� �Է� : ");
		String memberName = sc.next();
		return memberName;		// memberName�� Ÿ���� string�̹Ƿ� void -> String
	}
	
// ([2], [3]) showOneMember : �ϳ��� id, �̸� ������ ã�� ���� �޼ҵ�
	public void showOneMember(Member mOne) {
		System.out.println("=== === === ȸ������ ����ȸ === === ===");
		System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
		System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
		System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
		System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
		System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
		System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
		System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
		System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
	}

	
	
	// [4] ȸ������
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next(); 
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸� : ");
		String memberName = sc.next();
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		System.out.print("���� : ");
		String memberGender = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();	// nextLine() ���� ����!
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		// (*��������) 
		// �������� member�� ���� 9���� �����͸� ��(Model)�� �����Ͽ� ��(Model)�� ����
		// �ٸ� Ŭ������ ���� �� �޾Ƽ� ����� ���� 
		// 9���� �����͵��� �ϳ��� ����(��������)�� �ٷ�� ���� ��ü(member) ����
		Member member = new Member();
		// member��ü�� �Է¹��� �� ����(����)
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		
		// ��� ������ ����ִ� 'member' ��ȯ -> Controller�� ����
		return member;	// return(��ȯ��) : �����ü Ÿ�� Member
						// void -> Member
	}
	

	// [5] ȸ������ ����
	public Member modifyMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next(); 
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();	// nextLine() ���� ����!
		String memberAddress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		// member ��ü�� �Է¹��� �� ����(����)
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		// ������ ��� ������ ����ִ� 'member' ��ȯ -> Controller�� ����
		return member;
	}
	

	// �����ϴ� �޽��� ��� (���� �޼ҵ带 ���� ����� �� ���� ó��)
	public void displaySuccess(String message) {
		System.out.println("[ó�� ���] : " + message);
	}

	// ����(����)�ϴ� �޽��� ��� (���� �޼ҵ带 ���� ����� �ѹ��� ó��)
	public void displayError(String message) {
		System.out.println("[���� �߻�] : " + message);
	}

}

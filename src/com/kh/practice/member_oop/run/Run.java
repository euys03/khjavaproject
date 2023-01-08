package com.kh.practice.member_oop.run;

import java.util.List;

import com.kh.practice.member_oop.controller.MemberController;
import com.kh.practice.member_oop.model.vo.Member;
import com.kh.practice.member_oop.view.MemberView;

/** 4. RUN
 * �� ������ �����ϴ� Ŭ�������� �������ִ� ����
 * - ������ Ŭ�������� ����ϱ� ���� ��ü�� �����ϴ� �κ��̴�.
**/


public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();	// View��� ��ü ���� : MemberView������ �ҷ��´� (import)
		MemberController mCon = new MemberController(); // Controller��� ��ü ����
		
		done:
		while(true) {
			int choice = view.mainMenu();  // view�� mainMenu()�޼ҵ� ȣ��(value ��ȯ)
			switch(choice) {
				case 1 : 
				// ȸ������ ��ü ��ȸ
					List<Member> mList = mCon.printAllMember();	// Controller���� printAllMember�� mList�� ��ȯ��.
					view.showAllMember(mList);
					// view.showAllMember(mCon.printAllMember()); => ����
					if(mList == null) {
						System.out.println("���� ȸ���� �������� �ʽ��ϴ�.");
					}
					break;
					
				case 2 : 
				// ���̵�� ��ȸ
					String memberId = view.inputMemberId("�˻�");
					/* // # ���1 ��� - ( cf) mCon. �ε����� ���� )
					int index = mCon.findMemberId(memberId);
					if(index == -1) {
						System.out.println("�ش� id�� ���� ȸ���� �������� �ʽ��ϴ�.");
					}
					Member mOne = mCon.printOneByIndex(index);
					view.printOneById(mOne);
					 */

					// # ���2 ��� - ( cf) mCon. ��ü�� ���� -> �ε��� ���� �ϴ� �� )
					Member mOne = mCon.findMemberid(memberId);
					if(mOne == null) {
						System.out.println("�ش� id�� ���� ȸ���� �������� �ʽ��ϴ�.");
					}
					view.showOneMember(mOne);
					break;
					
				case 3 : 
				// �̸����� ��ȸ
					String memberName = view.inputMemberName();	
						// view���� ȸ���̸� �Է¹ޱ� -> �Է¹��� �� Controller�� ����
					Member memberOne = mCon.findMemberName(memberName);
					if(memberOne == null) {
						System.out.println("�ش� �̸��� ���� ȸ���� �������� �ʽ��ϴ�.");
					}
					view.showOneMember(memberOne);
					break;
					
				case 4 : 
				// ȸ������
						// view�� inputMember(��� �Է°�)�� �޾ƿ� member�� ����
					Member member = view.inputMember();
						// ��� �Է°��� ����� member�� Controller�� registerMember�� �����Ͽ� mList�� ����
					mCon.registerMember(member);
					//System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 5 : 
				// ȸ������ ����
					member = view.modifyMember();
					mCon.updateMember(member);
					view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 6 : 
				// ȸ��Ż��
					memberId = view.inputMemberId("����");
					int index = mCon.findMemberIndex(memberId);
					mCon.removeMember(index);
					//System.out.println("������ �����Ǿ����ϴ�.");
					view.displaySuccess("������ �����Ǿ����ϴ�.");
					break;
					
				case 0 : 
				// ���α׷� ����
					break done;
				
				
			}
		}

	}

}

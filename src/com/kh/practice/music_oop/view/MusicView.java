package com.kh.practice.music_oop.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.kh.practice.music_oop.model.vo.Music;

public class MusicView {

	public int musicMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === ���� �޴� === ===");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ��������");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ��� �������� ����");
		System.out.println("9. ������ �������� ����");
		System.out.println("10. ������ �������� ����");
		System.out.println("0. ����");
		System.out.print("�޴� ���� >> ");
		int value = sc.nextInt();
		return value;	// ��ȯ��(return): void -> int
		
	}
	
	
	
	
	// [1],[2] 'ù' or '������' ��ġ�� �� �߰�
	// �ϳ��� �żҵ带 �Ű�����ȭ(category��� ������ ����� ��Ȳ�� �°� ���)
	public Music inputMusicInfo(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + " ��ġ�� �� �߰�");
		System.out.print("��� : ");
		String title = sc.nextLine();
		System.out.print("������ : ");
		String singer = sc.nextLine();	// ���, ������ ���Ⱑ ������ �� ������ nextLine(); ���

		// �� ���� ����(���, ������)�� �ϳ��� ������ �ٷ�� ���� ��ü�� �ʿ���!
		// 	-> model.vo(Music)���� title, singer ��ü �����
		//Music music = new Music();	=> error : The constructor Music() is undefined
		// �ذ���) Music���� �Ű������ִ� �����ڸ� ���������Ƿ� �Ű����� ������ ���� �Ű������� �޾ƾ���
		Music music = new Music(title, singer);
		return music;	// Run�� ��ü�� ������ ��.
	}
	
	
	
	// [3] ��ü �� ��� ���
	public void showAllMusicList(List<Music> mList) {	// �Ű�������(allList�� mList)�� �޶� �������.(�Ѿ���� ���� �߿�)
		System.out.println("====== ��ü �� ��� ��� ======");
		// *for-each�� : index �Ű澲�� �ʰ� ��밡��
		// index ����Ͽ� ���
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i+1) + "��° �뷡 -> " + "��� : " + music.getTitle() + ", ������ : " + music.getSinger());
		}
	}

	
	
	// [4, 5] Ư�� �� �˻� & Ư�� �� ����
	// �˻��� ���� �Է����ּ��� => Run�� �Ѱ��� -> Controller�� searchOneByName���� �ް�, index�� ��ȯ�Ͽ� selectOneByIndex()�� ����
	public String inputMusicName(String gubun) {
		Scanner sc = new Scanner(System.in);
		System.out.print(gubun + "�� �� �Է� : ");
		String title = sc.nextLine();
		return title;	// Run�� title���� ����.
	}
	// [4-1] �ε���(���)�� ���� ����Ʈ���� ��ȸ�� �˻������ ����ϱ� ���� �޼ҵ�
	public void showOneMusic(Music music) {
		System.out.println("�˻��� ���� ����� : " + music.getTitle() + ", �������� : " + music.getSinger() + "�Դϴ�.");
	}
	
	

	// [6] Ư�� �� ��������
		// ���� - ���1. '������'�� �����ϴ� ���
	public Music modifyMusicInfo(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է� : ");
		String singer = sc.nextLine();
		music.setSinger(singer);
		return music;
	}
		// ���� - ���2. '���'�� '������'�� ���� �����ϴ� ���
		// 	-> �ε����� �����͸� ������ �ʿ����. => �����ε�(*�Ű���������*)�Ͽ� 2��° ��� �Է�
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ ������ �Է� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	

	
	// [7 ~ 10] ��¹� ��� �޼ҵ�(Run���� system.out.println() ��� ��¹� �ۼ��ϴ� ���)
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	
	
	// ����, ���� �޽��� ���
	public void displaySuccess(String message) {
		System.out.println("[���� ����] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[���� ����] : " + message);
		
	}
	
	
	
	
}

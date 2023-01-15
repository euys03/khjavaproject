package com.kh.practice.music_oop.run;

import java.util.List;

import com.kh.practice.muisc_oop.controller.MusicController;
import com.kh.practice.music_oop.model.vo.Music;
import com.kh.practice.music_oop.view.MusicView;

public class Run {
	public static void main(String[] args) {
		
		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		String title = "";
		int select = 0;
		int index = 0;
		Music music = null;
		
		// do-while�� ���(���� ���� �� ���߿� ���� üũ)
		do {
			select = view.musicMenu();
			switch(select) {
				case 1 : 
					music = view.inputMusicInfo("������");
					mCon.addAtLast(music);
					view.displaySuccess("�߰� ����!");
					break;
					
				case 2 :
					music = view.inputMusicInfo("ù");
					mCon.addAtZero(music);
					view.displaySuccess("�߰� ����!");
					break;
					
				case 3 :
					List<Music> allList = mCon.printMusicList();
					view.showAllMusicList(allList);
					view.displaySuccess("��ȸ ����!");
					break;
					
				case 4 :
					// Controller -> ������ ������ �� ����Ʈ �˻�
					title = view.inputMusicName("�˻�");
//					index = mCon.searchOneByName(title);
//					music = mCon.selectOneByIndex(index);
//					view.showOneMusic(music);
					List<Music> findList = mCon.searchMusicsByName(title);
					view.showAllMusicList(findList);
					// ���� �޽��� ���
					view.displaySuccess("��ȸ ����!");
					break;
					
				case 5 :
					title = view.inputMusicName("����");
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displaySuccess("�������� �ʽ��ϴ�.");
						break;
					}
					mCon.removeMusic(index);
					view.displaySuccess("���� ����!");
					break;
					
				case 6 : 
				// ���1. (������ �����ϴ� ���)
//					// 1) �̸� �ޱ�
//					title = view.inputMusicName("����");
//					// 2) �̸����� �ε��� �˻�, ���� ���� üũ��
//					index = mCon.searchOneByName(title);
//					if(index == -1) {
//						view.displayError("��ȸ ����!");
//						break;
//					}
//					// 3) �ε����� ������ ��������
//					music = mCon.selectOneByIndex(index);
//					// 4) ������ ������ ����
//					music = view.modifyMusicInfo(music);
//					// 5) ����ҿ� �����ϱ�
//					mCon.updateMusic(index, music);
					
				// ���2. (���� �������� ��� �����ϴ� ���)
					// -> �ε����� �����͸� ������ �ʿ䰡 ����.
					// 1) �̸� �ޱ�
					title = view.inputMusicName("����");
					// 2) �̸����� �ε��� �˻�, ���� ���� üũ��
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displayError("��ȸ ����!");
						break;
					}
					// 3) ������ ����(�Ű��������� modifyMusicInfo �޼ҵ� ���)
					music = view.modifyMusicInfo();
					// 4) ����ҿ� �����ϱ�
					mCon.updateMusic(index, music);
					break;
					
				case 7 :
					//System.out.println("��� �������� ����");  
					// sysout�� ��� printMessage �޼ҵ带 ����Ͽ� ���
					view.printMessage("=== === ��� �������� ���� === ===");
					mCon.sortByTitleASC();
					view.printMessage("������������ ����! 3���� ���� ������ּ���:)");
					break;
					
				case 8 : 
					view.printMessage("=== === ��� �������� ���� === ===");
					mCon.sortByTitleDESC();
					view.printMessage("������������ ����! 3���� ���� ������ּ���:)");
					break;
					
				case 9 :
					view.printMessage("=== === ������ �������� ���� === ===");
					mCon.sortBySingerASC();
					view.printMessage("�������� ���� ����! 3���� ���� ������ּ���~");
					break;
					
				case 10 :
					view.printMessage("=== === ������ �������� ���� === ===");
					mCon.sortBySingerDESC();
					view.printMessage("�������� ���� ����! 3���� ���� ������ּ���~");
					break;
			}
			
		} while(select != 0);	// �޴�����:0 �� �Ǹ� ��������
								// do-while�� ��� -> break �ʿ� ����

	}

}


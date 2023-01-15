package com.kh.practice.muisc_oop.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music_oop.model.vo.Music;

// ���� �����(ArrayList)
public class MusicController {
	private List<Music> mList;
	
	// �⺻������ ���� �� �ʱ�ȭ(ArrayList)
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	
	/**
	 * [1] ������ ��ġ�� �� �߰�
	 * @param music
	 * .add ȣ�� �� ( add(Music e) : boolean - List )����
	**/
	public void addAtLast(Music music) {
		mList.add(music);
	}
	
	
	/**
	 * [2] ù ��ġ�� �� �߰� (add �޼ҵ� ���)
	 * @param music
	 * .add ȣ�� �� ( add(int index, Music element) : void ) ����
	 * -> int index(��ġ����), Music element(�Ѱܹ��� ��)
	**/
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	
	/**
	 * [3] ��ü ������ ��ȸ
	 * @return
	**/
	public List<Music> printMusicList() {
		return mList;	// mList�� ������Ÿ�� List<Music>
	}

	
	/**
	 * [4] �̸����� ���� ��� �˻�
	 * @param title
	**/
	// ������ ������ �� ����Ʈ �˻� -> List ���
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne : mList) {
			if(mOne.getTitle().equals(title)) {		// ����� ���� �� ���翩�� Ȯ��
				findList.add(mOne);					// ����Ʈ�� ��� �߰�(�����ϴ� ���)
			}
		}
		return findList;	// findList�� �ڷ��� List<Music> , void -> List<Music>
	}
	
	/**
	 * [5] Ư�� �� ���� (remove �޼ҵ� ���)
	 * @param index
	**/
	public void removeMusic(int index) {
		mList.remove(index);
	}
	
	/**
	 * [4-1, 5-1] �̸�(���)���� �ε��� ��ȸ
	 * @param musicName
	 * @return
	**/
	// 1. index�� return.(int) -> �ε����� ������.
	public int searchOneByName(String musicName) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * [4-2, 5-2] �̸�(���)���� ��ȸ�� �ε����� ����Ʈ���� ��ȸ(�ε����� �̿��� �ϳ��� �� ���)
	 * @param index
	 * @return Music
	**/
	// 2. searchOneByName���� ��ȯ�� index�� ���� ����Ʈ���� ��ȸ -> �ε����� �̿��� �ϳ��� ���� ������.
	public Music selectOneByIndex(int index) {
		return mList.get(index);	// return���� �ڷ��� : Music
	}

	
	/**
	 * [6] Ư�� �� ���� (set �޼ҵ� ���)
	 * @param index
	 * @param music
	**/
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	
	/**
	 * [7] ��� �������� ����
	**/
	public void sortByTitleASC() {
		// ���� �����ϱ�1. (�������� ��������)
		// -> �����϶� ������ ��Ȳ(��Һ� ����)
		int [] nums = {4, 3, 2, 1};
		for(int i = 1; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// ERROR : The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// �ذ��� : compareTo() �޼ҵ� ��� : ���ڰ� �ƴ� �� ��ü(���ڿ�)�� ��Һ� ����
				//			>>	(�����ڵ尪�� �ٰ��Ͽ� ���ϹǷ� �ѱ��� �Ұ���)
				//			>>	0 : �� ���ڿ��� ���� / -1(����) : �������� / 1(���) : �������� 
				// ex) mOne.getTitle()�� mTwo.getTitle() �� �� 0���� ������(����) �տ� �ִ� mOne.getTitle()�� �������� ��������.
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
				
		// (����) ��������ver.
//		for(int i = 0; i < nums.length-1; i++) {
//			for(int e = 0; e <nums.length-i-1; e++) {
//				if(nums[i] > nums[i+1]) {
//					int temp = nums[i+1];
//					nums[i+1] = nums[i];
//					nums[i] = temp;
//				}
//			}
//		}
			}
		}
	}
	
	
	/**
	 * [8] ��� �������� ����
	**/
	public void sortByTitleDESC() {
		// ���� �����ϱ�2. (�������� ��������)
		// -> �����϶� ������ ��Ȳ(��Һ� ����)
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// ERROR : The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// �ذ��� : compareTo() �޼ҵ� ��� : ���ڰ� �ƴ� �� ��ü(���ڿ�)�� ��Һ� ����
				//			>>	(�����ڵ尪�� �ٰ��Ͽ� ���ϹǷ� �ѱ��� �Ұ���)
				//			>>	0 : �� ���ڿ��� ���� / -1(����) : �������� / 1(���) : �������� 
				// ex) mOne.getTitle()�� mTwo.getTitle() �� �� 0���� ũ��(���) �տ� �ִ� mOne.getTitle()�� �������� ��������.
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	
	/**
	 * [9] ������ �������� ����
	**/
	public void sortBySingerASC() {
		// ������ �����ϱ�1. ��������
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(e);
				
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	
	/**
	 * [10] ������ �������� ����
	**/
	public void sortBySingerDESC() {
		// ������ �����ϱ�1. ��������
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(e);
				
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}		
	}
	
	
}

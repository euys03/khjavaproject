package com.kh.practice.muisc_oop.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music_oop.model.vo.Music;

// 최종 저장소(ArrayList)
public class MusicController {
	private List<Music> mList;
	
	// 기본생성자 생성 및 초기화(ArrayList)
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	
	/**
	 * [1] 마지막 위치에 곡 추가
	 * @param music
	 * .add 호출 시 ( add(Music e) : boolean - List )선택
	**/
	public void addAtLast(Music music) {
		mList.add(music);
	}
	
	
	/**
	 * [2] 첫 위치에 곡 추가 (add 메소드 사용)
	 * @param music
	 * .add 호출 시 ( add(int index, Music element) : void ) 선택
	 * -> int index(위치지정), Music element(넘겨받을 값)
	**/
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	
	/**
	 * [3] 전체 데이터 조회
	 * @return
	**/
	public List<Music> printMusicList() {
		return mList;	// mList의 데이터타입 List<Music>
	}

	
	/**
	 * [4] 이름으로 음악 목록 검색
	 * @param title
	**/
	// 동일한 제목의 곡 리스트 검색 -> List 사용
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne : mList) {
			if(mOne.getTitle().equals(title)) {		// 곡명이 같은 곡 존재여부 확인
				findList.add(mOne);					// 리스트에 계속 추가(존재하는 경우)
			}
		}
		return findList;	// findList의 자료형 List<Music> , void -> List<Music>
	}
	
	/**
	 * [5] 특정 곡 삭제 (remove 메소드 사용)
	 * @param index
	**/
	public void removeMusic(int index) {
		mList.remove(index);
	}
	
	/**
	 * [4-1, 5-1] 이름(곡명)으로 인덱스 조회
	 * @param musicName
	 * @return
	**/
	// 1. index를 return.(int) -> 인덱스를 가져옴.
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
	 * [4-2, 5-2] 이름(곡명)으로 조회한 인덱스로 리스트에서 조회(인덱스를 이용해 하나의 값 출력)
	 * @param index
	 * @return Music
	**/
	// 2. searchOneByName에서 반환한 index를 통해 리스트에서 조회 -> 인덱스를 이용해 하나의 값을 가져옴.
	public Music selectOneByIndex(int index) {
		return mList.get(index);	// return값의 자료형 : Music
	}

	
	/**
	 * [6] 특정 곡 수정 (set 메소드 사용)
	 * @param index
	 * @param music
	**/
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	
	
	/**
	 * [7] 곡명 오름차순 정렬
	**/
	public void sortByTitleASC() {
		// 제목 정렬하기1. (삽입정렬 오름차순)
		// -> 숫자일때 정렬한 상황(대소비교 가능)
		int [] nums = {4, 3, 2, 1};
		for(int i = 1; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// ERROR : The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// 해결방법 : compareTo() 메소드 사용 : 숫자가 아닌 두 객체(문자열)의 대소비교 가능
				//			>>	(유니코드값에 근거하여 비교하므로 한글은 불가능)
				//			>>	0 : 두 문자열값 동일 / -1(음수) : 오름차순 / 1(양수) : 내림차순 
				// ex) mOne.getTitle()와 mTwo.getTitle() 비교 시 0보다 작으면(음수) 앞에 있는 mOne.getTitle()을 기준으로 오름차순.
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
				
		// (참고) 버블정렬ver.
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
	 * [8] 곡명 내림차순 정렬
	**/
	public void sortByTitleDESC() {
		// 제목 정렬하기2. (삽입정렬 내림차순)
		// -> 숫자일때 정렬한 상황(대소비교 가능)
		int [] nums = {4, 3, 2, 1};
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				// ERROR : The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
				// 해결방법 : compareTo() 메소드 사용 : 숫자가 아닌 두 객체(문자열)의 대소비교 가능
				//			>>	(유니코드값에 근거하여 비교하므로 한글은 불가능)
				//			>>	0 : 두 문자열값 동일 / -1(음수) : 오름차순 / 1(양수) : 내림차순 
				// ex) mOne.getTitle()와 mTwo.getTitle() 비교 시 0보다 크면(양수) 앞에 있는 mOne.getTitle()을 기준으로 내림차순.
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	
	/**
	 * [9] 가수명 오름차순 정렬
	**/
	public void sortBySingerASC() {
		// 가수명 정렬하기1. 오름차순
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
	 * [10] 가수명 내림차순 정렬
	**/
	public void sortBySingerDESC() {
		// 가수명 정렬하기1. 내림차순
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

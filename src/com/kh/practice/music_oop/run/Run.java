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
		
		// do-while문 사용(먼저 실행 후 나중에 조건 체크)
		do {
			select = view.musicMenu();
			switch(select) {
				case 1 : 
					music = view.inputMusicInfo("마지막");
					mCon.addAtLast(music);
					view.displaySuccess("추가 성공!");
					break;
					
				case 2 :
					music = view.inputMusicInfo("첫");
					mCon.addAtZero(music);
					view.displaySuccess("추가 성공!");
					break;
					
				case 3 :
					List<Music> allList = mCon.printMusicList();
					view.showAllMusicList(allList);
					view.displaySuccess("조회 성공!");
					break;
					
				case 4 :
					// Controller -> 동일한 제목의 곡 리스트 검색
					title = view.inputMusicName("검색");
//					index = mCon.searchOneByName(title);
//					music = mCon.selectOneByIndex(index);
//					view.showOneMusic(music);
					List<Music> findList = mCon.searchMusicsByName(title);
					view.showAllMusicList(findList);
					// 성공 메시지 출력
					view.displaySuccess("조회 성공!");
					break;
					
				case 5 :
					title = view.inputMusicName("삭제");
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displaySuccess("존재하지 않습니다.");
						break;
					}
					mCon.removeMusic(index);
					view.displaySuccess("삭제 성공!");
					break;
					
				case 6 : 
				// 방법1. (가수명만 수정하는 방법)
//					// 1) 이름 받기
//					title = view.inputMusicName("수정");
//					// 2) 이름으로 인덱스 검색, 존재 여부 체크용
//					index = mCon.searchOneByName(title);
//					if(index == -1) {
//						view.displayError("조회 실패!");
//						break;
//					}
//					// 3) 인덱스로 데이터 가져오기
//					music = mCon.selectOneByIndex(index);
//					// 4) 가져온 데이터 수정
//					music = view.modifyMusicInfo(music);
//					// 5) 저장소에 수정하기
//					mCon.updateMusic(index, music);
					
				// 방법2. (곡명과 가수명을 모두 수정하는 방법)
					// -> 인덱스로 데이터를 가져올 필요가 없다.
					// 1) 이름 받기
					title = view.inputMusicName("수정");
					// 2) 이름으로 인덱스 검색, 존재 여부 체크용
					index = mCon.searchOneByName(title);
					if(index == -1) {
						view.displayError("조회 실패!");
						break;
					}
					// 3) 데이터 수정(매개변수없는 modifyMusicInfo 메소드 사용)
					music = view.modifyMusicInfo();
					// 4) 저장소에 수정하기
					mCon.updateMusic(index, music);
					break;
					
				case 7 :
					//System.out.println("곡명 오름차순 정렬");  
					// sysout문 대신 printMessage 메소드를 사용하여 출력
					view.printMessage("=== === 곡명 오름차순 정렬 === ===");
					mCon.sortByTitleASC();
					view.printMessage("오름차순정렬 성공! 3번을 눌러 출력해주세요:)");
					break;
					
				case 8 : 
					view.printMessage("=== === 곡명 내림차순 정렬 === ===");
					mCon.sortByTitleDESC();
					view.printMessage("내림차순정렬 성공! 3번을 눌러 출력해주세요:)");
					break;
					
				case 9 :
					view.printMessage("=== === 가수명 오름차순 정렬 === ===");
					mCon.sortBySingerASC();
					view.printMessage("오름차순 정렬 성공! 3번을 눌러 출력해주세요~");
					break;
					
				case 10 :
					view.printMessage("=== === 가수명 내림차순 정렬 === ===");
					mCon.sortBySingerDESC();
					view.printMessage("내림차순 정렬 성공! 3번을 눌러 출력해주세요~");
					break;
			}
			
		} while(select != 0);	// 메뉴선택:0 이 되면 빠져나감
								// do-while문 사용 -> break 필요 없다

	}

}


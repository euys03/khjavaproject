package com.kh.practice.music_oop.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.kh.practice.music_oop.model.vo.Music;

public class MusicView {

	public int musicMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int value = sc.nextInt();
		return value;	// 반환형(return): void -> int
		
	}
	
	
	
	
	// [1],[2] '첫' or '마지막' 위치에 곡 추가
	// 하나의 매소드를 매개변수화(category라는 변수를 만들어 상황에 맞게 사용)
	public Music inputMusicInfo(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + " 위치에 곡 추가");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();	// 곡명, 가수명에 띄어쓰기가 존재할 수 있으니 nextLine(); 사용

		// 두 개의 정보(곡명, 가수명)를 하나의 변수로 다루기 위해 객체가 필요함!
		// 	-> model.vo(Music)에서 title, singer 객체 만들기
		//Music music = new Music();	=> error : The constructor Music() is undefined
		// 해결방법) Music에서 매개변수있는 생성자를 생성했으므로 매개변수 갯수에 맞춰 매개변수를 받아야함
		Music music = new Music(title, singer);
		return music;	// Run에 객체가 생성된 것.
	}
	
	
	
	// [3] 전체 곡 목록 출력
	public void showAllMusicList(List<Music> mList) {	// 매개변수명(allList와 mList)은 달라도 상관없다.(넘어오는 값이 중요)
		System.out.println("====== 전체 곡 목록 출력 ======");
		// *for-each문 : index 신경쓰지 않고 사용가능
		// index 사용하여 출력
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i+1) + "번째 노래 -> " + "곡명 : " + music.getTitle() + ", 가수명 : " + music.getSinger());
		}
	}

	
	
	// [4, 5] 특정 곡 검색 & 특정 곡 삭제
	// 검색할 곡을 입력해주세요 => Run에 넘겨줌 -> Controller의 searchOneByName에서 받고, index를 반환하여 selectOneByIndex()로 전달
	public String inputMusicName(String gubun) {
		Scanner sc = new Scanner(System.in);
		System.out.print(gubun + "할 곡 입력 : ");
		String title = sc.nextLine();
		return title;	// Run에 title변수 생성.
	}
	// [4-1] 인덱스(곡명)를 통해 리스트에서 조회한 검색결과를 출력하기 위한 메소드
	public void showOneMusic(Music music) {
		System.out.println("검색한 곡의 곡명은 : " + music.getTitle() + ", 가수명은 : " + music.getSinger() + "입니다.");
	}
	
	

	// [6] 특정 곡 정보수정
		// 수정 - 방법1. '가수명'만 수정하는 방법
	public Music modifyMusicInfo(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 가수명 입력 : ");
		String singer = sc.nextLine();
		music.setSinger(singer);
		return music;
	}
		// 수정 - 방법2. '곡명'과 '가수명'을 같이 수정하는 방법
		// 	-> 인덱스로 데이터를 가져올 필요없다. => 오버로딩(*매개변수차이*)하여 2번째 방법 입력
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수명 입력 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	

	
	// [7 ~ 10] 출력문 출력 메소드(Run에서 system.out.println() 대신 출력문 작성하는 방법)
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	
	
	// 성공, 실패 메시지 출력
	public void displaySuccess(String message) {
		System.out.println("[서비스 성공] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[서비스 실패] : " + message);
		
	}
	
	
	
	
}

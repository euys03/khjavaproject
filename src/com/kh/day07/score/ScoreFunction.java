// 객체지향 프로그램

package com.kh.day07.score;

import java.util.Scanner;


public class ScoreFunction {
	// 점수는 민감한 정보이므로 private 선언을 해준다.
	private int kor;	//전역변수, 클래스변수
	private int eng;	// 필드값이 되었고, 멤버변수들
	private int math;
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public void printScore() {
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
	}
	
	public void GoodByeMsg() {
		System.out.println("Goody Bye ~~~");
	}
	
	public void exceptionMsg() {
		System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
		//sysout 적고 ctrl + space바 => 자동완성		
	}
	
}

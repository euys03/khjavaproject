package com.kh.day06.exercise;

import java.util.Scanner;

// ** 구조적 프로그래밍, 프로그램을 한 눈에 파악 가능!!
public class Exercise_ScoreProgram2 {
	// 전역변수, 클래스 변수
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	
	public static void main(String [] args) {
	// Ctrl을 누른 상태로 각 메서드들(printMenu(), inputScore(),.. 등을 누르면
	// 빠르게 코드로 이동할 수 있다. 어떤 기능들이 있는지 한 눈에 파악할 수 있다는 장점.
		Scanner sc = new Scanner(System.in);
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				inputScore();
				break;
			case 2 : 
				printScore();
				break;
			case 3 : 
				GoodByeMsg();
				break;
			default : 
				printException();
				break;
			}
		}
	}

// 동작을 위한 코드들.
	// printMenu()메서드를 자기자신이 쓰려면 'static'을 사용해야한다.
	public static void printMenu() {	
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		// printf 로 적으면 소수점 자리수를 조절 할 수 있다.
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
	}
	
	public static void GoodByeMsg() {
		System.out.println("Good Bye~~");
	}
	
	public static void printException() {
		System.out.println("1 ~ 3 사이의 수를 입력해주세요!");
	}
	
}

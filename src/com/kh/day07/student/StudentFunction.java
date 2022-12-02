package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	// Student 클래스로 분리
	// pirvate String name;
	// private int kor;
	// private int eng;
	// private int math;
	
	// 생성자 - student.java 를 참조한다.
	Student student;
	
	// 생성자는 안에 쓰는 게 원칙.
	public StudentFunction() {
		student = new Student();	// 초기화
	}
	
	/**
	 * 학생관리 프로그램 메뉴 출력
	 * @return choice
	 **/
	
	// 메소드만 입력(기능들만)
	public int printMenu() {	// void -> int
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 관리 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		
		return choice;	//반환값(return)이므로 public void와 자료형을 맞춰야함
	}
	
	
	/**
	 * 학생 성적 입력
	 **/
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 학생 정보 입력 =========");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		
		//student = new Student(name, kor, eng, math);
		// 위의 방법으로 하면 new키워드를 사용하면서 메모리가 추가 사용됨
		// setter메소드를 정의해줌으로써 위와 같이 쓰지 않고 아래와 같이 각각 사용가능.
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
	}
	
	
	/**
	 * 학생 정보 출력
	 **/
	public void printScore() {
		System.out.println("========= 학생 정보 출력 =========");
//		System.out.println(student.name + "학생의 성적");
//		//student.java에 name은 캡슐화(private)로 선언하였기 때문에 접근 불가.
		System.out.println(student.getName() + " 학생의 성적");
		System.out.println("국어 성적 : " + student.getKor());
		System.out.println("영어 성적 : " + student.getEng());
		System.out.println("수학 성적 : " + student.getMath());
		System.out.println("************************************");
	}
	
	
	/**
	 * 프로그램 종료
	 **/
	public void GoodByeMsg() {
		System.out.println("Goody Bye ~~~");
	}
	
	
	/**
	 * 예외처리
	 **/
	public void exceptionMsg() {
		System.out.println("1 ~ 3 사이의 숫자를 입력하세요!");
	}
}

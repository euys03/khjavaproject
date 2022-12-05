/** 
 * day7의 Student와 달리 "여러 명의 학생들의 정보"를 출력할 수 있는 코드
 * 배열 사용
 **/

package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student [] students;
	
	public StudentFunction() {
		students = new Student[3];	// 초기화
	}
	
	// 기능을 하는 메소드들
	// printMenu(), inputScore(), printScore(), checkPass(), printGoodBye(), printException() 
	public int printMenu() {	// void -> int
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 학생 성적 확인 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		
		int menu = sc.nextInt();
		return menu;	// 반환형(return)이므로 public void의 자료형을 맞춰줘야한다.
						// menu의 입력값들이 숫자이므로 void -> int 로 변경.
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("=======" + (i+1) + "번째 학생 정보 입력 =======");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수입력 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i+1) + "번째 학생 정보 출력");
			System.out.println(students[i].getName() + "학생의 점수는 ");
			System.out.println("1차 점수 : " + students[i].getFirstScore() + ", 2차 점수 : " + students[i].getSecondScore() + "입니다.");
		}
	}
	
	public void checkPass() {
		/*
		 * 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		 * 1. 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다. 한 과목만 40점 미만인 경우
		 	  1차, 2차 평균이 60점 이상이면 40점 미만인 과목만 재평가를 본다.
		 * 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		 * 3. 1차 점수와 2차 점수의 평균이 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
		 * */
		
		for(int i = 0; i < students.length; i++) {
			
			int test1 = students[i].getFirstScore();
			int test2 = students[i].getSecondScore();
			double avg = (test1+test2)/(double)2;
			System.out.println((i+1) + "번째, " + students[i].getName() + "학생의 확인 결과");
			
			if(avg >= 60) {
				// 예외 발생
				// 1차 시험 : 20점, 2차 시험 : 100점
				// 1차 시험 : 100점, 2차 시험 : 20점
				if(test1 < 40) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				} else if(test2 < 40) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				} else if(avg >= 60 ) {
					System.out.println("통과하였습니다.");					
				}
			} else {
				// 통과 못한 사람들!
				// 1차 시험은 통과, 2차 시험은 탈락
				// 1차 시험은 탈락, 2차 시험은 통과
				// 1차 시험도 탈락, 2차 시험도 탈락
				if(test1 < 60) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				} 
				if(test2 < 60) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				}
			}
		}
		
//		if(num1 < 40) {
//			System.out.println("1차 시험 재평가 대상자입니다.");
//		}else if(num2 < 40) {
//			System.out.println("2차 시험 재평가 대상자입니다.");
//		}else if(avg >= 60){
//			System.out.println("통과하였습니다.");
//		}else {
//			if(num1 < 60) {
//				System.out.println("1차 시험 재평가 대상자입니다.");
//			}else if(num2 < 60) {
//				System.out.println("2차 시험 재평가 대상자입니다.");
//		}
//	}
		
	}
	
	public void printGoodBye() {}
	
	public void printException() {}
}

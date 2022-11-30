package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	/*
	 * ====== 메인 메뉴 =======
	 * 1. 성적입력
	 * 2. 성적출력
	 * 3. 종료
	 * 선택 : 1
	 * 
	 * ====== 성적 입력 =======
	 * 국어 : 50
	 * 영어 : 40
	 * 수학 : 30
	 * 
	 * 
	 * ====== 메인 메뉴 =======
	 * 1. 성적입력
	 * 2. 성적출력
	 * 3. 종료
	 * 선택 : 2
	 * 
	 * ====== 성적 출력 ======
	 * 국어 : 50
	 * 영어 : 40
	 * 수학 : 30
	 * 
	 * 총점 : 120
	 * 평균 : 40.00
	 * 
	 * ====== 메인 메뉴 =======
	 * 1. 성적입력
	 * 2. 성적출력
	 * 3. 종료
	 * 선택 : 3 
	 * 
	 * Good Bye~
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한반복문은 둘 중 하나 사용.
		// for(;;) {}
		// while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		
		// 반복문 위에 ESCAPE : 를 쓰고 탈출하고자 하는 코드의 break; 뒤에 ESCAPE를
		// 써주면 While문을 완전히 빠져나와 완벽히 정지 된다.
		// 꼭 'ESCAPE'가 아닌 'EXIT', 의미없이 'GOHOME' 등과 같이 작성해도 된다.
		// 같은 단어이기만 하면 된다.
		ESCAPE :
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 : 
				sum = kor + eng + math;
				double avg = (double)sum / 3;
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + sum);
				// printf 로 적으면 소수점 자리수를 조절 할 수 있다.
				System.out.printf("평균 : %.2f", avg);
				System.out.println();
				break;
			case 3 : 
				System.out.println("Good Bye ~");
				break ESCAPE;
				
			// 1, 2, 3 외의 값이 모두 default: 로 떨어진다.
			default :
				System.out.println("1 ~ 3 사이의 수를 입력해주세요!");
				break;
			}	
			// 절차지향 프로그램/구조적 프로그램
		}
	}
}

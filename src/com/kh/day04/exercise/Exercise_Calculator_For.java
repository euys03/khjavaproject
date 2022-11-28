// for문으로 "계산기" 만들기

package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator_For {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(;;) {	//무한반복문
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			// 문자열(sc.next())의 첫번째 값을 자름(charAt(0))
			char operator = sc.next().charAt(0);
			
			int result = 0;
			// 연산자 판별 후 연산 수행, 그리고 결과 저장.
			switch(operator) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-' : 
				result = num1 - num2;
				break;
			case '*' : 
				result = num1 * num2;
				break;
			case '/' : 
				result = num1 / num2;
				break;
			case '%' : 
				result = num1 % num2;
				break;
			}
			
			System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result + "\n");
			//break;	// 무한반복문(for(;;)이 있음에도 불구하고 break를 써주면 딱 '한번만' 반복한다.
			count++;	//출력에 성공했을 때 카운트 업!
			if(count == 3) break;	//3번만 반복하도록 count 선언
			
		}
		// System.out.println 에서 정수 + 문자열 -> 문자열
		// 자세한 설명 => 'com.kh.day04.exercise - Exercise_PrintSample.java'
		
		
		
		
		
		
		
		
		
		
	}
}

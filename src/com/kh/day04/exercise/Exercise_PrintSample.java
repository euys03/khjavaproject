package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main (String [] args) {
		// System.out.println 에서 정수 + 문자열 -> 문자열
		System.out.println(1 + "1");
		
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1');	// (예상) '11' => 11은 문자열이므로 x
										// 1은 아스키코드로 49 이다.
		
		// 정수 + 정수 + 문자열 + 정수 -> 최종적으로는 문자열
		System.out.println(10 + 20 + "Hello" + 10);
		
		
		// * 삭제 단축키 : ctrl + d
		
		
		// printf 에 대하여 알아보자.
		// println, print -> 줄 바꿈의 차이
		// printf 는 원하는 값을 넣어줘야 한다.
		System.out.print("정수 입력 : ");	// 바로 옆에 입력받음.
		System.out.println("정수 입력 : ");		// 줄 바꾸고 입력받음.
		System.out.printf("정수 입력 : %d \n", 1);	// '정수는 %d'
		System.out.printf("문자열 출력 : %s \n", "Hello World"); // '문자열은 %s'
		
	}
}

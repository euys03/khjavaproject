// 삼항연산자
package com.kh.day3.condition;

import java.util.Scanner;

public class Exam_Triple {
	public static void main (String [] args) {
		/*
		 * 삼항연산자(항목이 3개)
		 * (조건식) ? 참일 때 : 거짓일 때
		 * - 조건식은 반드시 true or false를 반환
		 * - 비교/논리연산자 주로 사용
		 */
		//(num1 > num2) ? "참" : "거짓";
		
		// 정수를 입력받아 짝수인지 홀수인지 판별하는
		// 프로그램을 작성하시오.
		// 결과) 정수 하나 입력 : 34
		//		 34는 짝수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		// 짝수 판별
		String result = (input % 2 == 0) ? "짝수" : "홀수";
		// 판별 후 출력
		System.out.println(input + "은/는 " + result + "입니다.");
	}
}

/* 예외처리 (Exception)
 * 비정상적인 종료가 되지 않도록 하는 것.
 * try - catch - final 로 구성
 * */

package com.kh.day06.Exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		try {	// 예외가 발생하는 부분만 try구문에 넣어도 되지만
				// 보통은 코드 전체를 넣는다.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 하나 입력해주세요 : ");
			int num1 = sc.nextInt();
			System.out.println("정수 하나 더 입력해주세요 : ");
			int num2 = sc.nextInt();
			System.out.println("나누기 실행!");
			int result = num1 / num2;	// 0을 입력했더니 예외가 발생하는 부분
			System.out.println("몫은 " + result + "입니다.");
			
			
		} catch(ArithmeticException e) {
			// 콘솔의 오류(ArithmeticException)을 복사해온 후 변수명을 적는다.
			// (보통은 e 로 적음)
			// 비정상적인 코드로 종료되는 것이 아닌 catch구문이 실행된다.
			System.out.println("0으로 나누면 안돼요!");
			
		}
		
	}
}

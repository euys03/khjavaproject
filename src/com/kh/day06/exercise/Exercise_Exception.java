package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
		// (다시 입력) 무한 반복
		// 방법1) for(;;) {}
		// 방법2) while(true) {}
			while(true) {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("정수 하나 입력해주세요 : ");
					int num1 = sc.nextInt();
					System.out.println("정수 하나 더 입력해주세요 : ");
					int num2 = sc.nextInt();
					System.out.println("나누기 실행!");
					int result = num1 / num2;	// 0을 입력했더니 예외가 발생하는 부분
					System.out.println("몫은 " + result + "입니다.");
					break;	//0이 입력될 때마다 break문 실행하지 않고, catch문으로 계속 넘어간다.
					// 0이 입력되지 않고 정상코드가 입력되면 break문이 실행되어 끝낸다.
				
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	
	public void practice2() {
// 정수 3개 입력받아 합 구하기.
		
//		정수 3개를 입력하세요
//		0>>5
//		1>>R	// 문자입력시 에러나는 코드
//		정수가 아닙니다. 다시 입력하세요!
//		1>>4
//		2>>6
//		합은 15
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;	//전역변수
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt();	   //지역변수 : int num 으로 선언한다면. try안에서만 사용가능.
				
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();	// 입력된 R값(문자) 제거 (어떤 변수에 저장 안했기 때문에
							// 						저장되지 않고 그대로 사라진다.)
				i--;	// 1>>에 문자를 입력하여 '정수가 아니다'라는 메시지를 받은 경우
						// 2>>로 넘어가지 않고 1>>에 이어서 다시 입력받도록 i-- 를 해준다.
						// 그렇지 않으면 45줄에서 i++로 인해 +1된 2>> 에 입력하게 되므로.
				continue;	// catch가 발생하였을 때(문자가 입력되었을 때) sum += num; 을 스킵하도록 함.
							// continue를 만나면 해당 맨 처음(for문)으로 올라감.
				
			}
			sum += num;
		}
		System.out.println("합은 " + sum);
		
	}
}

// day04의 Exercise_While1~3 모두 복붙한 후 exercise1~3 라는 메소드 명으로 메소드를 생성.
// 우측에 최소화해놨던 'outline'을 클릭하면 모든 메소드들을 볼 수 있다.
// com.kh.day05.run에서 실행결과 확인할 수 있다.(main함수를 Run클래스에 선언해놓음)


package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
	// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			//i++;
			i = i + 2;	// 복합대입연산자: i += 2;
		}
		System.out.println("합계 : " + sum);
	}
	
	
	
	public void exercise2() {
		// (while문 응용)정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while(i < 10) {
				System.out.println(num + " * " + i + " = " + num*i );
				i++;	// *** 중요 ***
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}		
	}
	
	
	
	public void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 : 14

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		
		int input = sc.nextInt();
		int sum = 0;
		while(input != -1) {	// input이 -1이 아니면 true ->  -1이 입력되기 전까지 돈다!
			
			System.out.print("정수 하나 더 입력 : ");
			input = sc.nextInt();
			//sum = sum + input;	// i = i + 2 -> i += 2 (복합연산자),
			if(input != -1) {
				sum += input;
			}
						
		}
		System.out.println("입력하신 수의 합은 : " + sum);		
	}
}

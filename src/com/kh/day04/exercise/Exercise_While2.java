package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main (String [] args) {
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
}

package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main (String [] args) {
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

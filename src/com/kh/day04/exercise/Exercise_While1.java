package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
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
}

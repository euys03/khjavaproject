package com.kh.day04.exercise;

public class Exercise_For1 {

	public static void main(String[] args) {
		// 누적합
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			sum = i + sum;
		
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}

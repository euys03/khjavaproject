package com.kh.day2.exercise;
//ctrl + space바
import java.util.Scanner;

public class Excercise_Logical1 {
	public static void main (String [] args) {
		// 50이 1 ~ 100 사이의 숫자인지 확인하세요!
		// 단, 50이라는 숫자는 변수 num에 초기화해주세요
		// 1부터 100 사이의 숫자인가? : ture
		
		/*
		int num = 50;
		// 1부터 100 사이인지 판별
		boolean result = (num >= 1) && (num <= 100);
		// 결과 출력
		System.out.println("1부터 100 사이의 숫자인가? : " + result);
		*/
		
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int num = sc.nextInt();
		boolean result = (1 < num) && (num < 100);
		//결과 출력
		System.out.println("1부터 100 사이의 숫자인가? : " + result);
		
	}
}

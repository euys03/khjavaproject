package com.kh.day2.exercise;
//ctrl + space바
import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main (String [] args) {
		// 문자 A가 대문자인지 소문자인지 확인하세요!
		// 단, A라는 문자는 변수 word에 초기화해주세요.
		// 영어 대문자 확인 : ture
		
		/*
		char word = 'A';
		// 대문자인지 판별
		// 아스키코드. 
		// 대문자: 65~90 까지의 숫자 / 소문자: 97~122까지의 숫자.
		boolean result = ('A' <= word) && (word <= 'Z');
		// 결과 출력
		System.out.println("영어 대문자 확인 : " + result);
		*/
		
		//입력한 문자가 대문자인지 소문자인지 확인하세요!
		Scanner sc = new Scanner(System.in);
		//가이드 메시지
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0);
		boolean result = ('A' <= word) && (word <= 'Z');
		//결과 출력
		System.out.println("대문자인가요? : " + result);
		
		
		
	}
}

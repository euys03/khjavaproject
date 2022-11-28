package com.kh.day3.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main (String [] args) {
//		이름을 입력해주세요. // next()
//		민봉식
//		태어난 월을 입력해주세요.
//		9
//		키를 입력해주세요.
//		180
//		성별을 입력해주세요.
//		남
//		주소를 입력해주세요. // nextLine()
//		서울시 종로구
		
//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요. ");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해주세요. ");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요. ");
		double height = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요. ");
		char gender = sc.next().charAt(0);	//char: 문자열을 입력받은 후에 한개(0)만 잘라서 쓴다.
		
		System.out.println("주소를 입력해주세요. ");
		sc.nextLine();	
		String address = sc.nextLine();		//nextLine()이라는 코드가 엔터로 받아들여져 끝내버린다.
											//nextLine()사용 시에는 nextLine() 위쪽에 nextLine()을 한 번 더 쓴다.
		
		// next()와 nextLine()의 차이점
		// next(): 공백이나 띄어쓰기를 입력받지 않는다.
		// nextLine(): 메시지나 주소와 같은 공백이나 띄어쓰기가 존재하는 것을 입력받는다.
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "월 입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 "+ address + "입니다.");
		
		
		
	}
}

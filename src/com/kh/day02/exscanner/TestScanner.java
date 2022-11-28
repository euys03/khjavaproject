package com.kh.day2.exscanner;
// *** Scanner 선언
// ctrl + space바
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("int 값을 입력해주세요 : ");
		int input1 = sc.nextInt();
		System.out.println("입력한 값 : " + input1);
		
		System.out.print("int 값을 한번 더 입력해주세요 : ");
		int input2 = sc.nextInt();
		System.out.println("입력한 값 : " + input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 : " + result + "입니다.");
		
		//sc.close는 잘못 닫으면 이상이 생기므로 아직은 생략한다. "있다라는 것만 알아두기."
		// 잘못닫으면 실행이 안된다.
		//sc.close();
		
		
	}

}

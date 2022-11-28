package com.kh.day2.variable;

public class TestDataType {
	public static void main(String [] args) {
		// 자료형(int) 변수명(kh) 대입연산자(=) 데이터(34) ;
		// 1. 자료형의 종류
		// 정수(int), 문자열(String)
		
		// 정수 PART **
		byte bNum = 127;		// -128 ~ 127
		short sNum = 32767;		// -32768 ~ 32767
		int iNum = 2147483647;	// -21474843648 ~ 2147483647
		long lNum = 2147483648l;	// 접미사 l을 붙여야 함.
		short num = 128;
		
		// 실수 PART **
		float fNum = 22.1123f;	//접미사 f를 붙여야 함.
		double dNum = 23.502;	//(평균을 구할 때 많이 사용)
		
		// 문자 PART **
		char fChar = 'A';	// ''(작은따옴표)는 "한 개의" 문자만 올 수 있음.
		String sChar = "Hello Java";	// ""(쌍따옴표) 안에는 "여러개의" 문자.
		
		// Boolean형 - 비교연산자( 1 > 0 , 2 < 1 )
		boolean result = false;
		
		System.out.println("정수의 값: "+ iNum);
		System.out.println("정수의 값(9999억) :"+lNum);
		System.out.println("실수의 값 : "+fNum);
		System.out.println("실수의 값 : "+dNum);
		System.out.println("문자의 값 : "+fChar);
		System.out.println("문자열의 값 : "+sChar);
		System.out.println("논리의 값 : "+result);
		
		
		fChar = 66;
		System.out.println("문자에 숫자: "+fChar);
		fChar = 75;
		System.out.println("문자에 숫자2: "+fChar);
		// ASCII(아스키)코드 => 문자는 숫자를 저장할 수 있고 ASCII코드에
								//매핑되어있는 문자로 출력이 가능하다.
		
		
		
		
		
	}
}

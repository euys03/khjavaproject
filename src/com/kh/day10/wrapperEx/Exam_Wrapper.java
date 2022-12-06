package com.kh.day10.wrapperEx;

public class Exam_Wrapper {
	public static void main (String [] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
		// 1. error : The constructor Integer(int) is deprecated since version 9
		//Integer i = new Integer(1123);	//(빨간색) 객체
		
		// 객체를 만들어서 사용하다가
		Integer i = Integer.valueOf(1123);	// 'static'이면 기울어진 글자
		// 기본형으로 변환가능
		int e = i.intValue();	// 기본형
		
		Integer f = null;
		// 2. error : Type mismatch: cannot convert from String to int
		//int m  = null;
		
		
		Character c = Character.valueOf('c');	// 객체로 만들어서 사용하다가
		char che = c.charValue();				// 기본형으로 변환
		
		
		Double d = Double.valueOf(3.14);	// 객체로 만들어서 사용하다가
		double dd = d.doubleValue();		// 기본형으로 변환
		
		
		
		
	// 문자열 ==> "기본 데이터 타입(int, boolean, double)"으로 변환
		int num = Integer.parseInt("123");	// Wrapper의 Integer.parseInt()메소드를 통해 숫자로 출력 가능
											// Wrapper에서는 int를 Integer로 사용.
		//System.out.println("변환된 값 : " + num);
		
		int result = num + 1;
		
		
		boolean isYn = Boolean.parseBoolean("ture");	// boolean(true, false)
								// Wrapper의 Boolean.parseBoolean()메소드를 통해 boolean으로 출력 가능
		 						// 기본데이터타입으로 변환
		double fNum = Double.parseDouble("3.14");
		
		
		
		
	// 기본 데이터 타입(int, double, char) ==> "문자열"로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); //16진수 7b로 변환
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
		
		
		
	}
}

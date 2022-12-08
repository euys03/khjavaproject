package com.kh.day11.wrapperEx;

public class Exam_BoxingUnBoxing {
	public static void main(String [] args) {
		// Integer로 선언된 변수에 값 넣는 방법
		// Integer에 있는 'valueOf'라는 static메소드를 통해 객체를 만들어준다.
		Integer num = Integer.valueOf(0);
		
		// Boxing(자동 박싱)
		// 같은 내용을 boxing(감싼다)이 간단하게 자동으로 해줌
		Integer su = 100;
		//객체로 사용하다 기본형으로 변경
		int soo = num.intValue();
		
		// UnBoxing(자동 언박싱)
		// boxing이 번거로우므로 num.intValue()를 바로 입력해준다.
		soo = num.intValue();
		
		
		// Boxing, Unboxing 예제
		int n = 10;
		Integer intObject = n;	// Integer.valueof() 하지않고 바로 n을 넣을 수 있었다 
								// -> 여기가 박싱부분임을 알 수 있다.
		System.out.println("intObject : " + intObject);
		
		
		int m = intObject + 10;	// intObject(=Integer), 10(=int)로 Integer -> int로
		// 변환하여 계산했어야했지만 그러지 않아도 되었다.(intObject.intvalue대신에)
		// -> 여기가 언박싱부분임을 알 수 있다.
		System.out.println("m = " + m);
	}
}

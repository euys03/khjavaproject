// 형 변환 (자동/강제) _자료형ver.
package com.kh.day3.typetrans;

public class TestTypeTrans1 {
	public static void main (String [] args) {
		int iNum = 10;
		double dNum = 13.2;
		
		// 자동 형변환 (작은 타입 -> 큰 타입으로 변환)
		// double로 result를 선언함으로서 int형이었던 iNum도 큰 타입인 double형으로 변환되어 계산된다.
		double result = iNum + dNum;
		System.out.println("iNum + dNum = " + result);
		
		// 강제 형변환 (큰 타입 -> 작은 타입으로 변환. ex) 실수를 정수로.(버림) )
		System.out.println("강제 형 변환 : " + (int)result);
		System.out.println("강제 형 변환2 : " + (char)65);
	}
}

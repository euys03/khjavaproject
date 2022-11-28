// 형 변환 _ type(byte, int 등) ver.
package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main (String [] args) {
		byte b = 127;	// 1byte
		int i = 100;	// 4byte
		
		// 자동 형변환 (작은 수 -> 큰 수)
		System.out.println(b+i);	// b는 int로 자동 형변환
		System.out.println(10/4);
		System.out.println(10.0/4);		// 4는 4.0(실수)로 자동 형변환
		
		// 강제 형변환	(큰 자료형을 작은 자료형으로 변환, 데이터 손실 발생!!)
		System.out.println((byte)b+i);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
		
	}
}

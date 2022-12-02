package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		
		// Sample의 인스턴스 생성
		Sample aClass = new Sample();
		aClass.a = 10;	// public이므로 접근 가능
//		aClass.b = 10;	// is not visible, private이므로 접근 불가능
						// (오류가 나는 이유)
		aClass.c = 10;	// default이므로 접근 가능
	}
}

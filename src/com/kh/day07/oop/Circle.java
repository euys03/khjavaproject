package com.kh.day07.oop;

public class Circle {	// 클래스 선언(class Circle), 클래스 접근 권한 public
	// 필드
	public int radius;		// (원의 반지름 필드 선언) 접근 지정자 public
	public String name;		// (이름 필드 선언) 접근 지정자 public
	
	// 메소드
	// (기본)생성자 -> (생략가능)
	// 클래스명과 이름이 같아야 한다.
	//	역할 : 1. 객체생성
	//		   2. 필드 초기화 (초기화는 생성자에서하는게 원칙.)
	public Circle() {	// 접근 지정자 public
		this.radius = 1;
		this.name = "원";
	}
	
	// 멤버 메소드
	// 반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() {	// 원의 면적 계산 메소드 접근지정자 public
								// return값의 자료형을 적어줘야한다.(3.14이므로 double)
//		double area = 3.14*radius*radius;
//		return area;
		
		return 3.14*radius*radius;	// 둘의 차이는 변수를 썼느냐 안썼느냐의 차이.
	}
}

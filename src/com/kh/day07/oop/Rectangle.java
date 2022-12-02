package com.kh.day07.oop;

public class Rectangle {	// 클래스 선언, 접근지정자 public
	// 필드
	public int width;		// 너비, 가로 ,접근지정자 public
	public int height;		// 높이, 세로 ,접근지정자 public
	
	// 메소드
	// (기본)생성자 -> 객체 생성, 객체 초기화(필드 초기화)를 담당
	public Rectangle() {}	// 생성자, 접근지정자 public이고 반환형 없음!
	
	
	// 매개변수가 있는 생성자(즉, 전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;		// 필드에 있는 변수랑 같은색(파랑)으로 한 눈에
		this.height = height;	// 알아보기 위해 this. 생성자를 사용하였다.
	}
	
	// 반환형이 있는 메소드
	// getArea를 호출한 곳으로 값을 보낸다.(리턴한다)
	public int getArea() {
		int area = width * height;
		return area;	//곱한 값을 getArea()를 호출한 곳으로 반환한다.
						// 보내는 값(area)의 자료형을 getArea() 자료형으로
						// 맞춰줘야 한다. (public void에서 void 지우고 int 입력)
	}
	
}
	
/**
		 
* 메소드의 종류 : 매개변수가 있고 리턴값이 있거나 없거나.

* 표현식(1) - (리턴값이 있는 것)

	접근제한자 리턴형 메소드명(자료형 변수명) {
				.................
				return 반환값;
		}
		
* 표현식(2) - (리턴값 없는 것)
	접근제한자 void 메소드명(자료형 변수명) {
				...................
		 }
*
*
*
**/



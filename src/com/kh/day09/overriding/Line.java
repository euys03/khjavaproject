package com.kh.day09.overriding;

public class Line extends Shape {
	// 오버라이딩 하겠습니다!!
	@Override
	public void draw() {	// 오버라이딩 재정의 (상속받을 코드에서 재정의할 코드를 복붙해야한다.)
		System.out.println("Line");
	}
}

package com.kh.day09.point;

// 자식클래스
public class ColorPoint extends Point{
	private String color;	// 점의 색
	
//	// 기본생성자
//	public ColorPoint() {}
	
	// 매개변수 있는 생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);	// x, y 셋팅
		// Point의 생성자 Point(x,y) 호출
		// 생성자 선택은 역시 super!
		this.color = color;
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	public void showColorPoint() {	// 색, 좌표 출력
		System.out.println(color);
		showPoint();	// Point클래스(부모)의 showPoint() 호출
	}
}

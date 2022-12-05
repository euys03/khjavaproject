package com.kh.day09.point;

// 부모클래스
public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int x, y;
	// 기본생성자 (안만들어도 되지만 만들지 않으면 실수하기에)
	public Point() {
		this.x = this.y = 0;
	}
	// 매개변수 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
//	//set메소드
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

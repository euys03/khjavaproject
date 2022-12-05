package com.kh.day09.overriding;

public class Shape {
	public Shape next;
	public Shape() { next = null; }	// 생성자에서 초기화.
	public void draw() {
		System.out.println("Shape");
	}
}

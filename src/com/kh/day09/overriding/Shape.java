package com.kh.day09.overriding;

public class Shape {
	public Shape next;
	public Shape() { next = null; }	// �����ڿ��� �ʱ�ȭ.
	public void draw() {
		System.out.println("Shape");
	}
}

package com.kh.day09.overriding;

public class Line extends Shape {
	// �������̵� �ϰڽ��ϴ�!!
	@Override
	public void draw() {	// �������̵� ������ (��ӹ��� �ڵ忡�� �������� �ڵ带 �����ؾ��Ѵ�.)
		System.out.println("Line");
	}
}

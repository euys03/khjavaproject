package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		
		// Sample�� �ν��Ͻ� ����
		Sample aClass = new Sample();
		aClass.a = 10;	// public�̹Ƿ� ���� ����
//		aClass.b = 10;	// is not visible, private�̹Ƿ� ���� �Ұ���
						// (������ ���� ����)
		aClass.c = 10;	// default�̹Ƿ� ���� ����
	}
}

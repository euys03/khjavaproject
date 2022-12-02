package com.kh.day07.oop;

public class Circle {	// Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	// �ʵ�
	public int radius;		// (���� ������ �ʵ� ����) ���� ������ public
	public String name;		// (�̸� �ʵ� ����) ���� ������ public
	
	// �޼ҵ�
	// (�⺻)������ -> (��������)
	// Ŭ������� �̸��� ���ƾ� �Ѵ�.
	//	���� : 1. ��ü����
	//		   2. �ʵ� �ʱ�ȭ (�ʱ�ȭ�� �����ڿ����ϴ°� ��Ģ.)
	public Circle() {	// ���� ������ public
		this.radius = 1;
		this.name = "��";
	}
	
	// ��� �޼ҵ�
	// ��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() {	// ���� ���� ��� �޼ҵ� ���������� public
								// return���� �ڷ����� ��������Ѵ�.(3.14�̹Ƿ� double)
//		double area = 3.14*radius*radius;
//		return area;
		
		return 3.14*radius*radius;	// ���� ���̴� ������ ����� �Ƚ������ ����.
	}
}

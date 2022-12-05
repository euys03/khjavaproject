package com.kh.day09.exercise;

//�θ�Ŭ����
class SuperClass {	
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");	// #2
	}
}

//�ڽ�Ŭ���� (SuperClass�� ��ӹ���)
class SubClass extends SuperClass {
	
	// �θ�Ŭ������ �ִ� �޼ҵ�(paint)�� ��������(1) => "�������̵�"
	@Override
	void paint() {
		super.paint();	// (super)�θ� �ִ� paint �޼ҵ� ����
		// (but. �θ�Ŭ������ draw() ����? vs �����ǵ� �ڽ�Ŭ������ draw() ����?)
		// => �������ε� �߻��Ͽ� �����ǵ� �ڽ�(SubClass)�� draw()�� ����ȴ�. #1
		super.draw();	// (super)�θ� �ִ� draw �޼ҵ� ����
		/** super. : �θ� �ִ� �޼ҵ带 �������� ��.**/
	}
	
	// �θ�Ŭ������ �ִ� �޼ҵ�(draw)�� ��������(2) => "�������̵�"
	@Override
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		// ���� ����
		SuperClass ex = new SubClass();	// ��ĳ����(Upcasting)
		ex.paint();						// �θ�Ÿ�� ���� ex
	}
}

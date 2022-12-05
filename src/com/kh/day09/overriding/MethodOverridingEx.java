package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
	/** �������̵�(Overriding) ����
	 * - ����Ŭ������ �޼ҵ带 ����Ŭ������ '������'�ϴ� ��.
	 * 1. ����Ŭ������ �޼ҵ带 ����Ŭ������ �Ȱ��� �����Ѵ�.
	 * 
	 * super. : �θ� �ִ� ���� �������� ��.
	 * 
	 * �������ε� : �ڽ�Ŭ������ �������̵��� �޼ҵ尡 ������
	 * 				�θ�Ŭ������ �����ʰ� �� �޼ҵ尡 ����ȴ�.**/
		p.draw();	// ���� �θ�(Shape)�� ����Ǿ�������� �������̵���
					// �ڽ�(Line)�� ��µȴ�. = �������ε� �Ǿ���.
		
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		//line.draw();
		paint(line);
		paint(new Rect());	// ��ĳ����(Upcasting)���� �����ȳ�
							// Rect.java�� �������̵��س��Ƽ� ���� �����
		paint(new Circle());	// �������̵�(������)���� �ʾұ⶧���� �θ� ����ȴ�.
	}
}


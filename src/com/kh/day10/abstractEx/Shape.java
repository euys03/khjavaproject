package com.kh.day10.abstractEx;

class Line extends Shape {
// Line error : The type Line must implement the inherited abstract method Shape.draw()
// (��ӹ��� draw�޼ҵ�� �����Ǿ���Ѵ�.(-> Line���� ������ 'Add Unimplemented Methods'������Ѵ�.))

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}
}

// error : The abstract method draw in type Shape can only be defined by an abstract class
// (Shape�� �߻�޼ҵ带 ���������Ƿ� �߻�Ŭ�������� �Ѵ�. -> abstract �߰�)
public abstract class Shape {
	// ������ - ���� ���� �� �ʱ�ȭ
	public Shape() {}
	public void paint() {}
	// draw�� �߻�޼ҵ�� ���� (abstract)
	abstract public void draw();
	// error : Abstract methods do not specify a body
	// �߰�ȣ(��ü)�� ����� �� ���µ� ����Ͽ���.
	// (draw�� �߻�޼ҵ��̹Ƿ� �߻�Ŭ���� �ȿ� �����ؾ��Ѵ�.)
	
	
}

package com.kh.day07.oop;

public class Rectangle {	// Ŭ���� ����, ���������� public
	// �ʵ�
	public int width;		// �ʺ�, ���� ,���������� public
	public int height;		// ����, ���� ,���������� public
	
	// �޼ҵ�
	// (�⺻)������ -> ��ü ����, ��ü �ʱ�ȭ(�ʵ� �ʱ�ȭ)�� ���
	public Rectangle() {}	// ������, ���������� public�̰� ��ȯ�� ����!
	
	
	// �Ű������� �ִ� ������(��, ���ް��� ���� �� �ִ� ������)
	public Rectangle(int width, int height) {
		this.width = width;		// �ʵ忡 �ִ� ������ ������(�Ķ�)���� �� ����
		this.height = height;	// �˾ƺ��� ���� this. �����ڸ� ����Ͽ���.
	}
	
	// ��ȯ���� �ִ� �޼ҵ�
	// getArea�� ȣ���� ������ ���� ������.(�����Ѵ�)
	public int getArea() {
		int area = width * height;
		return area;	//���� ���� getArea()�� ȣ���� ������ ��ȯ�Ѵ�.
						// ������ ��(area)�� �ڷ����� getArea() �ڷ�������
						// ������� �Ѵ�. (public void���� void ����� int �Է�)
	}
	
}
	
/**
		 
* �޼ҵ��� ���� : �Ű������� �ְ� ���ϰ��� �ְų� ���ų�.

* ǥ����(1) - (���ϰ��� �ִ� ��)

	���������� ������ �޼ҵ��(�ڷ��� ������) {
				.................
				return ��ȯ��;
		}
		
* ǥ����(2) - (���ϰ� ���� ��)
	���������� void �޼ҵ��(�ڷ��� ������) {
				...................
		 }
*
*
*
**/


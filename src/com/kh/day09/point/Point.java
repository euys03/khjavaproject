package com.kh.day09.point;

// �θ�Ŭ����
public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	private int x, y;
	// �⺻������ (�ȸ��� ������ ������ ������ �Ǽ��ϱ⿡)
	public Point() {
		this.x = this.y = 0;
	}
	// �Ű����� �ִ� ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
//	//set�޼ҵ�
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

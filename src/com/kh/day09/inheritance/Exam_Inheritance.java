package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point { //import > com.kh.day09.point �� ����Ʈ�ϱ�
	void set() {	// �θ��� ��������� �޼ҵ� �ȿ���!
		pub = 1;
		//def = 2;	// error : The field Point.def is not visible
					// > defalt�� �ٸ� ��Ű�������� ��� �Ұ���
					//	- Parent�� ��ӵǾ��ٸ� ��밡��, but Point�� ��ӵǾ�����
					// > Point.java�� 'day09.point' ��Ű���� �ִ�.
		pro = 3;
		//pri = 4;	// error : The field Parent.pri is not visible
					// > private�� ����Ǿ��� ������ ��� �Ұ���
	}
}

// �ڽ�Ŭ����
class Child extends Parent{	// ������ �� �ڵ�� �޼ҵ� �ȿ��� ����.
	void set() {	// �θ��� �޼ҵ带 ����ϰ� �ִ� ��.
		pub = 1;	// �θ�Ŭ����(Parent)�� ��ӹޱ⵵ �߰� public�̶� ��밡��.
		def = 2;	// �θ�Ŭ����(Parent)�� ��ӹ޾ұ� ����
		pro = 3;	// �ڽ�Ŭ�����̹Ƿ� �θ�Ŭ������ �޼ҵ� ��� ����
		//pri = 4;	// error : The field Parent.pri is not visible
					// > pri�� private�̹Ƿ� �ش� Ŭ���� �ܿ��� ��� �Ұ���.
	}
}

// �θ�Ŭ����
class Parent {
	// ��� ����������
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
	private int money = 2000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}


public class Exam_Inheritance {
	public static void main(String[] args) {
		Child child = new Child();
		child.setMoney(3000);
//		System.out.println("Parent money : " + child.money);  // private�� �����Ͽ� ����x
		System.out.println("Parent money : " + child.getMoney());	// getMoney�� �ҷ�����.
		
	}
}

package com.kh.day10.zoointerface;
// ������ Ŭ����
public class ZooKeeper {
	
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}

	// 10���� ~ 100���� ~ �� �Ǹ� ���� �����ֱ� �����.
	// 'Predator.java'���� �������̽��� �ذ�.

//	public void feed() {	// �����ֱ� (=�������� �� �Ѹ��� ��.)
//		System.out.println("feed meat");
//	}
//	public void feed(Tiger tiger) {	//'ȣ����'���� �����ֱ�
//		System.out.println("feed beef");
//	}
//	public void feed(Lion lion) { //'����'���� �����ֱ�
//		System.out.println("feed gazel");
//	}
//	public void feed(Bear bear) { //'��'���� �����ֱ�
//		System.out.println("feed salmon");
//	}
	

}

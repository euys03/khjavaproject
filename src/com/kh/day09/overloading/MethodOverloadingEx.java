package com.kh.day09.overloading;

/** �����ε�(Overloading) ����
 * - ���� �̸��� �޼ҵ带 �ߺ��Ͽ� �����ϴ� ��.
 * - ���� �� Ŭ���� ���� ���� �̸��� �޼ҵ带 �� �̻� ���� �� ������
 * 	 �Ű������� ������ Ÿ�� ���� ���� ���� �̸��� �޼ҵ带 �ۼ��� �� �ִ�.
 * */
class Weapon {
	// 1. �⺻������, �����ڵ� �����ε��� �Ǿ��־��� ��.(�Ű������� ����, �ڷ��� ��)
	public Weapon() {
		
	}
	public Weapon(int value) {
		System.out.println();
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {
		return 1;
	}
	
	
	/** �����ε� (Overload) 
	 * 1. ������ �ϵ�, �ڱ� �ڽ� Ŭ���� �ȿ� �����Ѵ�.
	 * 2. �Ű������� ������ Ÿ���� �����Ѵ�.
	 **/
	//Overload
	protected int fire(int steampack) {
		return steampack*100;
	}
	//Overload
	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}
	//Overload
	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
}

/** �������̵� (Overriding)
 * 1. �ڽ�Ŭ������ �Ȱ��� �����ϸ� �������̵�*/
class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}

}

public class MethodOverloadingEx {
	public static void main(String [] args) {
	// 2. println()�� �����ε��ϰ� �־��� ��.
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}
}

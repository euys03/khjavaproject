package com.kh.day09.overloading;

/** 오버로딩(Overloading) 개념
 * - 같은 이름의 메소드를 중복하여 정의하는 것.
 * - 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없지만
 * 	 매개변수의 개수나 타입 등을 통해 같은 이름의 메소드를 작성할 수 있다.
 * */
class Weapon {
	// 1. 기본생성자, 생성자도 오버로딩이 되어있었던 것.(매개변수의 개수, 자료형 등)
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
	
	
	/** 오버로딩 (Overload) 
	 * 1. 복붙을 하되, 자기 자신 클래스 안에 복붙한다.
	 * 2. 매개변수의 개수나 타입을 구분한다.
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

/** 오버라이딩 (Overriding)
 * 1. 자식클래스에 똑같이 복붙하면 오버라이딩*/
class Cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}

}

public class MethodOverloadingEx {
	public static void main(String [] args) {
	// 2. println()도 오버로딩하고 있었던 것.
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}
}

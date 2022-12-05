package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point { //import > com.kh.day09.point 를 임포트하기
	void set() {	// 부모의 멤버변수는 메소드 안에서!
		pub = 1;
		//def = 2;	// error : The field Point.def is not visible
					// > defalt는 다른 패키지에서는 사용 불가능
					//	- Parent에 상속되었다면 사용가능, but Point에 상속되어있음
					// > Point.java는 'day09.point' 패키지에 있다.
		pro = 3;
		//pri = 4;	// error : The field Parent.pri is not visible
					// > private로 선언되었기 때문에 사용 불가능
	}
}

// 자식클래스
class Child extends Parent{	// 접근할 때 코드는 메소드 안에서 가능.
	void set() {	// 부모의 메소드를 사용하고 있는 것.
		pub = 1;	// 부모클래스(Parent)를 상속받기도 했고 public이라 사용가능.
		def = 2;	// 부모클래스(Parent)를 상속받았기 때문
		pro = 3;	// 자식클래스이므로 부모클래스의 메소드 사용 가능
		//pri = 4;	// error : The field Parent.pri is not visible
					// > pri는 private이므로 해당 클래스 외에는 사용 불가능.
	}
}

// 부모클래스
class Parent {
	// 모든 접근제한자
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
//		System.out.println("Parent money : " + child.money);  // private로 선언하여 실행x
		System.out.println("Parent money : " + child.getMoney());	// getMoney로 불러오기.
		
	}
}

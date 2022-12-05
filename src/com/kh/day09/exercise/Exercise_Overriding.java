package com.kh.day09.exercise;

//부모클래스
class SuperClass {	
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");	// #2
	}
}

//자식클래스 (SuperClass를 상속받음)
class SubClass extends SuperClass {
	
	// 부모클래스에 있는 메소드(paint)를 재정의함(1) => "오버라이딩"
	@Override
	void paint() {
		super.paint();	// (super)부모에 있는 paint 메소드 실행
		// (but. 부모클래스의 draw() 실행? vs 재정의된 자식클래스의 draw() 실행?)
		// => 동적바인딩 발생하여 재정의된 자식(SubClass)의 draw()가 실행된다. #1
		super.draw();	// (super)부모에 있는 draw 메소드 실행
		/** super. : 부모에 있는 메소드를 가져오는 것.**/
	}
	
	// 부모클래스에 있는 메소드(draw)를 재정의함(2) => "오버라이딩"
	@Override
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		// 변수 선언
		SuperClass ex = new SubClass();	// 업캐스팅(Upcasting)
		ex.paint();						// 부모타입 변수 ex
	}
}

package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
	/** 오버라이딩(Overriding) 개념
	 * - 슈퍼클래스의 메소드를 서브클래스에 '재정의'하는 것.
	 * 1. 슈퍼클래스의 메소드를 서브클래스에 똑같이 복붙한다.
	 * 
	 * super. : 부모에 있는 것을 가져오는 것.
	 * 
	 * 동적바인딩 : 자식클래스에 오버라이딩된 메소드가 있으면
	 * 				부모클래스로 가지않고 그 메소드가 실행된다.**/
		p.draw();	// 원래 부모(Shape)가 실행되어야하지만 오버라이딩된
					// 자식(Line)이 출력된다. = 동적바인딩 되었다.
		
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		//line.draw();
		paint(line);
		paint(new Rect());	// 업캐스팅(Upcasting)으로 오류안남
							// Rect.java에 오버라이딩해놓아서 먼저 실행됨
		paint(new Circle());	// 오버라이딩(재정의)하지 않았기때문에 부모가 실행된다.
	}
}


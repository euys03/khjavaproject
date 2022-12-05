package com.kh.day08.oop;

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}

public class CircleArray {
	public static void main(String [] args) {
		Circle [] c;
		c = new Circle[5];	// 배열의 할당(new + 대괄호[] -> 화살표 x)
		
		// 객체 생성 및 초기화
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);	// 배열에 들어갈 값 할당(new + 소괄호())
									// (이때 화살표가 생기며 참조된다.)
		}
		// 객체배열 출력
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i].getArea() + " ");
//			System.out.println((int)c[i].getArea() + " ");	//정수로 출력하려면
												// (int)로 형변환하여 출력한다.
		}
	}
}









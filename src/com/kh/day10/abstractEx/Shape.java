package com.kh.day10.abstractEx;

class Line extends Shape {
// Line error : The type Line must implement the inherited abstract method Shape.draw()
// (상속받은 draw메소드는 구현되어야한다.(-> Line오류 위에서 'Add Unimplemented Methods'해줘야한다.))

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}
}

// error : The abstract method draw in type Shape can only be defined by an abstract class
// (Shape는 추상메소드를 갖고있으므로 추상클래스여야 한다. -> abstract 추가)
public abstract class Shape {
	// 생성자 - 변수 생성 및 초기화
	public Shape() {}
	public void paint() {}
	// draw를 추상메소드로 변경 (abstract)
	abstract public void draw();
	// error : Abstract methods do not specify a body
	// 중괄호(몸체)를 사용할 수 없는데 사용하였다.
	// (draw는 추상메소드이므로 추상클래스 안에 존재해야한다.)
	
	
}

package com.kh.day09.point;


public class ColorPointEx {
	public static void main(String[] args) {
		/** ColorPoint에 매개변수 있는 생성자가 있고 기본생성자가 없는 상태!
		 * 기본 생성자가 없는데 기본생성자를 사용하려니 오류가 난다.
		 * 1. ColorPoint 클래스에 기본생성자를 쓰거나
		 * 2. 아래 코드를 매개변수 있는 생성자로 바꿔준다. [v]
		**/
		ColorPoint cp = new ColorPoint(5, 6, "blue");
//		cp.set(3, 4);	// Point의 set() 호출
//		cp.setColor("red");	// ColorPoint의 setColor() 호출
		// error : blue cannot be resolved to a variable
		cp.showColorPoint();  //컬러와 좌표 출력
		
		/**출력결과
		 * red		// (자식메소드) 		
		 * (3, 4)	// 부모클래스 Point의 showPoint()로 출력(부모메소드)
		 * */
	}
}

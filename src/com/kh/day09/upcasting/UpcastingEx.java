package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("일용자");
		
		//p = new Person("");	// 그냥 객체생성하는 방법.
		p = s;	//업캐스팅하는 방법.(p가 부모타입의 레퍼런스 변수)
		
		System.out.println(p.name);
		
//		System.out.println(p.grade);	// 자식클래스가 갖고있는 것이라 오류가 난다. 
//		System.out.println(p.department);	// 자식클래스가 갖고있는 것이라 오류가 난다.

		
		// 다운캐스팅 => 강제형변환하여 자식객체를 사용해라
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
		
	}

}

package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) {
		//Person p = new Student();	//가 성립되고 있다는 뜻이다.
		
//		if(p instanceof Person)
//			System.out.println("Person입니다!");
		if(p instanceof Student)
			System.out.println("Student입니다!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
		if(p instanceof Professor) {
			System.out.println("Prefessor입니다!");
		}
	}
	
	public static void main(String[] args) {
		//print(new Person());
		//Person p = new Student();	=> Person p 에 new student 안된다고 오류
		// error : The method print(Person) in the type InstanceOfEx
		// 			is not applicable for the arguments (Student)

		print(new Student());	// Upcasting이 되면 student를 넣어도 동작한다.
					// student가 오류나면 person입니다!가 실행이 안되어야한다.
		print(new Researcher());
		print(new Professor());
		// Student, Researcher -> person을 상속받음
		// Professor -> Researcher을 상속받음
		// Professor의 경우 Professor -> Researcher -> Person()의 의미.
		// 건너건너 상속받아도 Upcasting이 되어 person을 호출하는 것을 알 수 있다. 
	}
}

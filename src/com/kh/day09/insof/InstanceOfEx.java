package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) {
		//Person p = new Student();	//�� �����ǰ� �ִٴ� ���̴�.
		
//		if(p instanceof Person)
//			System.out.println("Person�Դϴ�!");
		if(p instanceof Student)
			System.out.println("Student�Դϴ�!");
		if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�!");
		if(p instanceof Professor) {
			System.out.println("Prefessor�Դϴ�!");
		}
	}
	
	public static void main(String[] args) {
		//print(new Person());
		//Person p = new Student();	=> Person p �� new student �ȵȴٰ� ����
		// error : The method print(Person) in the type InstanceOfEx
		// 			is not applicable for the arguments (Student)

		print(new Student());	// Upcasting�� �Ǹ� student�� �־ �����Ѵ�.
					// student�� �������� person�Դϴ�!�� ������ �ȵǾ���Ѵ�.
		print(new Researcher());
		print(new Professor());
		// Student, Researcher -> person�� ��ӹ���
		// Professor -> Researcher�� ��ӹ���
		// Professor�� ��� Professor -> Researcher -> Person()�� �ǹ�.
		// �ǳʰǳ� ��ӹ޾Ƶ� Upcasting�� �Ǿ� person�� ȣ���ϴ� ���� �� �� �ִ�. 
	}
}

package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("�Ͽ���");
		
		//p = new Person("");	// �׳� ��ü�����ϴ� ���.
		p = s;	//��ĳ�����ϴ� ���.(p�� �θ�Ÿ���� ���۷��� ����)
		
		System.out.println(p.name);
		
//		System.out.println(p.grade);	// �ڽ�Ŭ������ �����ִ� ���̶� ������ ����. 
//		System.out.println(p.department);	// �ڽ�Ŭ������ �����ִ� ���̶� ������ ����.

		
		// �ٿ�ĳ���� => ��������ȯ�Ͽ� �ڽİ�ü�� ����ض�
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
		
	}

}

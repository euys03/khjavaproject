package com.kh.day09.upcasting;

public class Student extends Person{
	String grade;
	String department;
	// error : Implicit super constructor Person() is undefined
	// 		   for default constructor. Must define an explicit constructor
	// -> �⺻������ �ۼ����� �ʾƼ� �߻�
	
	// �⺻������
	public Student(String name) {
		super(name);
	}
}

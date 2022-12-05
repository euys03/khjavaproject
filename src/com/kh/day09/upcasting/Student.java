package com.kh.day09.upcasting;

public class Student extends Person{
	String grade;
	String department;
	// error : Implicit super constructor Person() is undefined
	// 		   for default constructor. Must define an explicit constructor
	// -> 기본생성자 작성하지 않아서 발생
	
	// 기본생성자
	public Student(String name) {
		super(name);
	}
}

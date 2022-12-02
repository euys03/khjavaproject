package com.kh.day07.oop;

// 클래스 생성
public class Person {
	
	//	private(캡슐화)로 선언하게 되면 Run.java에서 접근이 불가능하다.
	//	-> public은 가능.
	private String name;	// 이름
	public String jobName;	// 직업
	int age;	// 나이
	char gender;	// 성별
	String bloodType;	// 혈액형
	
	
	public Person() {}	// 기본 생성자
	
	public void eat() {		//밥먹기
		
	}			

	public void sleep() {	//잠자기
		
	}
	
	public void speak() {	//말하기
		
	}
	
	public void walking() {	//걷기
		
	}

}

/**
 * 생성자란? 클래스명과 이름이 똑같은 메소드로서
			 객체생성하고 객체를 초기화해주는 역할을 한다.
 **/

package com.kh.day08.student;

public class Student {	
	private String name;	// -> private 이므로 getter 메서드 사용
	private int firstScore;
	private int secondScore;
	
	// (기본)생성자
	public Student() {}
	
	// 매개변수 있는 생성자
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int firstScore, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	
	// getter 메소드
	// 멤버변수의 값을 리턴해줘야한다. (void -> String,int)
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	
	// setter 메소드
	// 매개변수값 필요
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}

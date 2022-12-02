package com.kh.day07.student;

public class Student {
	// 캡슐화.
	// 점수나 이름은 접근제한(private)로 선언했다.
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {	
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
// 멤버변수가 private이기 때문에 간접적으로 접근해야한다. (setter, getter메소드)
	
	// setter 메소드
	// 멤버변수에 각각 초기화해준다.
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// getter 메소드
	// 멤버변수의 값을 리턴한다.
	// name을 private로 선언하여 외부에서 접근이 불가하므로 우회해서 사용하기위한 코드들.
	// 멤버변수를 불러오는 메소드명은 get 뒤에 필드명을 붙여줘야 한다.(원칙)
	public String getName() {
		return this.name;	// name을 사용할 수 있도록 return 해준다.
							// -> 반환형이므로 void->string으로 바꿔줘야한다.
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
}

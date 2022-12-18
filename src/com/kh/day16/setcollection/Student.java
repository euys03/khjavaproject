package com.kh.day16.setcollection;

// SetRun.java의 오류방지용
public class Student {
	
	private String name;
	private int score1;
	private int score2;
	
	/** 메소드 자동완성 **
	 * (주의) 우클릭은 전 메소드의 괄호 바로 다음 클릭 후 해야한다.
	 * 우클릭 -> source -> Generate Constructor using Feild -> 초기화할 메소드만 체크 후 Generate
	 * 
	 * getter/setter 자동완성
	 * 우클릭 -> sorce -> Gerate Getters and Setters -> getter/setter 사용할 메소드들 선택
	 * 
	 * ----------------------------------------------------------------------
	 ** 오버라이딩 **
	 * 오버라이딩하지 않으면 같은 내용이지만 각각 새로운 객체들로 인식하여 결과값(숫자)이 모두 다르지만
	 * 오버라이딩함으로써 같은 내용을 추가하더라도 동일한 내용으로 인식하여 동일한 숫자가 출력된다.
	**/
	
	
	// 메소드 자동완성 (기본생성자 자동완성)
	 // 우클릭 -> source -> Generate Constructor using Feild -> 초기화할 메소드만 체크 후 Generate
	public Student() {
		super();
	}
	// 메소드 모두 체크 (매개변수 생성자도 자동완성 가능)
	public Student(String name, int score1, int score2) {	// 매개변수 개수 맞춰주기!
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	
	// getter/setter 자동완성
	// 우클릭 -> sorce -> Gerate Getters and Setters -> getter/setter 사용할 메소드들 선택
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	
	// 오버라이딩하지 않으면 같은 내용이지만 각각 새로운 객체들로 인식하여 결과값(숫자)이 모두 다르지만
	// 오버라이딩함으로써 같은 내용을 추가하더라도 동일한 내용으로 인식하여 동일한 숫자가 출력된다.
	
	// hashCode 오버라이딩
	@Override
	public int hashCode() {
		// SetRun에서 입력한 데이터들을 this.로 받아와 '이름, 1차점수, 2차점수'로 구성된
		// 문자열이 만들어지고, 해당 문자열의 해쉬코드(.hashCode()) 값을 리턴하도록 오버라이딩 하였다.
		// 출력하였을 때 동일한 데이터를 여러개 입력하여도 '동일한 내용'으로 인식하여 동일한 숫자가 출력된다.
		return (this.name + this.score1 + this.score2).hashCode();
	}
	
	// 매번 ( System.out.println(kdw.getName() + ", " + kdw.getScore1() + ", " + kdw.getScore2()); ) 하여
	// 데이터값을 확인하기 어려우므로 information메소드를 Student클래스에 따로 만들어
	// 출력문을 information()에 쓰고 불러서 사용하는 형식으로 사용한다.
	// -> toString을 오버라이딩하여 더 쉽게 사용한다.
	public String information() {	// return형(int는 string으로 바뀌므로 최종 자료형은 string이 된다. void -> string)
		return "name : " + this.name + ", socre1 : " + this.score1 + ", socre2 : " + this.score2;
	}
	
	// toString 오버라이딩 -> information() 메소드를 만드는 방법보다 더 간편하게 사용가능
	@Override
	public String toString() {

		return "name : " + this.name + ", socre1 : " + this.score1 + ", socre2 : " + this.score2;
//		return super.toString();
	}
	
	
	
	// equals 오버라이딩 (3개를 비교해야하는 상황이므로 오버라이딩)
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std = (Student)obj;	// Student로 다운캐스팅
			// SetRun에서 추가한 값이 전에 추가되었던 값과 같은지 비교
			// 같다면 같은 값으로 인식하고 같은 값 출력 (서로 다른 객체로 인식하지 않는다)
			return this.hashCode() == std.hashCode();	// 전 == 후
			
		}else {
			return super.equals(obj);
		}
	}
	
	
	
	
	
	
}

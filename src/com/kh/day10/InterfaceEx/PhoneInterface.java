package com.kh.day10.InterfaceEx;

// 인터페이스는 추상메소드와 상수필드, default메소드만 갖는다.
public interface PhoneInterface {
	
	//1. error : Illegal modifier for the interface field PhoneInterface.name;
	//		  	 only public, static & final are permitted
	//private String name; -> 해결방법 : 아래코드로 public으로 변경 후 초기값 선언 ("")
	public String name = "";
	// 기울여진 문자(name) = 상수(static:변하지않는 값)
	// 아래 코드의 주석을 풀었을 때 name이 위 코드의 name과 동일한 색,비스듬하지 않는 이유
	//	: name이 상수이기 때문에. 상수인 name에 "Hello World"를 넣을 수 없다.
	//	그러므로 아래 코드 주석을 풀면 위 name과 별개인 '변수' name이 생성되는 것.
	//name = "Hello World";	// -> 상수값이라서 바뀌지 않음.
	
	/**기울여진 문자는 static을 의미한다.
	 * static이 숨겨져 있는 상태('static final'이 생략되어있는 상태)
	 **/
	// 아래 'static final'이 있는 코드는 그대로 입력됨.
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	// 2. error : Abstract methods do not specify a body (중괄호(몸체){} 사용 불가능)
	//public void printLogo() {}	-> 해결방법 : 아래코드와 같이 {}제거 후 abstract사용 
	abstract void printLogo();	// abstract만 써도 되고,
	void displayNumber();		// void만 써도 된다.
	public default void showLogo() {	// 디폴트 메소드
		/** 디폴트메소드 : 유일하게 몸체를 사용할 수 있게 하는 메소드
		 * 하위 호환성을 위해서 작성한다.
		 * 즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		 * (이전에 만든 프로그램에 대한 호환성 및 인터페이스의 보완)
		 **/
		System.out.println("** LG **");
	}
}

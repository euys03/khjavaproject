package com.kh.day10.InterfaceEx;

//public class SamsungPhone extends PhoneInterface {
//
// error1 : The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
//			(PhoneInterface는 부모클래스가 아니다.) -> 오류해결방법 : implements작성 및 오버라이딩해주기
//
//}

// 인터페이스는 메소드명에 어느정도 강제성이 있다.(오버라이딩할 경우 메소드명을 자동으로 정해주기 때문)
public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요");
		
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
		
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
		
	}
	
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}
		
}


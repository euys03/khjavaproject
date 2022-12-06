package com.kh.day10.InterfaceEx;

//public class SamsungPhone extends PhoneInterface {
//
// error1 : The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
//			(PhoneInterface�� �θ�Ŭ������ �ƴϴ�.) -> �����ذ��� : implements�ۼ� �� �������̵����ֱ�
//
//}

// �������̽��� �޼ҵ�� ������� �������� �ִ�.(�������̵��� ��� �޼ҵ���� �ڵ����� �����ֱ� ����)
public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("�ѷ�����");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��������");
		
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
		
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx-xxxx-xxxx");
		
	}
	
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}
		
}


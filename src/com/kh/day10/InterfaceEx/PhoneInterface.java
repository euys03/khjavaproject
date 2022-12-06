package com.kh.day10.InterfaceEx;

// �������̽��� �߻�޼ҵ�� ����ʵ�, default�޼ҵ常 ���´�.
public interface PhoneInterface {
	
	//1. error : Illegal modifier for the interface field PhoneInterface.name;
	//		  	 only public, static & final are permitted
	//private String name; -> �ذ��� : �Ʒ��ڵ�� public���� ���� �� �ʱⰪ ���� ("")
	public String name = "";
	// ��￩�� ����(name) = ���(static:�������ʴ� ��)
	// �Ʒ� �ڵ��� �ּ��� Ǯ���� �� name�� �� �ڵ��� name�� ������ ��,�񽺵����� �ʴ� ����
	//	: name�� ����̱� ������. ����� name�� "Hello World"�� ���� �� ����.
	//	�׷��Ƿ� �Ʒ� �ڵ� �ּ��� Ǯ�� �� name�� ������ '����' name�� �����Ǵ� ��.
	//name = "Hello World";	// -> ������̶� �ٲ��� ����.
	
	/**��￩�� ���ڴ� static�� �ǹ��Ѵ�.
	 * static�� ������ �ִ� ����('static final'�� �����Ǿ��ִ� ����)
	 **/
	// �Ʒ� 'static final'�� �ִ� �ڵ�� �״�� �Էµ�.
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	// 2. error : Abstract methods do not specify a body (�߰�ȣ(��ü){} ��� �Ұ���)
	//public void printLogo() {}	-> �ذ��� : �Ʒ��ڵ�� ���� {}���� �� abstract��� 
	abstract void printLogo();	// abstract�� �ᵵ �ǰ�,
	void displayNumber();		// void�� �ᵵ �ȴ�.
	public default void showLogo() {	// ����Ʈ �޼ҵ�
		/** ����Ʈ�޼ҵ� : �����ϰ� ��ü�� ����� �� �ְ� �ϴ� �޼ҵ�
		 * ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		 * ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		 * (������ ���� ���α׷��� ���� ȣȯ�� �� �������̽��� ����)
		 **/
		System.out.println("** LG **");
	}
}

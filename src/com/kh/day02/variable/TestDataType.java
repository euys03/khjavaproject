package com.kh.day2.variable;

public class TestDataType {
	public static void main(String [] args) {
		// �ڷ���(int) ������(kh) ���Կ�����(=) ������(34) ;
		// 1. �ڷ����� ����
		// ����(int), ���ڿ�(String)
		
		// ���� PART **
		byte bNum = 127;		// -128 ~ 127
		short sNum = 32767;		// -32768 ~ 32767
		int iNum = 2147483647;	// -21474843648 ~ 2147483647
		long lNum = 2147483648l;	// ���̻� l�� �ٿ��� ��.
		short num = 128;
		
		// �Ǽ� PART **
		float fNum = 22.1123f;	//���̻� f�� �ٿ��� ��.
		double dNum = 23.502;	//(����� ���� �� ���� ���)
		
		// ���� PART **
		char fChar = 'A';	// ''(��������ǥ)�� "�� ����" ���ڸ� �� �� ����.
		String sChar = "Hello Java";	// ""(�ֵ���ǥ) �ȿ��� "��������" ����.
		
		// Boolean�� - �񱳿�����( 1 > 0 , 2 < 1 )
		boolean result = false;
		
		System.out.println("������ ��: "+ iNum);
		System.out.println("������ ��(9999��) :"+lNum);
		System.out.println("�Ǽ��� �� : "+fNum);
		System.out.println("�Ǽ��� �� : "+dNum);
		System.out.println("������ �� : "+fChar);
		System.out.println("���ڿ��� �� : "+sChar);
		System.out.println("���� �� : "+result);
		
		
		fChar = 66;
		System.out.println("���ڿ� ����: "+fChar);
		fChar = 75;
		System.out.println("���ڿ� ����2: "+fChar);
		// ASCII(�ƽ�Ű)�ڵ� => ���ڴ� ���ڸ� ������ �� �ְ� ASCII�ڵ忡
								//���εǾ��ִ� ���ڷ� ����� �����ϴ�.
		
		
		
		
		
	}
}

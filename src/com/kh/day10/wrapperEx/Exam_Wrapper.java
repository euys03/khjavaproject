package com.kh.day10.wrapperEx;

public class Exam_Wrapper {
	public static void main (String [] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		// 1. error : The constructor Integer(int) is deprecated since version 9
		//Integer i = new Integer(1123);	//(������) ��ü
		
		// ��ü�� ���� ����ϴٰ�
		Integer i = Integer.valueOf(1123);	// 'static'�̸� ������ ����
		// �⺻������ ��ȯ����
		int e = i.intValue();	// �⺻��
		
		Integer f = null;
		// 2. error : Type mismatch: cannot convert from String to int
		//int m  = null;
		
		
		Character c = Character.valueOf('c');	// ��ü�� ���� ����ϴٰ�
		char che = c.charValue();				// �⺻������ ��ȯ
		
		
		Double d = Double.valueOf(3.14);	// ��ü�� ���� ����ϴٰ�
		double dd = d.doubleValue();		// �⺻������ ��ȯ
		
		
		
		
	// ���ڿ� ==> "�⺻ ������ Ÿ��(int, boolean, double)"���� ��ȯ
		int num = Integer.parseInt("123");	// Wrapper�� Integer.parseInt()�޼ҵ带 ���� ���ڷ� ��� ����
											// Wrapper������ int�� Integer�� ���.
		//System.out.println("��ȯ�� �� : " + num);
		
		int result = num + 1;
		
		
		boolean isYn = Boolean.parseBoolean("ture");	// boolean(true, false)
								// Wrapper�� Boolean.parseBoolean()�޼ҵ带 ���� boolean���� ��� ����
		 						// �⺻������Ÿ������ ��ȯ
		double fNum = Double.parseDouble("3.14");
		
		
		
		
	// �⺻ ������ Ÿ��(int, double, char) ==> "���ڿ�"�� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); //16���� 7b�� ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
		
		
		
	}
}

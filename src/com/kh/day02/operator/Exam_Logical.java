package com.kh.day2.operator;

public class Exam_Logical {
	public static void main (String [] args) {
		System.out.println("�������� ����");
		// �����̸鼭 ��������� 4.3�̻��� ��� -> AND
		// ��ǻ�Ͱ��а� �Ǵ� �濵�а��� ��� -> OR
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;	// ������ ����
		
		// num1�� num2�� �ٸ��鼭 num2�� num1���� Ŭ ��
		result1 = (num1 != num2) && (num1 < num2);
		System.out.println("result�� ����� : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2);
		// ���: f || f => false
		result3 = (num1 > num2) && (num1 != num2);
		// ���: t && t => true
		result4 = (num1 > num2) || (num1 == num2);
		// ���: t || f => true
		
		System.out.println("result2�� ����� : " + result2);
		System.out.println("result3�� ����� : " + result3);
		System.out.println("result4�� ����� : " + result4);
		System.out.println();
		
		System.out.println("�������� ����2");
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);	//true, aNum:71, bNum:55
		result2 = (aNum < bNum) && (--bNum < 55);	//false, (����x�̹Ƿ� aNum:71, bNum:55 ����x)
		result3 = (aNum != bNum) && (bNum-- < aNum++);	//true, aNum:72, bNum:54
		result4 = (aNum++ != bNum) || (bNum++ >= 85);	//true, aNum:73, bNum:54
		//������� aNum : 73, bNum : 54 .
		System.out.println("result1�� ����� : " + result1);
		System.out.println("result2�� ����� : " + result2);
		System.out.println("result3�� ����� : " + result3);
		System.out.println("result4�� ����� : " + result4);
		System.out.println("aNum�� �� : " + aNum + ", bNum�� �� : " + bNum);
		
		
		
		
	}
}

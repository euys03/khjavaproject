package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main (String [] args) {
		// System.out.println ���� ���� + ���ڿ� -> ���ڿ�
		System.out.println(1 + "1");
		
		// ���� + ���� -> ����
		System.out.println('1' + '1');	// (����) '11' => 11�� ���ڿ��̹Ƿ� x
										// 1�� �ƽ�Ű�ڵ�� 49 �̴�.
		
		// ���� + ���� + ���ڿ� + ���� -> ���������δ� ���ڿ�
		System.out.println(10 + 20 + "Hello" + 10);
		
		
		// * ���� ����Ű : ctrl + d
		
		
		// printf �� ���Ͽ� �˾ƺ���.
		// println, print -> �� �ٲ��� ����
		// printf �� ���ϴ� ���� �־���� �Ѵ�.
		System.out.print("���� �Է� : ");	// �ٷ� ���� �Է¹���.
		System.out.println("���� �Է� : ");		// �� �ٲٰ� �Է¹���.
		System.out.printf("���� �Է� : %d \n", 1);	// '������ %d'
		System.out.printf("���ڿ� ��� : %s \n", "Hello World"); // '���ڿ��� %s'
		
	}
}

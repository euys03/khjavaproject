package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			//i++;
			i = i + 2;	// ���մ��Կ�����: i += 2;
		}
		System.out.println("�հ� : " + sum);
	}
}

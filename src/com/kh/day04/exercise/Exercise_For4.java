package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main (String [] args) {
		// (for�� ����) ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9������ ���� �ϳ� �Է� : ");
		
		int dan = sc.nextInt();
		
		// int num; //�������� ����
		if ((0 < dan) && (dan < 10)) {

			for (int i = 1; i < 10; i++) {
				// num = 0;		//�������� ����
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		
		} else {
			System.out.println("1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
}

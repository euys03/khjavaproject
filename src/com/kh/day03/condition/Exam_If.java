package com.kh.day3.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		String result = "";
		
		// ¦�� �Ǻ�
		// (input % 2 == 0) ? "¦��" : "Ȧ��";
		
		
		if (input % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		// �Ǻ� �� ���
		System.out.println(input + "(��/��) "+ result + "�Դϴ�.");
		
	}
}

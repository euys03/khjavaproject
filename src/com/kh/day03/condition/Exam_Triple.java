// ���׿�����
package com.kh.day3.condition;

import java.util.Scanner;

public class Exam_Triple {
	public static void main (String [] args) {
		/*
		 * ���׿�����(�׸��� 3��)
		 * (���ǽ�) ? ���� �� : ������ ��
		 * - ���ǽ��� �ݵ�� true or false�� ��ȯ
		 * - ��/�������� �ַ� ���
		 */
		//(num1 > num2) ? "��" : "����";
		
		// ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		// ���) ���� �ϳ� �Է� : 34
		//		 34�� ¦���Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		// ¦�� �Ǻ�
		String result = (input % 2 == 0) ? "¦��" : "Ȧ��";
		// �Ǻ� �� ���
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
	}
}

package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main (String [] args) {
		// indent ���� : ctrl + shift + f
		
		
		// ���� �ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		String result = "";
		
		// ���� �Ǻ�
		if (0 < num) {
			result = "���� ����";
		} else if (num < 0) {
			result = "���� �����Դϴ�.";
		} 
		else {
			result = "0�Դϴ�.";
		}
		
		// �Ǻ� �� ���
		System.out.println(result + "�Դϴ�.");
		
	}
}

package com.kh.day2.exercise;
//ctrl + space��
import java.util.Scanner;

public class Excercise_Logical1 {
	public static void main (String [] args) {
		// 50�� 1 ~ 100 ������ �������� Ȯ���ϼ���!
		// ��, 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		// 1���� 100 ������ �����ΰ�? : ture
		
		/*
		int num = 50;
		// 1���� 100 �������� �Ǻ�
		boolean result = (num >= 1) && (num <= 100);
		// ��� ���
		System.out.println("1���� 100 ������ �����ΰ�? : " + result);
		*/
		
		// �Է��� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		
		int num = sc.nextInt();
		boolean result = (1 < num) && (num < 100);
		//��� ���
		System.out.println("1���� 100 ������ �����ΰ�? : " + result);
		
	}
}

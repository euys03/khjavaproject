package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main (String [] args) {
		// ���� �յ� ���߱� !!

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("===== ���� �� �� ���߱� =====");
		System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸�) : ");
		int choice = sc.nextInt();
		
		// computer �������� 1 �Ǵ� 2�� ���� �����ϰ� ���� ��.
		// �� 1�� 2 ������ ���ڰ� ��������.
		int computer = rand.nextInt(2) + 1;
		
		// computer�� ���� Ȯ���ϰ��� ���.
		System.out.println("��ǻ�� : " + computer);
		
		// choice�� ���� computer�� ���� ������ ������ϴ�.
		// �ٸ��� Ʋ�Ƚ��ϴ�.
		// if�� ���
		if (choice == computer) {
			System.out.println("������ϴ�.");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		
		
	}
}

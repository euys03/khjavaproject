package com.kh.day2.exercise;
//ctrl + space��
import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main (String [] args) {
		// ���� A�� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// ���� �빮�� Ȯ�� : ture
		
		/*
		char word = 'A';
		// �빮������ �Ǻ�
		// �ƽ�Ű�ڵ�. 
		// �빮��: 65~90 ������ ���� / �ҹ���: 97~122������ ����.
		boolean result = ('A' <= word) && (word <= 'Z');
		// ��� ���
		System.out.println("���� �빮�� Ȯ�� : " + result);
		*/
		
		//�Է��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		Scanner sc = new Scanner(System.in);
		//���̵� �޽���
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		boolean result = ('A' <= word) && (word <= 'Z');
		//��� ���
		System.out.println("�빮���ΰ���? : " + result);
		
		
		
	}
}

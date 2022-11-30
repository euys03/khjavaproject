package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	/*
	 * ====== ���� �޴� =======
	 * 1. �����Է�
	 * 2. �������
	 * 3. ����
	 * ���� : 1
	 * 
	 * ====== ���� �Է� =======
	 * ���� : 50
	 * ���� : 40
	 * ���� : 30
	 * 
	 * 
	 * ====== ���� �޴� =======
	 * 1. �����Է�
	 * 2. �������
	 * 3. ����
	 * ���� : 2
	 * 
	 * ====== ���� ��� ======
	 * ���� : 50
	 * ���� : 40
	 * ���� : 30
	 * 
	 * ���� : 120
	 * ��� : 40.00
	 * 
	 * ====== ���� �޴� =======
	 * 1. �����Է�
	 * 2. �������
	 * 3. ����
	 * ���� : 3 
	 * 
	 * Good Bye~
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���ѹݺ����� �� �� �ϳ� ���.
		// for(;;) {}
		// while(true) {}
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		
		// �ݺ��� ���� ESCAPE : �� ���� Ż���ϰ��� �ϴ� �ڵ��� break; �ڿ� ESCAPE��
		// ���ָ� While���� ������ �������� �Ϻ��� ���� �ȴ�.
		// �� 'ESCAPE'�� �ƴ� 'EXIT', �ǹ̾��� 'GOHOME' ��� ���� �ۼ��ص� �ȴ�.
		// ���� �ܾ��̱⸸ �ϸ� �ȴ�.
		ESCAPE :
		while(true) {
			System.out.println("====== ���� �޴� ======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("====== ���� �Է� ======");
				System.out.print("���� : ");
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;
			case 2 : 
				sum = kor + eng + math;
				double avg = (double)sum / 3;
				System.out.println("====== ���� ��� ======");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("���� : " + sum);
				// printf �� ������ �Ҽ��� �ڸ����� ���� �� �� �ִ�.
				System.out.printf("��� : %.2f", avg);
				System.out.println();
				break;
			case 3 : 
				System.out.println("Good Bye ~");
				break ESCAPE;
				
			// 1, 2, 3 ���� ���� ��� default: �� ��������.
			default :
				System.out.println("1 ~ 3 ������ ���� �Է����ּ���!");
				break;
			}	
			// �������� ���α׷�/������ ���α׷�
		}
	}
}

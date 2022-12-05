/** 
 * day7�� Student�� �޸� "���� ���� �л����� ����"�� ����� �� �ִ� �ڵ�
 * �迭 ���
 **/

package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student [] students;
	
	public StudentFunction() {
		students = new Student[3];	// �ʱ�ȭ
	}
	
	// ����� �ϴ� �޼ҵ��
	// printMenu(), inputScore(), printScore(), checkPass(), printGoodBye(), printException() 
	public int printMenu() {	// void -> int
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== �л� ���� Ȯ�� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		
		int menu = sc.nextInt();
		return menu;	// ��ȯ��(return)�̹Ƿ� public void�� �ڷ����� ��������Ѵ�.
						// menu�� �Է°����� �����̹Ƿ� void -> int �� ����.
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("=======" + (i+1) + "��° �л� ���� �Է� =======");
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.print("2�� �����Է� : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}
	
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======" + (i+1) + "��° �л� ���� ���");
			System.out.println(students[i].getName() + "�л��� ������ ");
			System.out.println("1�� ���� : " + students[i].getFirstScore() + ", 2�� ���� : " + students[i].getSecondScore() + "�Դϴ�.");
		}
	}
	
	public void checkPass() {
		/*
		 * 0. ������ ���δ� 1��, 2���� ���� �ٸ���.
		 * 1. ������ 40�� �̸��� ��� �������� ���� ����ڰ� �ȴ�. �� ���� 40�� �̸��� ���
		 	  1��, 2�� ����� 60�� �̻��̸� 40�� �̸��� ���� ���򰡸� ����.
		 * 2. 1�� ������ 2�� ������ ����� 60���� �Ѿ�� ����Ѵ�.
		 * 3. 1�� ������ 2�� ������ ����� 60�� �̸��� ��� 60�� �̸��� ���� ���ؼ� ���򰡸� ����.
		 * */
		
		for(int i = 0; i < students.length; i++) {
			
			int test1 = students[i].getFirstScore();
			int test2 = students[i].getSecondScore();
			double avg = (test1+test2)/(double)2;
			System.out.println((i+1) + "��°, " + students[i].getName() + "�л��� Ȯ�� ���");
			
			if(avg >= 60) {
				// ���� �߻�
				// 1�� ���� : 20��, 2�� ���� : 100��
				// 1�� ���� : 100��, 2�� ���� : 20��
				if(test1 < 40) {
					System.out.println("1�� ���� ���� ������Դϴ�.");
				} else if(test2 < 40) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				} else if(avg >= 60 ) {
					System.out.println("����Ͽ����ϴ�.");					
				}
			} else {
				// ��� ���� �����!
				// 1�� ������ ���, 2�� ������ Ż��
				// 1�� ������ Ż��, 2�� ������ ���
				// 1�� ���赵 Ż��, 2�� ���赵 Ż��
				if(test1 < 60) {
					System.out.println("1�� ���� ���� ������Դϴ�.");
				} 
				if(test2 < 60) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				}
			}
		}
		
//		if(num1 < 40) {
//			System.out.println("1�� ���� ���� ������Դϴ�.");
//		}else if(num2 < 40) {
//			System.out.println("2�� ���� ���� ������Դϴ�.");
//		}else if(avg >= 60){
//			System.out.println("����Ͽ����ϴ�.");
//		}else {
//			if(num1 < 60) {
//				System.out.println("1�� ���� ���� ������Դϴ�.");
//			}else if(num2 < 60) {
//				System.out.println("2�� ���� ���� ������Դϴ�.");
//		}
//	}
		
	}
	
	public void printGoodBye() {}
	
	public void printException() {}
}

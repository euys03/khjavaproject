// for������ "����" �����

package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator_For {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(;;) {	//���ѹݺ���
			System.out.print("���� �ϳ� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("���� �ϳ� �� �Է� : ");
			int num2 = sc.nextInt();
			System.out.print("������ �Է�(+, -, *, /, %) : ");
			// ���ڿ�(sc.next())�� ù��° ���� �ڸ�(charAt(0))
			char operator = sc.next().charAt(0);
			
			int result = 0;
			// ������ �Ǻ� �� ���� ����, �׸��� ��� ����.
			switch(operator) {
			case '+' : 
				result = num1 + num2;
				break;
			case '-' : 
				result = num1 - num2;
				break;
			case '*' : 
				result = num1 * num2;
				break;
			case '/' : 
				result = num1 / num2;
				break;
			case '%' : 
				result = num1 % num2;
				break;
			}
			
			System.out.println("��� : " + num1 + " " + operator + " " + num2 + " = " + result + "\n");
			//break;	// ���ѹݺ���(for(;;)�� �������� �ұ��ϰ� break�� ���ָ� �� '�ѹ���' �ݺ��Ѵ�.
			count++;	//��¿� �������� �� ī��Ʈ ��!
			if(count == 3) break;	//3���� �ݺ��ϵ��� count ����
			
		}
		// System.out.println ���� ���� + ���ڿ� -> ���ڿ�
		// �ڼ��� ���� => 'com.kh.day04.exercise - Exercise_PrintSample.java'
		
		
		
		
		
		
		
		
		
		
	}
}

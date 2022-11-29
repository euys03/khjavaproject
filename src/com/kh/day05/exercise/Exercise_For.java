// day04�� Exercise_For1~4 ��� ������ �� exercise1~4 ��� �޼ҵ� ������ �޼ҵ带 ����.
// ������ �ּ�ȭ�س��� 'outline'�� Ŭ���ϸ� ��� �޼ҵ���� �� �� �ִ�.
// com.kh.day05.run���� ������ Ȯ���� �� �ִ�.(main�Լ��� RunŬ������ �����س���)

package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	// �Ű������� ��ȯ�� ��� ���� �ƹ� ��ɾ��� �޼ҵ�(exercise1) ����
	public void exercise1() {
		// ������
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			sum = i + sum;
		
		}
		System.out.println("1���� 10������ �� : " + sum);
	}
		
		
	public void exercise2() {
		
		// 1���� 10������ ������ ǥ���ϰ� �հ� ���Ͻÿ�.
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		int sum = 0;
		
		for (int i = 1; i < 11; i++) {
			
			sum = i + sum;
			System.out.print(i);
			if (i < 10) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
			
		}
		System.out.println(sum);
	}
	
	
	public void exercise3() {
		// ������ ����ϱ�!
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		
		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + 3*i);
		}
	}
	
	
	public void exercise4() {
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


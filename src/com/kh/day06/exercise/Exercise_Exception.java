package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
		// (�ٽ� �Է�) ���� �ݺ�
		// ���1) for(;;) {}
		// ���2) while(true) {}
			while(true) {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("���� �ϳ� �Է����ּ��� : ");
					int num1 = sc.nextInt();
					System.out.println("���� �ϳ� �� �Է����ּ��� : ");
					int num2 = sc.nextInt();
					System.out.println("������ ����!");
					int result = num1 / num2;	// 0�� �Է��ߴ��� ���ܰ� �߻��ϴ� �κ�
					System.out.println("���� " + result + "�Դϴ�.");
					break;	//0�� �Էµ� ������ break�� �������� �ʰ�, catch������ ��� �Ѿ��.
					// 0�� �Էµ��� �ʰ� �����ڵ尡 �ԷµǸ� break���� ����Ǿ� ������.
				
			} catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	
	public void practice2() {
// ���� 3�� �Է¹޾� �� ���ϱ�.
		
//		���� 3���� �Է��ϼ���
//		0>>5
//		1>>R	// �����Է½� �������� �ڵ�
//		������ �ƴմϴ�. �ٽ� �Է��ϼ���!
//		1>>4
//		2>>6
//		���� 15
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;	//��������
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt();	   //�������� : int num ���� �����Ѵٸ�. try�ȿ����� ��밡��.
				
			}catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next();	// �Էµ� R��(����) ���� (� ������ ���� ���߱� ������
							// 						������� �ʰ� �״�� �������.)
				i--;	// 1>>�� ���ڸ� �Է��Ͽ� '������ �ƴϴ�'��� �޽����� ���� ���
						// 2>>�� �Ѿ�� �ʰ� 1>>�� �̾ �ٽ� �Է¹޵��� i-- �� ���ش�.
						// �׷��� ������ 45�ٿ��� i++�� ���� +1�� 2>> �� �Է��ϰ� �ǹǷ�.
				continue;	// catch�� �߻��Ͽ��� ��(���ڰ� �ԷµǾ��� ��) sum += num; �� ��ŵ�ϵ��� ��.
							// continue�� ������ �ش� �� ó��(for��)���� �ö�.
				
			}
			sum += num;
		}
		System.out.println("���� " + sum);
		
	}
}

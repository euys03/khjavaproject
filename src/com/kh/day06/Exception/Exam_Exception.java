/* ����ó�� (Exception)
 * ���������� ���ᰡ ���� �ʵ��� �ϴ� ��.
 * try - catch - final �� ����
 * */

package com.kh.day06.Exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		try {	// ���ܰ� �߻��ϴ� �κи� try������ �־ ������
				// ������ �ڵ� ��ü�� �ִ´�.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �ϳ� �Է����ּ��� : ");
			int num1 = sc.nextInt();
			System.out.println("���� �ϳ� �� �Է����ּ��� : ");
			int num2 = sc.nextInt();
			System.out.println("������ ����!");
			int result = num1 / num2;	// 0�� �Է��ߴ��� ���ܰ� �߻��ϴ� �κ�
			System.out.println("���� " + result + "�Դϴ�.");
			
			
		} catch(ArithmeticException e) {
			// �ܼ��� ����(ArithmeticException)�� �����ؿ� �� �������� ���´�.
			// (������ e �� ����)
			// ���������� �ڵ�� ����Ǵ� ���� �ƴ� catch������ ����ȴ�.
			System.out.println("0���� ������ �ȵſ�!");
			
		}
		
	}
}

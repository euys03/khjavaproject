package com.kh.day10.exercise;
// ���� 5��PDF p.49 ����

// error : The type GoodCalc must implement
// 		   the inherited abstract method Calculator.add(int, int)
// (�����ؾ��Ѵ�.�� ���� -> ���� ������ 'Add Unimplemented Methods'���ش�)
public class GoodCalc extends Calculator {
	
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		//����(a), �Ҵ�� �ʱ�ȭ
		int [] a = {1, 2, 3, 4, 5};
		
		System.out.println("���� : " + calc.add(1, 2));
		System.out.println("���� : " + calc.substract(5, 2));
		System.out.println("��� : " + calc.average(a));
	}

	@Override	// ���ϱ�
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override	// ����
	public int substract(int a, int b) {
//		int result = a - b;
//		return result;
		return a - b;
	}

	@Override	// ���
	public double average(int[] a) {
		//(ex.��ձ��ϱ� 1��)
		//a = {1, 2, 3}
		//int sum = a[0] + a[1] + a[2];
		//double avg = sum/(double)3;
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;	// return ����� ��°���
		
	}

}

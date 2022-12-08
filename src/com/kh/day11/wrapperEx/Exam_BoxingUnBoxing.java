package com.kh.day11.wrapperEx;

public class Exam_BoxingUnBoxing {
	public static void main(String [] args) {
		// Integer�� ����� ������ �� �ִ� ���
		// Integer�� �ִ� 'valueOf'��� static�޼ҵ带 ���� ��ü�� ������ش�.
		Integer num = Integer.valueOf(0);
		
		// Boxing(�ڵ� �ڽ�)
		// ���� ������ boxing(���Ѵ�)�� �����ϰ� �ڵ����� ����
		Integer su = 100;
		//��ü�� ����ϴ� �⺻������ ����
		int soo = num.intValue();
		
		// UnBoxing(�ڵ� ��ڽ�)
		// boxing�� ���ŷο�Ƿ� num.intValue()�� �ٷ� �Է����ش�.
		soo = num.intValue();
		
		
		// Boxing, Unboxing ����
		int n = 10;
		Integer intObject = n;	// Integer.valueof() �����ʰ� �ٷ� n�� ���� �� �־��� 
								// -> ���Ⱑ �ڽ̺κ����� �� �� �ִ�.
		System.out.println("intObject : " + intObject);
		
		
		int m = intObject + 10;	// intObject(=Integer), 10(=int)�� Integer -> int��
		// ��ȯ�Ͽ� ����߾�������� �׷��� �ʾƵ� �Ǿ���.(intObject.intvalue��ſ�)
		// -> ���Ⱑ ��ڽ̺κ����� �� �� �ִ�.
		System.out.println("m = " + m);
	}
}

// �� ��ȯ (�ڵ�/����) _�ڷ���ver.
package com.kh.day3.typetrans;

public class TestTypeTrans1 {
	public static void main (String [] args) {
		int iNum = 10;
		double dNum = 13.2;
		
		// �ڵ� ����ȯ (���� Ÿ�� -> ū Ÿ������ ��ȯ)
		// double�� result�� ���������μ� int���̾��� iNum�� ū Ÿ���� double������ ��ȯ�Ǿ� ���ȴ�.
		double result = iNum + dNum;
		System.out.println("iNum + dNum = " + result);
		
		// ���� ����ȯ (ū Ÿ�� -> ���� Ÿ������ ��ȯ. ex) �Ǽ��� ������.(����) )
		System.out.println("���� �� ��ȯ : " + (int)result);
		System.out.println("���� �� ��ȯ2 : " + (char)65);
	}
}

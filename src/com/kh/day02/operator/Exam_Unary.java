package com.kh.day2.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// ���׿�����	a++, a--, b++, b--,		++a, --a, ++b, --b
		// ���׿�����	1 + 2,	2 X 3,	4 / 2
		//				a = a + 1, a = a - 1, b = b + 1, b = b - 1
		/*
		int a = 1;
		System.out.println(a++);	// ��������(���� ����)
		System.out.println(a);
		System.out.println(a++);	// ��������(���� ����)
		*/
		//b = (--a) + b;
		//c = (a++) + (--b);
		
		//Duplicate local variable a
		System.out.println("[1�� ����]");
		System.out.println("a++;");
		System.out.println("b = (--a) + b");
		System.out.println("c = (a++) + (--b);");
		
		int a=10, b=20, c=30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a�� �� : "+a);
		System.out.println("b�� �� : "+b);
		System.out.println("c�� ��: "+c);
		

		
		System.out.print("\n");
		System.out.println("[2�� ����]");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y;");
		
		int x=100, y=33, z=0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x�� ��: "+x);
		System.out.println("y�� ��: "+y);
		System.out.println("z�� ��: "+z);
		
		System.out.print("\n");
		System.out.println("[����������]");
		boolean result = true;
		System.out.println("result�� �� : " + result);
		System.out.println("!result�� �� : "+ !result);
		
		
		
		
		
		
		
		
	}
}

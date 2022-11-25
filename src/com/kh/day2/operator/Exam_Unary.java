package com.kh.day2.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항연산자	a++, a--, b++, b--,		++a, --a, ++b, --b
		// 이항연산자	1 + 2,	2 X 3,	4 / 2
		//				a = a + 1, a = a - 1, b = b + 1, b = b - 1
		/*
		int a = 1;
		System.out.println(a++);	// 후위연산(나중 연산)
		System.out.println(a);
		System.out.println(a++);	// 전위연산(먼저 연산)
		*/
		//b = (--a) + b;
		//c = (a++) + (--b);
		
		//Duplicate local variable a
		System.out.println("[1번 문제]");
		System.out.println("a++;");
		System.out.println("b = (--a) + b");
		System.out.println("c = (a++) + (--b);");
		
		int a=10, b=20, c=30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		System.out.println("c의 값: "+c);
		

		
		System.out.print("\n");
		System.out.println("[2번 문제]");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y;");
		
		int x=100, y=33, z=0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println("x의 값: "+x);
		System.out.println("y의 값: "+y);
		System.out.println("z의 값: "+z);
		
		System.out.print("\n");
		System.out.println("[부정연산자]");
		boolean result = true;
		System.out.println("result의 값 : " + result);
		System.out.println("!result의 값 : "+ !result);
		
		
		
		
		
		
		
		
	}
}

package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main (String [] args) {
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		// 2 * 1 = 2	  3 * 1 = 3		 4 * 1 = 4
		// 2 * 2 = 4	  3 * 2 = 6		 4 * 2 = 8
		// ...
		// 2 * 9 = 18	  3 * 9 = 27	 4 * 9 = 36
		
		
		// 1. 2 * 1 = 2	  	2 * 2 = 4		2 * 3 = 6, ...
		
		// 2. 2 * 1 = 2		3 * 1 = 3		4 * 1 = 4, ...
		
		// 3. 2 * 1 = 2		3 * 1 = 3		4 * 1 = 4, ...
		//    2 * 2 = 4		3 * 2 = 6		4 * 2 = 8, ...
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");		
				//System.out.print('\t');
			}
			System.out.println();
		}
	}
}

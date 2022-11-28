package com.kh.day04.exercise;

public class Exercise_ForDouble3 {
	public static void main (String [] args) {
		/*	º°Âï±â2
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 		******
		 * 		*******
		 * 		********
		 * 		*********
		 * 		**********
		 * */
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");	
			
			}
			System.out.println("\t");
		}
	}
}

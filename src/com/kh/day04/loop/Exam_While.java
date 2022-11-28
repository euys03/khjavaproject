package com.kh.day04.loop;

public class Exam_While {
	public static void main (String [] args) {
		
		int i = 0;	// for문과 달리 while문은 초기식(선언)을 while문 안에 하면 안된다.
		while(i < 10) {
			System.out.println(i);
			i++;	// 꼭 적어야한다.
			
		/* for문과 비교
		 * for(int i = 0 ; i < 10; i++ {
		 * 		System.out.print(i);
		 * }
		 * 
		 * int i;
		 * for(i = 0; i < 10; i++) {
		 * 		System.out.print(i);
		 * */
		}
		System.out.println();	// 줄바꾸기(개행)
		int j = 9;
		while(j >= 0) {
			System.out.println(j);
			j--;
			
		/* for문과 비교
		 * for(int j = 9; j>=0; j--) {
		 * 		System.out.print(j);
		 * }
		 * */
		}
	}
}

package com.kh.day04.loop;

public class Exam_While {
	public static void main (String [] args) {
		
		int i = 0;	// for���� �޸� while���� �ʱ��(����)�� while�� �ȿ� �ϸ� �ȵȴ�.
		while(i < 10) {
			System.out.println(i);
			i++;	// �� ������Ѵ�.
			
		/* for���� ��
		 * for(int i = 0 ; i < 10; i++ {
		 * 		System.out.print(i);
		 * }
		 * 
		 * int i;
		 * for(i = 0; i < 10; i++) {
		 * 		System.out.print(i);
		 * */
		}
		System.out.println();	// �ٹٲٱ�(����)
		int j = 9;
		while(j >= 0) {
			System.out.println(j);
			j--;
			
		/* for���� ��
		 * for(int j = 9; j>=0; j--) {
		 * 		System.out.print(j);
		 * }
		 * */
		}
	}
}

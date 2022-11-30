// 2차원 배열

package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String[] agrs) {
		// 2차원배열 생성 및 할당 (4행 4열)
		int [][] arrs = new int[4][4];
		int k = 1;
		// arrs.length => 행의 길이 :4
		// arrs[0].length => 열의 길이 :3
		System.out.println("행(세로)의 크기(앞의 크기) : " + arrs.length);
		System.out.println("열(가로)의 크기(뒤의 크기) : " + arrs[0].length); 
		System.out.println();

//		일일히 초기화하는 방법 => 힘듦. 아래 for문 활용
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[1][0] = 4;
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				arrs[i][e] = k;
				k++;
		// 출력for문 따로 쓰지 않고  for문 코드에 추가하여 간단하게 사용해도 된다.
		// (출력for문은 이해를 위한 것.)
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println(); //개행해주기.
		}
		
		// 출력
//		for(int i = 0; i < arrs.length; i++) {
//			for(int e = 0; e < arrs[i].length; e++ ) {
//				// printf로 간격 일정하게 넓혀주기.
//				// System.out.print(arrs[i][e] + " ");
//				System.out.printf("%4d", arrs[i][e]);
//			}
//			System.out.println(); //개행해주기.
//		}
	}
}

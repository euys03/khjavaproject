package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		//  5   4   3   2   1
		// 10   9   8   7   6
		// 15  14  13  12  11
		// 20  19  18  17  16
		// 25  24  23  22  21

		int [][] arrs = new int[5][5];
		int k = 1;
	// [0][0]시작이 아닌 [0][4]부터 시작하여 [0][3], [0][2], ... 으로 가면된다.
		for(int i = 0; i < arrs.length; i++) {
			// arrs.length는 배열에서의 길이를 의미하므로 실제 숫자로 표현하려면
			// 1을 빼주어 초기값으로 넣는다. (arrs.length-1)
			for(int e = arrs.length-1; e >= 0; e--) {
				arrs[i][e] = k;
				k++;
			}
		}
		// 출력 부분
		for (int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println();
		}
	}
	
	public void exercise2() {
		// 5   10   15   20   25
		// 4    9   14   19   24
		// 3    8   13   18   23
		// 2    7   12   17   22
		// 1    6   11   16   21
		
	// [0][0]시작이 아닌 [4][0]부터 시작하여 [3][0], [2][0], ... 으로 가면된다.
		int k = 1;
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			// arrs.length는 배열에서의 길이를 의미하므로 실제 숫자로 표현하려면
			// 1을 빼주어 초기값으로 넣는다. (arrs.length-1)
			for(int e = arrs.length-1; e >= 0; e--) {
				// e 와 i 의 위치를 바꿔주면 된다.
				arrs[e][i] = k;
				k++;
			}
		}
		// 출력 부분
		for (int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println();
		}		
	}
	
	
	public void exercise3() {
		//  1   6   11   16   21
		//  2   7   12   17   22
		//  3   8   13   18   23
		//  4   9   14   19   24
		//  5  10   15   20   25
		int [][] arrs = new int[5][5];
		int k = 1;
	// [0][0], [0][1]이 아닌 [0][0]부터 시작하여 [1][0], [2][0], ... 으로 가면된다.
	// e 한바퀴 돌고 난 후  [0][1]부터 시작하여 [1][1], [2][1], ... 으로 간다.
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				arrs[e][i] = k;
				k++;
			}
		}
		// 출력 부분
		for (int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println();
		}		
	}
	
	public void exercise4() {
		//  1    2    3    4    5
		// 10    9    8    7    6
		// 11   12   13   14   15
		// 20   19   18   17   16
		// 21   22   23   24   25
	// hint) 조건문도 사용해야한다.
	// [0][0], [0][1], [0][2], [0][3] ...
	// [1][4], [1][3], [1][2], [1][1] ...
	// [2][0], [2][1], [2][2], [2][3] ...
	// [3][4], [3][3], [3][2], [3][1] ...
		
		int [][] arrs = new int[5][5];
		int k = 1;

		for(int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {	// 짝수일 때 증가(오른쪽으로 이동)
				for(int e = 0; e < arrs[i].length; e++) {
					arrs[i][e] = k++;
				}
			} else {	// 홀수일 때 감소(왼쪽으로 이동)
				for(int e = arrs.length-1; e >= 0; e--) {
					arrs[i][e] = k++;
				}
			}
		}
		// 출력 부분
		for (int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println();
		}
		
	}
	
	public void exercise5() {
		// 2차원 배열에 학년별로 1, 2학기 성적을 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// score가 [0][0], [1][0], [2][0], [3][0] ..의 평균을 구해야한다.
		//         [0][1], [1][1], [2][1], [3][1] ...	=> 4행 2열의 배열
		double sum = 0;
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
		for(int i = 0; i < score.length; i++) {
			for(int e = 0; e < score[i].length; e++) {
				sum += score[i][e];
			}
		}
		int hang = score.length;
		int yeal = score[0].length;
		System.out.println("4년 전체 평점 평균 : " + sum/(hang * yeal));
	}
}

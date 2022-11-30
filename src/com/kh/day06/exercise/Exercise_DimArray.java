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
	// [0][0]������ �ƴ� [0][4]���� �����Ͽ� [0][3], [0][2], ... ���� ����ȴ�.
		for(int i = 0; i < arrs.length; i++) {
			// arrs.length�� �迭������ ���̸� �ǹ��ϹǷ� ���� ���ڷ� ǥ���Ϸ���
			// 1�� ���־� �ʱⰪ���� �ִ´�. (arrs.length-1)
			for(int e = arrs.length-1; e >= 0; e--) {
				arrs[i][e] = k;
				k++;
			}
		}
		// ��� �κ�
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
		
	// [0][0]������ �ƴ� [4][0]���� �����Ͽ� [3][0], [2][0], ... ���� ����ȴ�.
		int k = 1;
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			// arrs.length�� �迭������ ���̸� �ǹ��ϹǷ� ���� ���ڷ� ǥ���Ϸ���
			// 1�� ���־� �ʱⰪ���� �ִ´�. (arrs.length-1)
			for(int e = arrs.length-1; e >= 0; e--) {
				// e �� i �� ��ġ�� �ٲ��ָ� �ȴ�.
				arrs[e][i] = k;
				k++;
			}
		}
		// ��� �κ�
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
	// [0][0], [0][1]�� �ƴ� [0][0]���� �����Ͽ� [1][0], [2][0], ... ���� ����ȴ�.
	// e �ѹ��� ���� �� ��  [0][1]���� �����Ͽ� [1][1], [2][1], ... ���� ����.
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				arrs[e][i] = k;
				k++;
			}
		}
		// ��� �κ�
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
	// hint) ���ǹ��� ����ؾ��Ѵ�.
	// [0][0], [0][1], [0][2], [0][3] ...
	// [1][4], [1][3], [1][2], [1][1] ...
	// [2][0], [2][1], [2][2], [2][3] ...
	// [3][4], [3][3], [3][2], [3][1] ...
		
		int [][] arrs = new int[5][5];
		int k = 1;

		for(int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {	// ¦���� �� ����(���������� �̵�)
				for(int e = 0; e < arrs[i].length; e++) {
					arrs[i][e] = k++;
				}
			} else {	// Ȧ���� �� ����(�������� �̵�)
				for(int e = arrs.length-1; e >= 0; e--) {
					arrs[i][e] = k++;
				}
			}
		}
		// ��� �κ�
		for (int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println();
		}
		
	}
	
	public void exercise5() {
		// 2���� �迭�� �г⺰�� 1, 2�б� ������ �����ϰ�
		// 4�Ⱓ ��ü ���� ����� ����϶�.
		// score�� [0][0], [1][0], [2][0], [3][0] ..�� ����� ���ؾ��Ѵ�.
		//         [0][1], [1][1], [2][1], [3][1] ...	=> 4�� 2���� �迭
		double sum = 0;
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
		for(int i = 0; i < score.length; i++) {
			for(int e = 0; e < score[i].length; e++) {
				sum += score[i][e];
			}
		}
		int hang = score.length;
		int yeal = score[0].length;
		System.out.println("4�� ��ü ���� ��� : " + sum/(hang * yeal));
	}
}

// 2���� �迭

package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String[] agrs) {
		// 2�����迭 ���� �� �Ҵ� (4�� 4��)
		int [][] arrs = new int[4][4];
		int k = 1;
		// arrs.length => ���� ���� :4
		// arrs[0].length => ���� ���� :3
		System.out.println("��(����)�� ũ��(���� ũ��) : " + arrs.length);
		System.out.println("��(����)�� ũ��(���� ũ��) : " + arrs[0].length); 
		System.out.println();

//		������ �ʱ�ȭ�ϴ� ��� => ����. �Ʒ� for�� Ȱ��
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[1][0] = 4;
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				arrs[i][e] = k;
				k++;
		// ���for�� ���� ���� �ʰ�  for�� �ڵ忡 �߰��Ͽ� �����ϰ� ����ص� �ȴ�.
		// (���for���� ���ظ� ���� ��.)
				System.out.printf("%4d", arrs[i][e]);
			}
			System.out.println(); //�������ֱ�.
		}
		
		// ���
//		for(int i = 0; i < arrs.length; i++) {
//			for(int e = 0; e < arrs[i].length; e++ ) {
//				// printf�� ���� �����ϰ� �����ֱ�.
//				// System.out.print(arrs[i][e] + " ");
//				System.out.printf("%4d", arrs[i][e]);
//			}
//			System.out.println(); //�������ֱ�.
//		}
	}
}

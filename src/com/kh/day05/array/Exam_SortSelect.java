package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main (String [] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬 (Insertion)
		// 2. 선택정렬
		// 3. 버블정렬
		
		// ** 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 		  데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함.
		
		int [] arrs = {2, 5, 4, 1, 3};
		int min;	// 인덱스값 저장
		for(int i = 0; i < arrs.length; i++) {		// 0번째 부터 시작 (i=0)
			min = i;	// 가장 작을 때 인덱스 값
			for(int j = i+1; j < arrs.length; j++) {	// i '다음 숫자'들과 비교
														// j = i+1
				if(arrs[min] > arrs[j]) {		// 가장 작은 배열의 수보다 i와 i 다음 숫자인
												// j가 더 작은 수라면, 그 수(j)를 min에 넣는다.
					min = j;
		
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		
		// 2, 5, 4, 1, 3	- 정렬하고자하는 숫자들
		
		// i = 0 일때
		// 1, 5, 4, 2, 3	// 첫 번째 결과
		// i = 1 일때
		// 1, 2, 4, 5, 3	// 두 번째 결과
		// i = 2 일때
		// 1, 2, 3, 5 ,4 	// 세 번째 결과
		// i = 3 일때
		// 1, 2, 3, 4, 5	// 네 번째 결과
	}
	
	}
}

// 실행은 Run.java 에서.
// 배열은 for문과 같이 쓴다.

package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.

		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + " ");
		} // 실행은 Run 패키지 가서.
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!
		String [] fruits = new String[5];
		// 핸드메이드
		/*
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";
		*/
		
		// 조금 더 편하게! -> 할당과 초기화를 동시에!
		String [] furitsGoods = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		for(int i = 0; i < furitsGoods.length; i++) {
			if(furitsGoods[i] == "바나나") {				
				System.out.print(furitsGoods[i] + " ");
			}
		}
	}
	
	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		
		int [] arrs = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력하세요 : ");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum = sum + arrs[i];	// sum += arrs[i]; (복합대입연산자)

		}
		// 평균은 '총합/데이터의 갯수', 1,2 -> 1+2 / 2 = 1.5
		System.out.println("평균은 " + (double)sum/arrs.length + "입니다.");
		
	}
	
	public void exercise4() {
		// 양의 정수 5개 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.
		
		int [] arrs = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력하세요 : ");
		
		for(int i = 0; i < arrs.length; i++) {			
			arrs[i] = sc.nextInt();
			if (arrs[i] > max) {
				max = arrs[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
	
	
	public void exercise5() {
		/*
		 * 사용자에게 주민번호를 입력 받은 후
		 * 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("주민등록번호 입력(-포함) : ");
		String memberNum = sc.next(); 	 // 문자열로 통째로 입력받음
		// String으로 입력받은 값을 하나씩 잘라서 origin 문자배열에 넣기!
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
			//System.out.print(origin[i]);
			// 반복문의 횟수는 반복문의 크기만큼 돌려야 함.
			// index이용해서 origin에 접근
			// memberNum에 인덱스 값을 잘라서 넣어야 한다.
		}
		// 배열을 복사
		// char [] copy = origin;		// 얕은 복사, 이러면 의도한 것이 아니다.
		char [] copy = new char[14];	// 주소를 할당받는 새로운 공간을 할당해줘야 한다.
										// 깊은 복사의 시작!
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';				
			}
			System.out.print(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}
	}
	
	
	// forEach문1
	public void exercise6() {
		/* 배열의 '원래' 할당 및 초기화 방법
		int [] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		*/
		int [] nums = {1, 2, 3, 4, 5};	// 할당과 초기화를 '동시에.'
		// for문을 (int i = 0; ~;~;)보다 편리하게 출력하는 방법.
		for(int num : nums) {	// 'nums'에 들어있는 숫자들을 순서대로 'num'에 넣는 것.
				// 인덱스값을 컨트롤할 시(짝수만 출력 등)에는 for-each문이 사용 불가.
				// <for문 간단하게 쓰는 방법.>
				// 윗줄에서 int 썼으므로 int써주고, nums썼으므로 num's'써준다.
				// num 자리는 윗줄의 nums랑 다른 변수명이기만 하면 된다.
			System.out.print(num + " ");
		}
	}
	
	// forEach문2
	public void exercise7() {
		/* 원래 for문 사용방법.
		String [] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
		for(int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		*/ 
		// forEach문으로 편리하게 사용하는 방법.
		String [] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}
}

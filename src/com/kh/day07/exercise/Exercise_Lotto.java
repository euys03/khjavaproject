package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void LottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복없이 추출하기 !!
		// 단, 결과는 오름차순으로 정렬
		// - 로또 번호는 6개, 로또 번호의 범위는 1 ~ 45 사이의 숫자.
		// hint) i--(다시추출), random 사용, 크기가 6인 배열
		int[] lottos = new int[6];
		Random rand = new Random();
		
		// 1. 번호를 뽑는다. x6
		for (int i = 0; i < lottos.length; i++) {
			// 번호를 뽑는다.
			// 1 ~ 45 -> 0 ~ 44 -> 1 ~ 45
			lottos[i] = rand.nextInt(45) + 1; // 6개 모두가 랜덤으로 돌아가야 한다.
			
			
			// 2. 중복인지 비교 (뒤의 숫자로 갈수록 비교하는 횟수 점점 많아진다.)
			// 이미 증가하는 변수인 i를 e < 'i' 로 써준다.(비교하는 횟수 증가 의미)
			// 비교는 이미 뽑은 숫자와 첫번째숫자부터 ~ 뽑은 숫자 전까지.
			for (int e = 0; e < i; e++) {
				if (lottos[i] == lottos[e]) {
					// 두 수가 같으면 i--;
					i--; // 숫자가 중복일경우 다시 뽑기 위해 -1 해서 되돌아간다.
					break;
				}
				// 하지만 계속 되돌아가서 첫번째부터 다시 뽑기때문에
				// 이 위치는 옳지않다.
			}
		}
		
		// 정렬
		// 3. 버블정렬
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int e = 0; e < (lottos.length - 1) - i; e++) {
				if (lottos[e] > lottos[e + 1]) {
					int temp = lottos[e + 1];
					lottos[e + 1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}

		// 4. 출력
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}

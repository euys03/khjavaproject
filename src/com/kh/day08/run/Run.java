package com.kh.day08.run;

import com.kh.day08.oop.Suit;

public class Run {
	// (3) - (2) - (1) 순서로 실행된다.
	public static void main(String [] args) {
		Suit suit = new Suit(100);		// 기본생성자가 없어서 오류가 난다.
										// 100과 같은 값 입력해주면 오류해결!
										// ('Suit' import해주기)
	}
}

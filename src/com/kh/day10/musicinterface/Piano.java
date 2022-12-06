package com.kh.day10.musicinterface;

// Instrument 인터페이스 (interface - implements)
// Musician과 악기를 인터페이스로 연결하는 것.
public class Piano implements Instrument {
	public void play( ) {
		System.out.println("도레미파솔라시도");
	}
	// 오버라이딩
	public void makeSound( ) {
		System.out.println("도시라솔파미레도");
	}
}

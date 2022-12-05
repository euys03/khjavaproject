package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	// 결론 : (3) > (2) > (1) 순서로 실행된다.
	public Suit(int size) {
		this(size, "Hazzys");
		// size = 100 (Run에서 100이라는 값을 호출했기때문)
		// this 호출했으므로 아래 출력코드가 실행되지않고 다음 호출로 넘어간다.
		System.out.println("Suit(int) 호출!");	// (1)
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		// size = 100, brand = "Hazzys"
		System.out.println("Suit(int, String) 호출");	// (2)
	}
	public Suit(int size, String brand, int pirce) {
		// size = 100, brand = "Hazzys", price = 100000.
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출");	// (3)
	}
}

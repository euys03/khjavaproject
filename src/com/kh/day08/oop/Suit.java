package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;
	
	// ��� : (3) > (2) > (1) ������ ����ȴ�.
	public Suit(int size) {
		this(size, "Hazzys");
		// size = 100 (Run���� 100�̶�� ���� ȣ���߱⶧��)
		// this ȣ�������Ƿ� �Ʒ� ����ڵ尡 ��������ʰ� ���� ȣ��� �Ѿ��.
		System.out.println("Suit(int) ȣ��!");	// (1)
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);
		// size = 100, brand = "Hazzys"
		System.out.println("Suit(int, String) ȣ��");	// (2)
	}
	public Suit(int size, String brand, int pirce) {
		// size = 100, brand = "Hazzys", price = 100000.
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) ȣ��");	// (3)
	}
}

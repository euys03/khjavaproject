package com.kh.day10.musicinterface;

// Instrument �������̽� (interface - implements)
// Musician�� �Ǳ⸦ �������̽��� �����ϴ� ��.
public class Piano implements Instrument {
	public void play( ) {
		System.out.println("�������ļֶ�õ�");
	}
	// �������̵�
	public void makeSound( ) {
		System.out.println("���ö���Ĺ̷���");
	}
}

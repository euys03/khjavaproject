package com.kh.day10.musicinterface;
// 연주
public class StageRun {
	// 자식클래스
	public static void main (String [] args) {
		Musician musician = new Musician();
		musician.playInstrument(new Piano());
		musician.playInstrument(new Guitar());
		musician.playInstrument(new Drum());
	}
}

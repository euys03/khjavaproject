package com.kh.day10.musicinterface;
// ����
public class StageRun {
	// �ڽ�Ŭ����
	public static void main (String [] args) {
		Musician musician = new Musician();
		musician.playInstrument(new Piano());
		musician.playInstrument(new Guitar());
		musician.playInstrument(new Drum());
	}
}

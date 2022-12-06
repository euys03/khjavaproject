package com.kh.day10.musicinterface;
// 뮤지션
public class Musician {
	// 부모클래스(Instrument)
	// Instrument ins = new Piano(); > (O/X) => 가능
	// Instrument를 인터페이스로 사용하여 객체를 한번의 코드로 받을 수 있다.
	public void playInstrument(Instrument instrument) {
		instrument.play();
	}
	
//	// 오버로딩(메소드명playInstrument 다르게 해도 됨)
//	public void playInstrument(Piano piano) {
//		piano.play();
//	}
//	public void playInstrument(Guitar guitar) {
//		guitar.play();
//	}
//	public void playInstrument(Drum drum) {
//		drum.play();
//	}
}

package com.kh.day10.musicinterface;
// ������
public class Musician {
	// �θ�Ŭ����(Instrument)
	// Instrument ins = new Piano(); > (O/X) => ����
	// Instrument�� �������̽��� ����Ͽ� ��ü�� �ѹ��� �ڵ�� ���� �� �ִ�.
	public void playInstrument(Instrument instrument) {
		instrument.play();
	}
	
//	// �����ε�(�޼ҵ��playInstrument �ٸ��� �ص� ��)
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

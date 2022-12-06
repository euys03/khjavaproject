package com.kh.day10.InterfaceEx;

public class InterfaceEx {
	public static void main(String [] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}

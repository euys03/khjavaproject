package com.kh.day08.student;

public class StudentRun {
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		
		ESCAPE :  // 4��(����)�� �Է¹޾��� ��� While���� ������ �������Ѵ�.
		while(true) {
			int choice = sFunc.printMenu();		// �Է��� ���� �Ѿ�� ��.
			switch(choice) {
				case 1 : 
					sFunc.inputScore();
					break;
				case 2 : 
					sFunc.printScore();
					break;
				case 3 : 
					sFunc.checkPass();
					break;
				case 4 : break ESCAPE;
				default : break;
			}
		}
		
	}
}

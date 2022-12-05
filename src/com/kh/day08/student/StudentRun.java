package com.kh.day08.student;

public class StudentRun {
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		
		ESCAPE :  // 4번(종료)을 입력받았을 경우 While문을 완전히 나가야한다.
		while(true) {
			int choice = sFunc.printMenu();		// 입력한 값이 넘어올 것.
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

// 객체 지향 프로그램.Run
// 3을 누르면 꺼지는 코드
package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
//		// -> scoreFunction에 scanner를 선언해줌으로써 run에서는 선언하지 않아도 된다
		
		// ScoreFunction이 while문 안에 들어가버리면 무한반복문을 반복할 때마다
		// ScoreFunction을 매번 new하게 되므로 입력한 값이 사라지고 계속 0이 나온다.
		ScoreFunction sFunc = new ScoreFunction();	// 무한 반복문에 포함 금지.
		
		Exit :
		while(true) {
			int choice = sFunc.printMenu();	// = sc.nextInt();
			switch(choice) {
			case 1 : 
				sFunc.inputScore();
				break;
			case 2 :
				sFunc.printScore();
				break;
			case 3 : 
				sFunc.GoodByeMsg();
				break Exit;
			default :
				sFunc.exceptionMsg();
				break;
			
			}
		}
	}
}

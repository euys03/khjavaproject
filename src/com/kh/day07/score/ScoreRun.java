// ��ü ���� ���α׷�.Run
// 3�� ������ ������ �ڵ�
package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
//		// -> scoreFunction�� scanner�� �����������ν� run������ �������� �ʾƵ� �ȴ�
		
		// ScoreFunction�� while�� �ȿ� �������� ���ѹݺ����� �ݺ��� ������
		// ScoreFunction�� �Ź� new�ϰ� �ǹǷ� �Է��� ���� ������� ��� 0�� ���´�.
		ScoreFunction sFunc = new ScoreFunction();	// ���� �ݺ����� ���� ����.
		
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

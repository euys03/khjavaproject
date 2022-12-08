package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		// 추상클래스(InputStream)의 업캐스팅(FileInputStream)
		/* 1. inputStream/fileInputStream import
		 * 2. fileInputstream 예외처리문
		 * */
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo;	//선언
			byte [] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 0, 3);
			// is.read(readBytes, , )오류 -> 해결방법 : try-catch문 생성
			// (=첫번째(0)부터 3개 읽는다)
			// 0과 3의 숫자를 바꾸면 숫자들의 위치가 변동된다.
			for(int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

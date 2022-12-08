package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			// read()메소드의 int cbuc, int off, int len ver.
			char [] cbuf = new char[3];
			reader.read(cbuf, 0, 3); // 처음부터(0) 끝까지(3인배열이므로) 배열에 넣는다.
									 // ex.(cbuf,1,2) -> 1번째부터 2개
			// 문자 하나씩 배열에 넣는다.
			for(int i = 0; i < cbuf.length; i++) {
				System.out.print(cbuf[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 반드시 실행해야 하는 코드 (다 사용한 코드는 꼭 닫아주기)
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

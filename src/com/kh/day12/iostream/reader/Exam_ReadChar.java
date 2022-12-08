package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		
		// 문자기반 '입력스트림'
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;		// 읽은 문자 개수
			
			// read.char[] ver. -> cbuf = 바이트배열 하나 필요하다는 의미.
			char [] cbuf = new char[2];	// 배열 크기 지정
				// 2개씩 읽으라는 뜻으로 'readCharNo'에는 대부분 '2'가 들어온다.
			String data = "";
			
			// 데이터가 없을 때까지 반복 (while문)
			while(true) {
				readCharNo = reader.read(cbuf);
				// 읽은 개수는 readCharNo에, 읽은 문자는 cbuf에 들어가 저장된다.
				if(readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo);
				// 인덱스가 0인 것부터 읽으려는 갯수의 범위를 설정해 string으로 바꿔 data에 저장한다.				
				// 읽은 데이터들 누적하려면 += 을 사용하여 저장해줘야한다.
			}
			// error1 : 'data' cannot be resolved to a variable
			// 해결방법 : String data를 while문 밖(try구문의 지역변수)로 선언해준다.
			
			// error2 : Unreachable code (무한반복된다는 코드)
			// 해결방법 : if - break문 작성
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			// 다 사용한 코드는 꼭 닫아주고 try - catch문
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

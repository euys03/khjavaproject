package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		// error1 : Cannot instantiate the type InputStream => new InputStream 오류
		// 해결방법 : null로 바꿔준다.
		InputStream is = null;
		
		// 1. 'FileInputStream(String name)'을 import : string값 입력
		// error2 : Unhandled exception type 'FileNotFoundException' -> Checked Exception
		// -> 객체생성(new ~생성자호출)하려면 반드시 try ~ catch 해줘야 하는 Exception.
		// FileInputStream 이라는 객체를 생성한 것.
		try {
			// 해당경로의 파일을 불러와 Consol에 출력하기(파일경로 대소문자 구분!)
			is = new FileInputStream("src/iostream/inputStream.txt");
			// error3 : Unhandled exception type IOException
			int readByte;
			
			while(true) {	
				readByte = is.read();
				System.out.print(readByte);
				// 읽을 문자(readByte) 없으면 그만 읽자.
				if(readByte == -1)	// 읽을 문자 없는 경우는 '-1'로 표현
				break;
			
				System.out.print((char)readByte);
			}
			
//			// .txt 파일 내용은 'ABCD' 문자 4개이므로 모두 읽기 위해 for문 사용
//			// 하지만 데이터가 바뀔때마나 숫자를 바꿔줘야하므로 사용할 수 없는 코드.
//			for(int i = 0; i < 4; i++) {
//				readByte = is.read();
//				// (char)로 형변환해준다. (아스키코드 -> 문자)
//				System.out.print((char)readByte);				
//			}
			
			//is.read();	// 버퍼에 있는 파일을 하나하나 읽어오는 것.
			//System.out.println("ABCD");	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/** Inputstream(Exam_Read- Byte기반_day11) 과 Reader(Exam_Read- 문자기반_day12)의 차이점
		 * inputstream.txt에 한글 적어보면 글씨가 깨지는 것을 볼 수 있다.
		 * '자'라는 글자(한글)는 2바이트로 되어있는데 1바이트씩 읽어들이므로 깨지게 된다.
		 * (1바이트는 읽어들이기 가능 ex.JDBC와 같은 영어)
		 * 반면에
		 * filereader.txt에 한글 적어보면 바이트 단위로 읽는 것이 아닌 한 문자씩 읽기 때문에 글씨가 깨지지않는다.
		 * (자바/오라클/JDBC)
		**/		
		
	}
}

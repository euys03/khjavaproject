package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			// write() 메소드 사용 및 내용작성
			char [] cbuf = "자바가 제일 쉬웠어요".toCharArray();
			writer.write(cbuf);
			
			/** .flush() 메소드 (버퍼를 비우는 용도)
			 * 버퍼에 메모리를 할당하는 방법을 '버퍼스트림'이라고 한다.
			 * 특징) 1. 버퍼가 다 찼을 경우에만 버퍼를 비운다.
			 * 		 2. read(파일 읽어오기)에는 flush()메소드가 존재하지 않아서 필요X,
						write(파일에 내용 작성하기)에는 flush()를 필수로 써줘야 한다.
			 * flush()메소드를 사용하면 버퍼가 차지 않아도 버퍼를 비울 수 있다.
			 * > .close()에 .flush()도 포함되어있어 close()만 해도 flush()와 동일하게 동작 
			 * > 하지만 아래 코드에서 다시 객체(BufferedOutputStream)를 사용하는 상황이라면
			 * 	 객체를 다시 new해야하는 상황이 생기므로 그런 경우 닫지는 말고(close 대신)
			 * 	 버퍼를 비우고(flush 사용) 사용한다. : flash()의 역할 */		
			writer.flush();
			
			System.out.println("wirte(char[]) 동작 완료!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}

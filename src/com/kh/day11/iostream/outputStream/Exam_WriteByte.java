package com.kh.day11.iostream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			// byte[]배열 추가 및 내용 입력
			byte [] data = "Real I/O".getBytes();	// 내용 입력
			os.write(data);	// 오류 -> add catch 클릭.
			
			/** .flush() 메소드 (버퍼를 비우는 용도)
			 * 버퍼에 메모리를 할당하는 방법을 '버퍼스트림'이라고 한다.
			 * 특징) 1. 버퍼가 다 찼을 경우에만 버퍼를 비운다.
			 * 		 2. read(파일 읽어오기)에는 flush()메소드가 존재하지 않아서 필요X,
						write(파일에 내용 작성하기)에는 flush()를 필수로 써줘야 한다.
			 * flush()메소드를 사용하면 버퍼가 차지 않아도 버퍼를 비울 수 있다.
			 **/			
			os.flush(); // read할 때는 flush()메소드가 존재하지 않아서 사용할 수 없지만
						// write할 때는 flush()를 항상 필수로 써줘야 한다.
			
			System.out.println("쓰기완료~!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

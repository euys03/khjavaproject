package com.kh.day11.iostream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			// byte[]배열 추가 및 내용 입력
			byte [] data = "JAVAscript".getBytes();
			//os.write(data);
			os.write(data, 3, 6); // 원하는 길이(갯수)만큼만 데이터를 넣고 싶을 경우 숫자 사용
			
			/** .flush() 메소드 (버퍼를 비우는 용도)
			 * 버퍼에 메모리를 할당하는 방법을 '버퍼스트림'이라고 한다.
			 * 특징) 1. 버퍼가 다 찼을 경우에만 버퍼를 비운다.
			 * 		 2. read(파일 읽어오기)에는 flush()메소드가 존재하지 않아서 필요X,
						write(파일에 내용 작성하기)에는 flush()를 필수로 써줘야 한다.
			 * flush()메소드를 사용하면 버퍼가 차지 않아도 버퍼를 비울 수 있다.
			 **/			
			os.flush();
			
			System.out.println("Write 완료!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

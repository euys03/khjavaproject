package com.kh.day11.iostream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		
		OutputStream os = null;	//추상클래스(A) outputStream.
		
		try {	// inputStream과 달리 코드에서 파일을 만들면 해당 경로의 폴더에서 확인할 수 있다.
			os = new FileOutputStream("src/iostream/outputStream.txt");
			// 1. FileOutputStream -> import 후 try-catch문
			// 2. os.write메소드를 통해 내용 입력
			// 3. 문자열의 문자를 하나씩 뜯어서 가져오는 것(os.wirte)
			byte [] data = "Hello I/O".getBytes();
			// getBytes메소드로 int값(숫자값 ex. H->72)으로 저장할 수 있도록 byte배열을 만들어줄 수 있다.
			
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
				os.write(data[i]);
			}
			System.out.println();
			os.flush();
			/** .flush() 메소드 (버퍼를 비우는 용도)
			 * 버퍼에 메모리를 할당하는 방법을 '버퍼스트림'이라고 한다.
			 * 특징) 1. 버퍼가 다 찼을 경우에만 버퍼를 비운다.
			 * 		 2. read(파일 읽어오기)에는 flush()메소드가 존재하지 않아서 필요X,
						write(파일에 내용 작성하기)에는 flush()를 필수로 써줘야 한다.
			 * flush()메소드를 사용하면 버퍼가 차지 않아도 버퍼를 비울 수 있다.
			 **/					

			System.out.println("쓰기완료!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

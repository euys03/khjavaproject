package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	
/* system.out.println()을 쓰지 않고도 버퍼를 이용해 입력값(메모장의 내용)을 출력할 수 있게 되었다.
 * > 실행 후 콘솔에서 엔터를 치면 버퍼에 남아있는 문자를 출력한다. */
	
	public static void main(String[] args) {
		// 버퍼 크기를 5로 하고, 표준 출력 스트림(: System.out)과 연결한
		// 버퍼 출력 스트림을 생성하라! (표준 입력스트림 : System.in)
		// C:\\Temp\\text2.txt 파일을 저장된 영문 텍스트를 읽어
		// 버퍼 출력 스트림을 통해 출력하라!!
		
		// 파일 입력용
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			
			// 콘솔 출력용
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
			
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			bout.flush();	// 버퍼의 기능확인 (엔터를 치면 동작)
							// -> 실행 후 콘솔에서 엔터를 치면 버퍼에 남아있는 문자를 출력
			bout.close();	// .close()도 flush()와 동일하게 동작하므로 close()만 해도 된다
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
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy() {
//		// [예제1.] 이미지 파일 복사
//		/* C:\\img\\wow.png -> D:\\woooow.png */
//		
//		/** [입력 & 출력 스트림 예제]
//		 * 이미지이므로 바이트 기반 
//		 * 입력스트림 : 프로그램 기준 이미지가 들어오는 것
//		 * 출력스트림 : 프로그램 기준 이미지가 나가는 것
//		**/
		
		// 바이트 기반 입력스트림
		InputStream is = null;
	
		// 출력스트림
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\wow.png");
			os = new FileOutputStream("D:\\woooow.png");
			byte [] readBytes = new byte[100];
			
			int readByteNo;	// 읽은 개수 저장하는 변수 선언
			// 읽은 개수 저장(readByteNo)
			while((readByteNo = is.read(readBytes)) != -1) {	// 파일 읽기 성공
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("복사가 완료되었습니다.");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public void memoFileMake() {
		// [예제2.] 파일저장하기
		/*
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt'' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		// 파일 저장 -> 파일 만드는 거 스트림으로 어떻게 하지?
		String fileName = sc.next();
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'" + "파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			sc.nextLine();	// 엔터를 제거해주는 코드.
			
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String input = sc.nextLine();	// '저장할 파일명 입력 : '에 입력한 후 친 엔터가
				// 이 코드의 nextLine()으로 들어와 코드가 종료되버리므로 nextLine()을 사용할 때는
				// 위의 코드와 같이 sc.nextLine()을 적어 엔터를 제거해줘야 한다.
				
				//if(input == "exit") break;
				// equals를 사용한다. ==은 객체와 객체(주소를 갖고있는 string), 주소들끼리는 내용 비교가 안된다.
				// 내용을 비교하기 위해서는 equals를 사용한다.
				// "exit"와 input은 자리바꿔도 되지만 사소한 오류발생을 최소화하기 위해 아래와 같이 사용한다.
				if("exit".equals(input)) break;	//"exit\n" 대신 trim()메소드로 공백을 제거해도 정상적으로 끝난다.
				writer.write(input + "\n");	// 내용입력 : write()메소드 사용
				i++;
				
			}
			System.out.println("파일 저장 완료 (exit는 제외하고 저장)");
			writer.flush();
			
		} catch (IOException e) {
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

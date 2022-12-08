package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		//추상클래스 타입으로 하나 선언
		InputStream is = null;
		
		/** 업캐스팅 : 서브클래스 객체를 슈퍼 클래스 타입으로 변환하는 것.
		 * - 서브클래스의 객체는 슈퍼클래스의 멤버를 모두 가지고 있음
		 * - 서브클래스의 객체는 슈퍼클래스의 객체로 취급할 수 있음
		 * - '사람은 생물이다'의 논리와 같음 */
		
		try {	// 업캐스팅 (InputStream과 FileInputStream)
			is = new FileInputStream("src/iostream/inputStream.txt");	
			int readByteNo;
			byte [] readBytes = new byte[3];
			// byte[] : 문자를 배열로 받아와 문자 하나씩 읽어낼 것을 3개씩 읽어낸다.
			
			// 1.while문 밖에서 선언 및 초기화
			String data = "";
			while(true) {
				// While((readByteNo = is.read(readBytes)) != -1)과 아래 두 줄은 동일한 의미이다.
				readByteNo = is.read(readBytes);
				if(readByteNo == -1) break;  // 2.읽을 문자(readByteNo)없을 때까지 읽어!
				data += new String(readBytes, 0, readByteNo); // 3.읽은 것 누적(data +=)!
			}
			System.out.print(data);	// 4.출력해서 끝!
			
			
			// (29행) readByteNo = is.read(readBytes);
		// readBytes특징 : 읽은 개수를 return한다. ['ABC'] = 3, ['DE '] = 3(X)-> 2
		// 읽은 것(문자들)은 'readBytes'에 저장, 읽은 문자들의 개수는 'readByteNo'에 저장한다.
			
			// (31행) String data = new String(readBytes, 0, readByteNo);
		// 내가 지정한 시작위치~끝위치 지정한 값(개수)만큼만 string으로 바꿔준다.
		// 시작위치~배열의 길이만큼 입력. 배열의 길이는 readByteNo가 이미 갖고있다.
		// ReadBytes에 있는 문자들(ABC)을 첫번째(0)부터 readByteNo(3개)를 모두 string으로 바꾸겠다.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

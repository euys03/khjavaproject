package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// 바이트 기반 스트림 (Day11)
		InputStream is = null;
		
		// 문자 기반 스트림
		Reader reader = null;
		// 2. 두번째 문제
		// try안에서 만든 reader라는 변수이기 때문에 reader는 try안에서만 쓰고 사라진다.
		// reader라는 변수가 try구문 안, 밖 모두 있어야 한다.
		// InputStream is = null;이라고 'null'을 사용했던 이유이다.
		
		// 문자 기반 스트림 (문자를 읽는데 사용)
		try {
		// Reader =추상클래스, 추상클래스는 객체상속 불가능하므로 업캐스팅 개념을 이용해 FileReader객체를 생성
			reader = new FileReader("src/iostream/filereader.txt");	// 업캐스팅
			// '읽을 파일'이므로 'iostream'폴더에 'filereader.txt'를 만들어준다
			
			/** 업캐스팅 : 서브클래스 객체를 슈퍼 클래스 타입으로 변환하는 것.
			 * - 서브클래스의 객체는 슈퍼클래스의 멤버를 모두 가지고 있음
			 * - 서브클래스의 객체는 슈퍼클래스의 객체로 취급할 수 있음
			 * - '사람은 생물이다'의 논리와 같음
			**/
			
			// 여러번 읽는 방법 (입력되어 있는 문자 모두 읽기)
			while(true) {
				int readData = reader.read();	// read()메소드 사용
				// 데이터가 없을 때까지 읽기
				if(readData == -1) break;	// 읽을 데이터가 없는 경우(: -1로 표현)
				System.out.print((char)readData);
			}
//			reader.close();
//			// 1.첫번째 문제 - close()메소드
//			// 프로그램과 파일을 연결하는 통로(FileReader)를 다 사용했다면 꼭 닫아줘야한다.
//			// 하지만 exception이 발생해버리면 close가 동작이 되지 않기 때문에
//			// 통로는 계속 열려있고 자원이 낭비되므로 반드시 close해줘야한다.
//			// 무조건 close해야하므로 코드가 끝난 후 무조건 실행하게 하는 방법인 finally 코드를 사용한다
//			// (try-catch 구문에서 사용)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행되어야하는 코드 작성
			try {
				reader.close();
				// 3. 세번째 문제 - 1,2문제를 다 해결해줬음에도 빨간줄
				// 해결방법 : 예외처리를 반드시 해줘야한다. (예외처리 전에는 빨간줄)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

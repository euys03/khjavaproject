package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	// 1. 'Hello Server' 보내고, 2. 'Hello Client'받기
	
	public static void main(String[] args) {
		Socket socket = null;
		// 데이터 보낼 때 사용해야하는 스트림은?
		// 1. IO스트림
		// 2. 입력스트림
		// 3. 출력스트림	[v]
		OutputStream os = null;		// 순서1.바이트 기반 출력스트림
		InputStream is = null;		// 순서2.바이트 기반 입력스트림
		
		
		// error : Unhandled exception type IOException -> try-catch문 생성
		try {			
			System.out.println("연결요청");
			// ip주소와 포트번호를 사용함
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결성공!!");
			
			
		////////////////// 데이터 보내기 //////////////////	
			byte [] buf = null;	// 바이트배열 선언 -> write() 메소드를 배열로 받았기 때문
			String message = "";
			os = socket.getOutputStream();	// 소켓에서 가져온 스트림을 'os'에 저장
			message = "Hello Server";
			buf = message.getBytes();	// 보낼 메시지를 배열로 만든다
			os.write(buf);	// 출력스트림 -> wirte() 메소드
			os.flush();
			System.out.println("데이터 전송 완료");
		////////////////////////////////////////////////////
			
			
		////////////////// 데이터 받기 /////////////////////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);		
		////////////////////////////////////////////////////
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

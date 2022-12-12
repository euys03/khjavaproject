package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	// 1. 'Hello Client' 보내고, 2. 'Hello Server'받기
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// 데이터 받을 때 사용해야하는 스트림은?
		// 1. IO스트림
		// 2. 입력스트림	[v]
		// 3. 출력스트림	
		InputStream is = null;	// 순서1.바이트 기반 입력스트림
		OutputStream os = null;	// 순서2.바이트 기반 출력스트림	
		
		// error : Unhandled exception type IOException -> try-catch구문 생성
		try {
			
			System.out.println("연결을 기다림...");
			//'serverSocket' import + 'ServerSocket(int port)'를 import + 포트번호 지정
			serverSocket = new ServerSocket(4885);
			// accept() 메소드 사용, 소켓을 리턴함(요청이 올 때 까지 기다리는 메소드)
			Socket socket = serverSocket.accept();
			// 아래는 출력되지 않는 것을 보니 accept()에서 계속 기다리고 있는 것을 알 수 있다.
			System.out.println("연결 수락됨!");	
			
			
		////////////////////////// 데이터 받기 /////////////////////////////
			byte [] bytes = new byte[100];	// 크기가 100인 배열 선언 -> read() 메소드를 배열로 받았기 때문
			is = socket.getInputStream();	// 소켓에 있는 InputStream()사용.
			int readByteNo = is.read(bytes);  // 스트림에 있는 데이터를 bytes에 넣고 리턴은 '읽은 개수'를 리턴
			String message = new String(bytes, 0, readByteNo);	// 0부터 readByteNo개.
			System.out.println("데이터 받기 성공 : " + message);
		/////////////////////////////////////////////////////////////////////
			
			
		///////////////////////// 데이터 보내기 /////////////////////////
			os = socket.getOutputStream();
			message = "Hello Client";	// 보내려고 하는 메시지
			bytes = message.getBytes();	// write 메소드 전달값 : 바이트 배열로 변환
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
		/////////////////////////////////////////////////////////////////
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

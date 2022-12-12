package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		// 바이트 배열 변환없이 받을 메시지를 넣기 위한 방법 (DataInputStream 사용)
		// 보조스트림
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			//'serverSocket' import + 'ServerSocket(int port)'를 import
			// serverSocket객체 생성 + 포트번호 지정
			serverSocket = new ServerSocket(8507);
			System.out.println("연결 기다림 ...");
			// accept()메소드를 사용하여 serverSocket을 불러줘야만 진짜 기다리는 것.
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락됨 ~~");
			
			// 데이터 받기 (Server <- Client)
			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			// is를 dis에 저장해줌으로써 전달된 메시지를 아래와 같이 바이트 배열로
			// 하나하나 읽어들일 필요가 없다. (영어는 물론 한글도 가능한 편리한 방법)
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			
//			int readByteNo = is.read(bytes);
//			String message = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			// 데이터 받기 완료
			
			
			// 데이터 보내기 (Server -> Client)
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client");
			System.out.println("데이터 전송 완료!");
			// 데이터 보내기 완료
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

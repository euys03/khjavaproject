package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer2 {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		
		ServerSocket serverSocket = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
	// 실제 채팅 프로그램이므로 입력(Input)과 출력(Output)이 모두 존재
		Scanner sc = new Scanner(System.in);
		
			
			try {
				System.out.println("채팅서버를 구동 중입니다...");
				// error : Unhandled exception type InterruptedException -> Add catch구문 생성
				Thread.sleep(2000);		// 2초 지연
				serverSocket = new ServerSocket(port);
				System.out.println("채팅서버를 구동하였습니다!");
				Thread.sleep(2000); 	// 2초 지연
				System.out.println("클라이언트의 접속을 기다리고 있습니다.");
				Socket socket = serverSocket.accept();	// accept() : 기다림
				System.out.println("클라이언트가 접속하였습니다.");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				// 보조스트림
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("채팅이 시작되었습니다.");
				
				while(true) {
					// 메시지 보내기 (보조스트림 사용하지 않은 방법)
					System.out.print("서버(나) : ");
					String sendMsg = sc.nextLine();
					// (보조스트림 사용)
					dos.writeUTF(sendMsg);
//					byte [] bytes = sendMsg.getBytes();
//					os.write(bytes);
					
					// 메시지 받기 (보조스트림 사용하지 않은 방법)
//					bytes = new byte[100];
//					int readNo = is.read(bytes);
//					String recvMsg = new String(bytes, 0, readNo);
					// (보조스트림 사용)
					String recvMsg = dis.readUTF();
					System.out.println("클라이언트(상대) : " + recvMsg);
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

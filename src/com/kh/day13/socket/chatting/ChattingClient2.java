package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient2 {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
	// 실제 채팅 프로그램이므로 입력(Input)과 출력(Output)이 모두 존재
		Scanner sc = new Scanner(System.in);
		
			try {
				System.out.println("서버에 연결중입니다.");
				socket = new Socket(address, port);
				System.out.println("채팅서버에 접속하였습니다.");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("서버와의 채팅을 시작합니다.");
				
				while(true) {
					// 메시지 받기 (보조스트림 사용하지 않은 방법)
//					byte [] buf = new byte[100];
//					int readNo = is.read(buf);
//					String recvMsg = new String(buf, 0, readNo);
					// (보조스트림 사용)
					String recvMsg = dis.readUTF();
					System.out.println("서버(상대) : " + recvMsg);
					
					// 메시지 보내기 (보조스트림 사용하지 않은 방법)
					System.out.print("클라이언트(나) : ");
					String sendMsg = sc.nextLine();
					// (보조스트림 사용)
					dos.writeUTF(sendMsg);
//					buf = sendMsg.getBytes();
//					os.write(buf);
				}
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

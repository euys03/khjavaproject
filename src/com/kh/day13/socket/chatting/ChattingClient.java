package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		// 바이트 배열 변환없이 보낼 메시지를 넣기 위한 방법 (DataOutputStream 사용)
		// 보조스트림
		DataOutputStream dos = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 8507);
			System.out.println("연결성공!");
			
			// 데이터 보내기 (Client -> Server)
			byte [] bytes = null;
			os = socket.getOutputStream();
			// os를 dos에 저장해줌으로써 메시지를 아래와 같이 바이트 배열에 넣을 필요가 없다.
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Server");
			
//			bytes = "Hello Server".getBytes();
//			os.write(bytes);
			System.out.println("데이터 전송 완료");
			// 데이터 보내기 완료
			
			
			// 데이터 받기 (Client <- Server)
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("데이터 받기 성공 : " + message);
			// 데이터 받기 완료
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

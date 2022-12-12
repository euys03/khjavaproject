package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("게임 준비 완료");
			
			while(true) {
				
				// 값 보내기
				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				
				// 결과값 받기
				String resultMsg = dis.readUTF();
				System.out.println(resultMsg);
				if(resultMsg.startsWith("3")) {	// 3스트라이크면 종료
					System.out.println("축하합니다. 아웃입니다!");
					break;
				}
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				os.close();
				is.close();
				socket.close();
				sc.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}

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
		// ä�ü����� ���� ���Դϴ�...
		// ä�ü����� �����Ͽ����ϴ�..
		// Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.
		// Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.
		// ����(��) : ����
		// Ŭ���̾�Ʈ(���) : �׳�
		
		ServerSocket serverSocket = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
	// ���� ä�� ���α׷��̹Ƿ� �Է�(Input)�� ���(Output)�� ��� ����
		Scanner sc = new Scanner(System.in);
		
			
			try {
				System.out.println("ä�ü����� ���� ���Դϴ�...");
				// error : Unhandled exception type InterruptedException -> Add catch���� ����
				Thread.sleep(2000);		// 2�� ����
				serverSocket = new ServerSocket(port);
				System.out.println("ä�ü����� �����Ͽ����ϴ�!");
				Thread.sleep(2000); 	// 2�� ����
				System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
				Socket socket = serverSocket.accept();	// accept() : ��ٸ�
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				// ������Ʈ��
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("ä���� ���۵Ǿ����ϴ�.");
				
				while(true) {
					// �޽��� ������ (������Ʈ�� ������� ���� ���)
					System.out.print("����(��) : ");
					String sendMsg = sc.nextLine();
					// (������Ʈ�� ���)
					dos.writeUTF(sendMsg);
//					byte [] bytes = sendMsg.getBytes();
//					os.write(bytes);
					
					// �޽��� �ޱ� (������Ʈ�� ������� ���� ���)
//					bytes = new byte[100];
//					int readNo = is.read(bytes);
//					String recvMsg = new String(bytes, 0, readNo);
					// (������Ʈ�� ���)
					String recvMsg = dis.readUTF();
					System.out.println("Ŭ���̾�Ʈ(���) : " + recvMsg);
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

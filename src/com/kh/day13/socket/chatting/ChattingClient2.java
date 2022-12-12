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
		// ������ �������Դϴ�.
		// ä�ü����� �����Ͽ����ϴ�.
		// �������� ä���� �����մϴ�.
		// ����(���) : ����
		// Ŭ���̾�Ʈ(��) : �׳�
		
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
	// ���� ä�� ���α׷��̹Ƿ� �Է�(Input)�� ���(Output)�� ��� ����
		Scanner sc = new Scanner(System.in);
		
			try {
				System.out.println("������ �������Դϴ�.");
				socket = new Socket(address, port);
				System.out.println("ä�ü����� �����Ͽ����ϴ�.");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("�������� ä���� �����մϴ�.");
				
				while(true) {
					// �޽��� �ޱ� (������Ʈ�� ������� ���� ���)
//					byte [] buf = new byte[100];
//					int readNo = is.read(buf);
//					String recvMsg = new String(buf, 0, readNo);
					// (������Ʈ�� ���)
					String recvMsg = dis.readUTF();
					System.out.println("����(���) : " + recvMsg);
					
					// �޽��� ������ (������Ʈ�� ������� ���� ���)
					System.out.print("Ŭ���̾�Ʈ(��) : ");
					String sendMsg = sc.nextLine();
					// (������Ʈ�� ���)
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

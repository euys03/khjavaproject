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
		// ����Ʈ �迭 ��ȯ���� ���� �޽����� �ֱ� ���� ��� (DataInputStream ���)
		// ������Ʈ��
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			//'serverSocket' import + 'ServerSocket(int port)'�� import
			// serverSocket��ü ���� + ��Ʈ��ȣ ����
			serverSocket = new ServerSocket(8507);
			System.out.println("���� ��ٸ� ...");
			// accept()�޼ҵ带 ����Ͽ� serverSocket�� �ҷ���߸� ��¥ ��ٸ��� ��.
			Socket socket = serverSocket.accept();
			System.out.println("���� ������ ~~");
			
			// ������ �ޱ� (Server <- Client)
			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			// is�� dis�� �����������ν� ���޵� �޽����� �Ʒ��� ���� ����Ʈ �迭��
			// �ϳ��ϳ� �о���� �ʿ䰡 ����. (����� ���� �ѱ۵� ������ ���� ���)
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			
//			int readByteNo = is.read(bytes);
//			String message = new String(bytes, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			// ������ �ޱ� �Ϸ�
			
			
			// ������ ������ (Server -> Client)
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Client");
			System.out.println("������ ���� �Ϸ�!");
			// ������ ������ �Ϸ�
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

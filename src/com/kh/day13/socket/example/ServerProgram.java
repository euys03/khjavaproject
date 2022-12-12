package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	// 1. 'Hello Client' ������, 2. 'Hello Server'�ޱ�
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// ������ ���� �� ����ؾ��ϴ� ��Ʈ����?
		// 1. IO��Ʈ��
		// 2. �Է½�Ʈ��	[v]
		// 3. ��½�Ʈ��	
		InputStream is = null;	// ����1.����Ʈ ��� �Է½�Ʈ��
		OutputStream os = null;	// ����2.����Ʈ ��� ��½�Ʈ��	
		
		// error : Unhandled exception type IOException -> try-catch���� ����
		try {
			
			System.out.println("������ ��ٸ�...");
			//'serverSocket' import + 'ServerSocket(int port)'�� import + ��Ʈ��ȣ ����
			serverSocket = new ServerSocket(4885);
			// accept() �޼ҵ� ���, ������ ������(��û�� �� �� ���� ��ٸ��� �޼ҵ�)
			Socket socket = serverSocket.accept();
			// �Ʒ��� ��µ��� �ʴ� ���� ���� accept()���� ��� ��ٸ��� �ִ� ���� �� �� �ִ�.
			System.out.println("���� ������!");	
			
			
		////////////////////////// ������ �ޱ� /////////////////////////////
			byte [] bytes = new byte[100];	// ũ�Ⱑ 100�� �迭 ���� -> read() �޼ҵ带 �迭�� �޾ұ� ����
			is = socket.getInputStream();	// ���Ͽ� �ִ� InputStream()���.
			int readByteNo = is.read(bytes);  // ��Ʈ���� �ִ� �����͸� bytes�� �ְ� ������ '���� ����'�� ����
			String message = new String(bytes, 0, readByteNo);	// 0���� readByteNo��.
			System.out.println("������ �ޱ� ���� : " + message);
		/////////////////////////////////////////////////////////////////////
			
			
		///////////////////////// ������ ������ /////////////////////////
			os = socket.getOutputStream();
			message = "Hello Client";	// �������� �ϴ� �޽���
			bytes = message.getBytes();	// write �޼ҵ� ���ް� : ����Ʈ �迭�� ��ȯ
			os.write(bytes);
			os.flush();
			System.out.println("������ ������ ����");
		/////////////////////////////////////////////////////////////////
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	// 1. 'Hello Server' ������, 2. 'Hello Client'�ޱ�
	
	public static void main(String[] args) {
		Socket socket = null;
		// ������ ���� �� ����ؾ��ϴ� ��Ʈ����?
		// 1. IO��Ʈ��
		// 2. �Է½�Ʈ��
		// 3. ��½�Ʈ��	[v]
		OutputStream os = null;		// ����1.����Ʈ ��� ��½�Ʈ��
		InputStream is = null;		// ����2.����Ʈ ��� �Է½�Ʈ��
		
		
		// error : Unhandled exception type IOException -> try-catch�� ����
		try {			
			System.out.println("�����û");
			// ip�ּҿ� ��Ʈ��ȣ�� �����
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("���Ἲ��!!");
			
			
		////////////////// ������ ������ //////////////////	
			byte [] buf = null;	// ����Ʈ�迭 ���� -> write() �޼ҵ带 �迭�� �޾ұ� ����
			String message = "";
			os = socket.getOutputStream();	// ���Ͽ��� ������ ��Ʈ���� 'os'�� ����
			message = "Hello Server";
			buf = message.getBytes();	// ���� �޽����� �迭�� �����
			os.write(buf);	// ��½�Ʈ�� -> wirte() �޼ҵ�
			os.flush();
			System.out.println("������ ���� �Ϸ�");
		////////////////////////////////////////////////////
			
			
		////////////////// ������ �ޱ� /////////////////////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);		
		////////////////////////////////////////////////////
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

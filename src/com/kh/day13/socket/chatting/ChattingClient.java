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
		// ����Ʈ �迭 ��ȯ���� ���� �޽����� �ֱ� ���� ��� (DataOutputStream ���)
		// ������Ʈ��
		DataOutputStream dos = null;
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 8507);
			System.out.println("���Ἲ��!");
			
			// ������ ������ (Client -> Server)
			byte [] bytes = null;
			os = socket.getOutputStream();
			// os�� dos�� �����������ν� �޽����� �Ʒ��� ���� ����Ʈ �迭�� ���� �ʿ䰡 ����.
			dos = new DataOutputStream(os);
			dos.writeUTF("Hello Server");
			
//			bytes = "Hello Server".getBytes();
//			os.write(bytes);
			System.out.println("������ ���� �Ϸ�");
			// ������ ������ �Ϸ�
			
			
			// ������ �ޱ� (Client <- Server)
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println("������ �ޱ� ���� : " + message);
			// ������ �ޱ� �Ϸ�
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

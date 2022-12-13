package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 6565;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("���� �������Դϴ�.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ����ֽ��ϴ�..");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			
			while(true) {
				// ���� �޽��� : 12 + 1			
				String msg = dis.readUTF();
				
				// bye �Է½� ����(server)
				if(msg.equalsIgnoreCase("bye")) {	// ���ڿ��� ==���� �� �Ұ��� (equals ���)
									// ��ҹ��� ���о��� ���� �� �ִ� �޼ҵ� -> equalsIgnoreCase()
					System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("���� �޽��� : " + msg);
				
				// ������ ������ 
				/** -> split() �޼ҵ� ������� ���� �� �Է¹���
				 * split() �޼ҵ�� �� ���ڿ��� �־����� ��� �� �迭�� �ƴ϶�
				 * �� ���ڿ��� ������ �迭�� ��ȯ�Ѵ�.
				 * ex) split() = ������ �� ���̵� ������� ������ 1���� ���� ���
				 * 	split(" ") = ���� �ϳ��ϳ��� ������ �������� ���� ������ŭ �״�� ���
				 * - split()�� ���� �Ӹ��� �ƴ϶� "\t"(��), "\n"(����)�� ó�����ش�.
				**/
				String [] msgArrs = msg.split(" ");	//���� �޽���(msg)�� �������� ������(split()) �迭�� ����
				if(msgArrs.length != 3) {	// ���� �迭�� ���̰� 3�� �ƴϸ�(����, ������, ����) ��� ���
					msg = "end";		// "end"�ڸ��� "�߸��Է��Ͽ����ϴ�,"�� ���� ��¹��� �Է��ϱ⿡ �ʹ�
					dos.writeUTF(msg);	// ��� ������ "end"��� ���ڸ� ���� Ŭ���̾�Ʈ�� �����Ͽ� Ŭ���̾�Ʈ����
										// ��¹��� �������� �Ѵ�.
					continue;	// (���ѹݺ�)�ش� ���ǹ��� ó������ ����. -> continue;
					
					// break�� ��� continue ���� : while(true)���ѹݺ����� ���� �Է¹迭�� 3 �̻��� ��쿡��
					// 		"�߸��Է��Ͽ����ϴ�~" ��� �� �Է��� �ٽ� �޾ƾ� �ϴµ� break���� ���� ������
					// 		�̾ �Ʒ��ڵ尡 ����Ǳ� ������.
					
					//System.out.println("�߸��Է��ϼ̽��ϴ�. ���Ŀ� �°� �Է����ּ���.");
				}
				
				// error : Type mismatch: cannot convert from int to String (Int -> String���� �ٲ��)
				// �ذ��� : Integer.parseInt()�޼ҵ� ���
				int num1 = Integer.parseInt(msgArrs[0]);
				String operator = msgArrs[1];
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = "";
				switch(operator) {
					// error : Type mismatch: cannot convert from String to int (String -> int�� �ٲ��)
					// ���1) ���ڿ� ""�� �߰����ش�.
					// ���2) valueOf() �޼ҵ� ���.
					case "+" : result = num1 + num2 + ""; break;
					case "-" : result = String.valueOf(num1 - num2); break;
					case "*" : result = String.valueOf(num1 * num2); break;
					case "/" : result = num1 / num2 + ""; break;
					case "%" : result = num1 % num2 + ""; break;
					default : result = "�����ڸ� �߸� �Է��ϼ̽��ϴ�."; break;
				}
				dos.writeUTF(result);
				// ��� ������ ��
				
			}
			
		} catch (Exception e) {		// Exception �ϳ��� ��� ���ܸ� ó���� �� �ִ�.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

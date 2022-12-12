package com.kh.day13.socket.baseball;
// 1. �� : �ڸ��� �°� ���ڵ� ���� ���
// 2. ��Ʈ����ũ : �ڸ��� ���� ������ ���ڴ� ���� ���

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];	// 3���� ��ȣ�� ���� �迭�� �Ҵ�
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);	// 2�� ����
			Date date = new Date(); // �������� ���� �ð��� �� �� �ִ�.
			System.out.println(trans.format(date));	// SimpleDateFormat ���
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			
		// 1 ~ 9 �� ��ȣ 3���� �������� ���� ��(�迭�� �־�)�� ������ �غ��ؾ� ��
			for(int i = 0; i < numbers.length; i++) {
				// 1 ~ 9 ������ ������ ����
				numbers[i] = rand.nextInt(9)+1;
				// �ߺ������ؼ� �迭�� ����
				for(int e = 0; e < i; e++) {
					// ���� ���� ����(i)�� ��� ���� ����(e)�� ������(�ߺ�) �ٽ� �̴´�(i--)
					if(numbers[e] == numbers[i]) {
						i--;
						break;
					}
				}
				
			}
			System.out.println("���� ���� -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("���� �غ� �Ϸ�");
			
			
			while(true) {
				// �� �ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				// ���� ���� numbers�� ���� ������ ��
				// - ���ڰ� �°� ��ġ�� �´���(��)
				// - ���ڴ� �´µ� ��ġ�� Ʋ����(��Ʈ����ũ)
				// - �ƹ��͵� ���� �ʾҴ�����
				// ��Ʈ����ũ, ���� ������ش�.
				// hint) �ε��� -> ��ġ��
				// hint) �ߺ�for�� ���
				int strike = 0;
				int ball = 0;
				
				// 1. �迭�� �迭�� ��. numbers�� int �迭�̶� �Է¹��� ����
				// ���ڰ� ����Ǵ� �迭�� ����(split() ���) -> String �迭
				String [] readNums = readNum.split(" "); // ���⸦ �������� �迭�ϴ� �޼ҵ� -> split()
				
				// 2. ���ڿ��� ������ ��
				for(int i = 0; i < numbers.length; i++) {	// ���� ��µ� ���ڵ�(numbers)
					for(int e = 0; e < readNums.length; e++) {	// �Է¹��� ���ڵ�(readNums)
						// error : Incompatible operand types int and String (ȣȯ �Ұ����� �������̴�)
						//	-> parseInt() �޼ҵ�� String�� Int�� �������ش�.
						//if(numbers[i] == readNums[e]) {}
						if(numbers[i] == Integer.parseInt(readNums[e])) {	// 1) ���� ������ ��
							
							// ��Ʈ����ũ���� ������ ����
							if(i == e) {	// 2) ��ġ�� ������ ��
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				// Ŭ���̾�Ʈ�� ����� �����ֱ�!
				String result = strike + "��Ʈ����ũ " + ball + "��";
				System.out.println(result);
				dos.writeUTF(result);
				
				// ��Ʈ����ũ�� 3�̸� ���������ϱ�~
				if (strike == 3) {
					System.out.println("�ƿ�! ������ �����մϴ�.");
					break;
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		

	}

}

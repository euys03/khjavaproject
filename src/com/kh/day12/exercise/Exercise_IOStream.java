package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy() {
//		// [����1.] �̹��� ���� ����
//		/* C:\\img\\wow.png -> D:\\woooow.png */
//		
//		/** [�Է� & ��� ��Ʈ�� ����]
//		 * �̹����̹Ƿ� ����Ʈ ��� 
//		 * �Է½�Ʈ�� : ���α׷� ���� �̹����� ������ ��
//		 * ��½�Ʈ�� : ���α׷� ���� �̹����� ������ ��
//		**/
		
		// ����Ʈ ��� �Է½�Ʈ��
		InputStream is = null;
	
		// ��½�Ʈ��
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\wow.png");
			os = new FileOutputStream("D:\\woooow.png");
			byte [] readBytes = new byte[100];
			
			int readByteNo;	// ���� ���� �����ϴ� ���� ����
			// ���� ���� ����(readByteNo)
			while((readByteNo = is.read(readBytes)) != -1) {	// ���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public void memoFileMake() {
		// [����2.] ���������ϱ�
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		// ���� ���� -> ���� ����� �� ��Ʈ������ ��� ����?
		String fileName = sc.next();
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'" + "���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			sc.nextLine();	// ���͸� �������ִ� �ڵ�.
			
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String input = sc.nextLine();	// '������ ���ϸ� �Է� : '�� �Է��� �� ģ ���Ͱ�
				// �� �ڵ��� nextLine()���� ���� �ڵ尡 ����ǹ����Ƿ� nextLine()�� ����� ����
				// ���� �ڵ�� ���� sc.nextLine()�� ���� ���͸� ��������� �Ѵ�.
				
				//if(input == "exit") break;
				// equals�� ����Ѵ�. ==�� ��ü�� ��ü(�ּҸ� �����ִ� string), �ּҵ鳢���� ���� �񱳰� �ȵȴ�.
				// ������ ���ϱ� ���ؼ��� equals�� ����Ѵ�.
				// "exit"�� input�� �ڸ��ٲ㵵 ������ ����� �����߻��� �ּ�ȭ�ϱ� ���� �Ʒ��� ���� ����Ѵ�.
				if("exit".equals(input)) break;	//"exit\n" ��� trim()�޼ҵ�� ������ �����ص� ���������� ������.
				writer.write(input + "\n");	// �����Է� : write()�޼ҵ� ���
				i++;
				
			}
			System.out.println("���� ���� �Ϸ� (exit�� �����ϰ� ����)");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}

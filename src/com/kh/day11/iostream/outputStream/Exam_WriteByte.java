package com.kh.day11.iostream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			// byte[]�迭 �߰� �� ���� �Է�
			byte [] data = "Real I/O".getBytes();	// ���� �Է�
			os.write(data);	// ���� -> add catch Ŭ��.
			
			/** .flush() �޼ҵ� (���۸� ���� �뵵)
			 * ���ۿ� �޸𸮸� �Ҵ��ϴ� ����� '���۽�Ʈ��'�̶�� �Ѵ�.
			 * Ư¡) 1. ���۰� �� á�� ��쿡�� ���۸� ����.
			 * 		 2. read(���� �о����)���� flush()�޼ҵ尡 �������� �ʾƼ� �ʿ�X,
						write(���Ͽ� ���� �ۼ��ϱ�)���� flush()�� �ʼ��� ����� �Ѵ�.
			 * flush()�޼ҵ带 ����ϸ� ���۰� ���� �ʾƵ� ���۸� ��� �� �ִ�.
			 **/			
			os.flush(); // read�� ���� flush()�޼ҵ尡 �������� �ʾƼ� ����� �� ������
						// write�� ���� flush()�� �׻� �ʼ��� ����� �Ѵ�.
			
			System.out.println("����Ϸ�~!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
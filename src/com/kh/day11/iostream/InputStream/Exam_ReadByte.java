package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		//�߻�Ŭ���� Ÿ������ �ϳ� ����
		InputStream is = null;
		
		/** ��ĳ���� : ����Ŭ���� ��ü�� ���� Ŭ���� Ÿ������ ��ȯ�ϴ� ��.
		 * - ����Ŭ������ ��ü�� ����Ŭ������ ����� ��� ������ ����
		 * - ����Ŭ������ ��ü�� ����Ŭ������ ��ü�� ����� �� ����
		 * - '����� �����̴�'�� ���� ���� */
		
		try {	// ��ĳ���� (InputStream�� FileInputStream)
			is = new FileInputStream("src/iostream/inputStream.txt");	
			int readByteNo;
			byte [] readBytes = new byte[3];
			// byte[] : ���ڸ� �迭�� �޾ƿ� ���� �ϳ��� �о ���� 3���� �о��.
			
			// 1.while�� �ۿ��� ���� �� �ʱ�ȭ
			String data = "";
			while(true) {
				// While((readByteNo = is.read(readBytes)) != -1)�� �Ʒ� �� ���� ������ �ǹ��̴�.
				readByteNo = is.read(readBytes);
				if(readByteNo == -1) break;  // 2.���� ����(readByteNo)���� ������ �о�!
				data += new String(readBytes, 0, readByteNo); // 3.���� �� ����(data +=)!
			}
			System.out.print(data);	// 4.����ؼ� ��!
			
			
			// (29��) readByteNo = is.read(readBytes);
		// readBytesƯ¡ : ���� ������ return�Ѵ�. ['ABC'] = 3, ['DE '] = 3(X)-> 2
		// ���� ��(���ڵ�)�� 'readBytes'�� ����, ���� ���ڵ��� ������ 'readByteNo'�� �����Ѵ�.
			
			// (31��) String data = new String(readBytes, 0, readByteNo);
		// ���� ������ ������ġ~����ġ ������ ��(����)��ŭ�� string���� �ٲ��ش�.
		// ������ġ~�迭�� ���̸�ŭ �Է�. �迭�� ���̴� readByteNo�� �̹� �����ִ�.
		// ReadBytes�� �ִ� ���ڵ�(ABC)�� ù��°(0)���� readByteNo(3��)�� ��� string���� �ٲٰڴ�.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		// error1 : Cannot instantiate the type InputStream => new InputStream ����
		// �ذ��� : null�� �ٲ��ش�.
		InputStream is = null;
		
		// 1. 'FileInputStream(String name)'�� import : string�� �Է�
		// error2 : Unhandled exception type 'FileNotFoundException' -> Checked Exception
		// -> ��ü����(new ~������ȣ��)�Ϸ��� �ݵ�� try ~ catch ����� �ϴ� Exception.
		// FileInputStream �̶�� ��ü�� ������ ��.
		try {
			// �ش����� ������ �ҷ��� Consol�� ����ϱ�(���ϰ�� ��ҹ��� ����!)
			is = new FileInputStream("src/iostream/inputStream.txt");
			// error3 : Unhandled exception type IOException
			int readByte;
			
			while(true) {	
				readByte = is.read();
				System.out.print(readByte);
				// ���� ����(readByte) ������ �׸� ����.
				if(readByte == -1)	// ���� ���� ���� ���� '-1'�� ǥ��
				break;
			
				System.out.print((char)readByte);
			}
			
//			// .txt ���� ������ 'ABCD' ���� 4���̹Ƿ� ��� �б� ���� for�� ���
//			// ������ �����Ͱ� �ٲ𶧸��� ���ڸ� �ٲ�����ϹǷ� ����� �� ���� �ڵ�.
//			for(int i = 0; i < 4; i++) {
//				readByte = is.read();
//				// (char)�� ����ȯ���ش�. (�ƽ�Ű�ڵ� -> ����)
//				System.out.print((char)readByte);				
//			}
			
			//is.read();	// ���ۿ� �ִ� ������ �ϳ��ϳ� �о���� ��.
			//System.out.println("ABCD");	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/** Inputstream(Exam_Read- Byte���_day11) �� Reader(Exam_Read- ���ڱ��_day12)�� ������
		 * inputstream.txt�� �ѱ� ����� �۾��� ������ ���� �� �� �ִ�.
		 * '��'��� ����(�ѱ�)�� 2����Ʈ�� �Ǿ��ִµ� 1����Ʈ�� �о���̹Ƿ� ������ �ȴ�.
		 * (1����Ʈ�� �о���̱� ���� ex.JDBC�� ���� ����)
		 * �ݸ鿡
		 * filereader.txt�� �ѱ� ����� ����Ʈ ������ �д� ���� �ƴ� �� ���ھ� �б� ������ �۾��� �������ʴ´�.
		 * (�ڹ�/����Ŭ/JDBC)
		**/		
		
	}
}

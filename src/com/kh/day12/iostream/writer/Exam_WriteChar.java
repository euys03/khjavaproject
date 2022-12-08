package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			// write() �޼ҵ� ��� �� �����ۼ�
			char [] cbuf = "�ڹٰ� ���� �������".toCharArray();
			writer.write(cbuf);
			
			/** .flush() �޼ҵ� (���۸� ���� �뵵)
			 * ���ۿ� �޸𸮸� �Ҵ��ϴ� ����� '���۽�Ʈ��'�̶�� �Ѵ�.
			 * Ư¡) 1. ���۰� �� á�� ��쿡�� ���۸� ����.
			 * 		 2. read(���� �о����)���� flush()�޼ҵ尡 �������� �ʾƼ� �ʿ�X,
						write(���Ͽ� ���� �ۼ��ϱ�)���� flush()�� �ʼ��� ����� �Ѵ�.
			 * flush()�޼ҵ带 ����ϸ� ���۰� ���� �ʾƵ� ���۸� ��� �� �ִ�.
			 * > .close()�� .flush()�� ���ԵǾ��־� close()�� �ص� flush()�� �����ϰ� ���� 
			 * > ������ �Ʒ� �ڵ忡�� �ٽ� ��ü(BufferedOutputStream)�� ����ϴ� ��Ȳ�̶��
			 * 	 ��ü�� �ٽ� new�ؾ��ϴ� ��Ȳ�� ����Ƿ� �׷� ��� ������ ����(close ���)
			 * 	 ���۸� ����(flush ���) ����Ѵ�. : flash()�� ���� */		
			writer.flush();
			
			System.out.println("wirte(char[]) ���� �Ϸ�!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
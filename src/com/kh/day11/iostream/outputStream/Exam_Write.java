package com.kh.day11.iostream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		
		OutputStream os = null;	//�߻�Ŭ����(A) outputStream.
		
		try {	// inputStream�� �޸� �ڵ忡�� ������ ����� �ش� ����� �������� Ȯ���� �� �ִ�.
			os = new FileOutputStream("src/iostream/outputStream.txt");
			// 1. FileOutputStream -> import �� try-catch��
			// 2. os.write�޼ҵ带 ���� ���� �Է�
			// 3. ���ڿ��� ���ڸ� �ϳ��� �� �������� ��(os.wirte)
			byte [] data = "Hello I/O".getBytes();
			// getBytes�޼ҵ�� int��(���ڰ� ex. H->72)���� ������ �� �ֵ��� byte�迭�� ������� �� �ִ�.
			
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
				os.write(data[i]);
			}
			System.out.println();
			os.flush();
			/** .flush() �޼ҵ� (���۸� ���� �뵵)
			 * ���ۿ� �޸𸮸� �Ҵ��ϴ� ����� '���۽�Ʈ��'�̶�� �Ѵ�.
			 * Ư¡) 1. ���۰� �� á�� ��쿡�� ���۸� ����.
			 * 		 2. read(���� �о����)���� flush()�޼ҵ尡 �������� �ʾƼ� �ʿ�X,
						write(���Ͽ� ���� �ۼ��ϱ�)���� flush()�� �ʼ��� ����� �Ѵ�.
			 * flush()�޼ҵ带 ����ϸ� ���۰� ���� �ʾƵ� ���۸� ��� �� �ִ�.
			 **/					

			System.out.println("����Ϸ�!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

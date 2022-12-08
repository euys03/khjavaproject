package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	
/* system.out.println()�� ���� �ʰ� ���۸� �̿��� �Է°�(�޸����� ����)�� ����� �� �ְ� �Ǿ���.
 * > ���� �� �ֿܼ��� ���͸� ġ�� ���ۿ� �����ִ� ���ڸ� ����Ѵ�. */
	
	public static void main(String[] args) {
		// ���� ũ�⸦ 5�� �ϰ�, ǥ�� ��� ��Ʈ��(: System.out)�� ������
		// ���� ��� ��Ʈ���� �����϶�! (ǥ�� �Է½�Ʈ�� : System.in)
		// C:\\Temp\\text2.txt ������ ����� ���� �ؽ�Ʈ�� �о�
		// ���� ��� ��Ʈ���� ���� ����϶�!!
		
		// ���� �Է¿�
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			
			// �ܼ� ��¿�
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
			
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			bout.flush();	// ������ ���Ȯ�� (���͸� ġ�� ����)
							// -> ���� �� �ֿܼ��� ���͸� ġ�� ���ۿ� �����ִ� ���ڸ� ���
			bout.close();	// .close()�� flush()�� �����ϰ� �����ϹǷ� close()�� �ص� �ȴ�
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
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

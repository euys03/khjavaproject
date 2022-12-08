package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		// ����Ʈ ��� ��Ʈ�� (Day11)
		InputStream is = null;
		
		// ���� ��� ��Ʈ��
		Reader reader = null;
		// 2. �ι�° ����
		// try�ȿ��� ���� reader��� �����̱� ������ reader�� try�ȿ����� ���� �������.
		// reader��� ������ try���� ��, �� ��� �־�� �Ѵ�.
		// InputStream is = null;�̶�� 'null'�� ����ߴ� �����̴�.
		
		// ���� ��� ��Ʈ�� (���ڸ� �дµ� ���)
		try {
		// Reader =�߻�Ŭ����, �߻�Ŭ������ ��ü��� �Ұ����ϹǷ� ��ĳ���� ������ �̿��� FileReader��ü�� ����
			reader = new FileReader("src/iostream/filereader.txt");	// ��ĳ����
			// '���� ����'�̹Ƿ� 'iostream'������ 'filereader.txt'�� ������ش�
			
			/** ��ĳ���� : ����Ŭ���� ��ü�� ���� Ŭ���� Ÿ������ ��ȯ�ϴ� ��.
			 * - ����Ŭ������ ��ü�� ����Ŭ������ ����� ��� ������ ����
			 * - ����Ŭ������ ��ü�� ����Ŭ������ ��ü�� ����� �� ����
			 * - '����� �����̴�'�� ���� ����
			**/
			
			// ������ �д� ��� (�ԷµǾ� �ִ� ���� ��� �б�)
			while(true) {
				int readData = reader.read();	// read()�޼ҵ� ���
				// �����Ͱ� ���� ������ �б�
				if(readData == -1) break;	// ���� �����Ͱ� ���� ���(: -1�� ǥ��)
				System.out.print((char)readData);
			}
//			reader.close();
//			// 1.ù��° ���� - close()�޼ҵ�
//			// ���α׷��� ������ �����ϴ� ���(FileReader)�� �� ����ߴٸ� �� �ݾ�����Ѵ�.
//			// ������ exception�� �߻��ع����� close�� ������ ���� �ʱ� ������
//			// ��δ� ��� �����ְ� �ڿ��� ����ǹǷ� �ݵ�� close������Ѵ�.
//			// ������ close�ؾ��ϹǷ� �ڵ尡 ���� �� ������ �����ϰ� �ϴ� ����� finally �ڵ带 ����Ѵ�
//			// (try-catch �������� ���)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ݵ�� ����Ǿ���ϴ� �ڵ� �ۼ�
			try {
				reader.close();
				// 3. ����° ���� - 1,2������ �� �ذ����������� ������
				// �ذ��� : ����ó���� �ݵ�� ������Ѵ�. (����ó�� ������ ������)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

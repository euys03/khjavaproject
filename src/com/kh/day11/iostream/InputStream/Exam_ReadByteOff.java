package com.kh.day11.iostream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		// �߻�Ŭ����(InputStream)�� ��ĳ����(FileInputStream)
		/* 1. inputStream/fileInputStream import
		 * 2. fileInputstream ����ó����
		 * */
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo;	//����
			byte [] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 0, 3);
			// is.read(readBytes, , )���� -> �ذ��� : try-catch�� ����
			// (=ù��°(0)���� 3�� �д´�)
			// 0�� 3�� ���ڸ� �ٲٸ� ���ڵ��� ��ġ�� �����ȴ�.
			for(int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

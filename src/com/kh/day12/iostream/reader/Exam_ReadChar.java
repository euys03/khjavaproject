package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		
		// ���ڱ�� '�Է½�Ʈ��'
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;		// ���� ���� ����
			
			// read.char[] ver. -> cbuf = ����Ʈ�迭 �ϳ� �ʿ��ϴٴ� �ǹ�.
			char [] cbuf = new char[2];	// �迭 ũ�� ����
				// 2���� ������� ������ 'readCharNo'���� ��κ� '2'�� ���´�.
			String data = "";
			
			// �����Ͱ� ���� ������ �ݺ� (while��)
			while(true) {
				readCharNo = reader.read(cbuf);
				// ���� ������ readCharNo��, ���� ���ڴ� cbuf�� �� ����ȴ�.
				if(readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo);
				// �ε����� 0�� �ͺ��� �������� ������ ������ ������ string���� �ٲ� data�� �����Ѵ�.				
				// ���� �����͵� �����Ϸ��� += �� ����Ͽ� ����������Ѵ�.
			}
			// error1 : 'data' cannot be resolved to a variable
			// �ذ��� : String data�� while�� ��(try������ ��������)�� �������ش�.
			
			// error2 : Unreachable code (���ѹݺ��ȴٴ� �ڵ�)
			// �ذ��� : if - break�� �ۼ�
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			// �� ����� �ڵ�� �� �ݾ��ְ� try - catch��
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

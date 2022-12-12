package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		// ��� ����ϱ�
		File file = new File("D:\\Temp\\wow.png");	// 'File' import �ϱ� + 'new File' File(String Pathname) import�ϱ�
		String fileName = file.getName();
		String path		= file.getPath();
		String parent	= file.getParent();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ��� : " + path);
		System.out.println("�θ� ���� : " + parent);
		
		
		// ���� �� ���� ������ ����(createNewFile() �޼ҵ� ��� - ����ó��)
		try {
			// ���� ����
			File fileMake = new File("src/iostream/fileOne.txt");
			//fileMake.createNewFile();		// ������� �ʱ� ���� make�� �ּ�ó��.
			// ���� ����
			File folderMake = new File("src/file");
			//folderMake.mkdir();
			// ���� ���� �ȿ� ���� ����� (�Ź� ��ü��(fileMake1,2) ȣ���ؼ� �޼ҵ带 ȣ���ؾ߸� ������ �����ȴ�.)
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();	// (���� �ǹ̷� �ּ�ó�� �Ϸ������� �������� ��������)
		
			
			// ������ ���� -> exists()�޼ҵ� ���
			System.out.println("������ �����ϴ°�? : " + fileMake.exists());
			// ������ �ƴϸ� ������ �� �����Ƿ� �������� Ȯ�� -> isFile()�޼ҵ� ���
			System.out.println("fileOne.txt�� ������ �´°�? : " + fileMake.isFile());
			// �������� Ȯ�� -> isDirectory()�޼ҵ� ���
			System.out.println("file������ ������ �´°�? : " + folderMake.isDirectory());
			
			/** is������ �޼ҵ���� ��������� True or False �� ��ȯ�Ѵ�.
			 * ex) isFile(), isDirectory
			**/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

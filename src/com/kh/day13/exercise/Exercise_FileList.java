package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	// f1�̶�� ���ϰ�ü�� �Ѿ�ö� ���� ��ü�� '���긮��Ʈ'����ϱ�
	// ex) cmd�� dir�� �Է��Ͽ��� �� ����Ž����ó�� ���� ����Ʈ���� �ߴ� ��.
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "�� ���� ����Ʈ�Դϴ�.------");
		// ���긮��Ʈ ���(listFiles()�޼ҵ��� ��ȯ���� File�� ��ü�迭�̹Ƿ� File�� �迭�� ����)
		File [] subFiles = dir.listFiles();
		
		for(int i = 0; i < subFiles.length; i++) {
			// �ε���[i]�� �����ؼ� �ϳ��� ��ü�� fOne�� �־��ִ� ��
			File fOne = subFiles[i];
			// ������ �����ð�(lastModified)��������
			long time = fOne.lastModified();
				// ������ ���� printf. (print(fOne.getName()); �ص� �ȴ�
			System.out.printf("%25s", fOne.getName());
			System.out.print("\t���� ũ��  " + fOne.length());
			// ��ȯ���� : '%tb' = ��, '%td' = ��, '%ta' = ����, '%tT' = �ð�
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n",time, time, time, time);
		}
	}
	

	public static void main(String[] args) {
		// ������ ����Ʈ�� ����ϱ� ������(listDirectory) ���ϸ��� �ƴ� ����������� �Է��Ѵ�.
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

		// ���� ������ �޼ҵ�(listDirectory) ȣ��
		listDirectory(f1);
	}

}

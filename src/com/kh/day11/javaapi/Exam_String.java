package com.kh.day11.javaapi;

public class Exam_String {
// 6�� PDF p.45
	public static void main (String [] args) {
		String msg = "Hello Java";
		// ���� '������(new)'�� ���� ��ü ���� �� �ּҸ� ���۷��� �ȿ� ��� ���·� �������.
		msg = new String("Hello J");
		
// String�� �޼ҵ�� ���� �˾ƺ���
		// ����
		String data1 = new String(" C#");
		String data2 = new String(", C++ ");
		
		// ������ ������ ���ڿ��� ������� (contains()�޼ҵ� ���)
		System.out.println(data1 + "�� ���̴� " + data1.length());
		System.out.println(data2 + "�� ���̴� " + data2.length()); 
		System.out.println("#�� �ִ°�? : " + data1.contains("#"));
		
		// ���ڿ� ����(concat()�޼ҵ� ���)
		data1 = data1.concat(data2); // data1�� data1�� data2���ڰ� ����� ���� ����ȴ�
		System.out.println("����� ���ڿ� : " + data1); //  C#, C++ ���°� ��µ� ��.
		
		// ��������(trim()�޼ҵ� ���)
		data1 = data1.trim();	// trim()�� ���� �������� �� data1�� �ٽ� ����
		System.out.println("���� ���� Ȯ�� : " + data1);
		
		// C# -> JAVA (replace()�޼ҵ� ���)
		data1 = data1.replace("C#", "JAVA");
		System.out.println("���ڿ� ��ü : " + data1);
		
		// ���ڿ� �и� (split()�޼ҵ� ���) 
		// (data1 : string��ü / split : string�� �޼ҵ�)
		// �ѹ��� java, �ѹ��� c++ �� �� 2�� ��µ� ���̴�
		String [] words = data1.split(",");		// ,�� �������� �и�
		for(int i = 0; i < words.length; i++) {
			System.out.println("�и��� ���ڿ� : " + i + " : " + words[i]);
		}
		
		// ���ڿ� �ڸ���(substring()�޼ҵ� ���)
		data1 = data1.substring(4);	//[4]��° ����~������ ���
		System.out.println("���ڿ� �ڸ��� : " + data1);
		
		data1 = data1.substring(1, 4);	//[1]��° ���� ~ [3]��° ���ڱ����� ���
										// (����([1]��°), ������������([4]��°))
		System.out.println("������ �ڸ��� : " + data1);
		
		// ���� �� ���� �ڸ��� (char.At()�޼ҵ� ���)
		char word = data1.charAt(1);	// 0�̸� [0]��° �ڸ��� �����̹Ƿ� ������ ��µȴ�
		System.out.println("���� �ڸ��� : " + word);
		
	}
}

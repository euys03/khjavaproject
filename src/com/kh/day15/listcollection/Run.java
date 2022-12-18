package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String [] args) {
//		Run run = new Run();
//		run.intExample();
		
	///////////////////////////// ���뿹��(�������) //////////	
//		������, ȸ������, �ڵ���
//		ex. ���� ���� �л��� ������ ����Ʈ�� ����
		List<Student> studentList = new ArrayList<Student> ();
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());	// �л�������
		
		// �л����� ���(for-each������ ��°���)
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
	// => <Student>�� <Member>�� �ٲ�� -> ȸ������ ���α׷�.
	//				  <������> �� �ٲ�� -> ������ ���α׷�.
	//				  <Car> �� �ٲ�� -> �ڵ������� ���α׷� ��.
	//////////////////////////////////////////////////////////////	
		
		
		
		// �پ��� ��(��������)�� ��� �ϱ� ���� E (���׸�).
		List<Integer> list = null;
		
		list = new ArrayList<Integer>();	// ��ĳ����
									// -> ArrayList�� �������̽��� ��ӹ��� ���̹Ƿ� ��ĳ���� ����
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		System.out.println("1��° �� : " + list.get(0));
		
		// ����Ʈ�� �����Ӱ� �߰�/����
		list.add(2023);	// ����Ʈ �߰� -> size + 1��
		System.out.println("size : " + list.size());
		
//		list.clear();	// ����Ʈ ���� -> size - 1��
//		System.out.println("size : " + size);
		
		System.out.println("~~~~ ����ϰڽ��ϴ� ~~~~");
		for(int i = 0; i < list.size(); i++) {	// ��ü ����� ���� clear() �ּ�ó��
			System.out.println((i+1)+"��° �� : " + list.get(i));
		}
		
		
		// ����Ʈ �߰��� �� �߰� (3��°�� ���� ���� ���� �����͵��� �и���.)
		// -> 'add()�޼ҵ�' ���
		list.add(2, 2022);	// 2��° ��(23) �ڿ� �ְڴ�
		
		
		// �ε���[] ���� ����� �� �ִ� for-each��
		System.out.println("~~~~ For-each�� ����ϰڽ��ϴ� ~~~~");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}
		
		// �߰��� �ִ� �� ���� (5��° �ִ� �� ����)
		// -> 'set()�޼ҵ�' ���
		list.set(4,  7);	// 4��° ���� ���� 7�� �ٲٰڴ�
		System.out.println("~~~~ �ٽ��ѹ� ����ϰڽ��ϴ� (�� ����) ~~~~");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}		
		
	}
	
	
	// 3. RList
	// �������� �پ��� �ڷ����� ���(ObjectList)���� �ʾƼ� ���׸��� '�ϳ��� ��'�� �ִ´�.
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();	// ������̿� T(�ƹ� �ڷ���) ��� 
													// �ϳ��� �ڷ���(Integer)�� �ִ´�
													// Integer, String ��..
		list.add(11);
		list.add(23);
		list.add(5);
		
		// list.�� add�� �� ��������
		// -> ObjectList������ �پ��� ������ ������ ���Ƿ� '����ȯ'�� �����������
		//	Generic <'�ڷ���'>�� ����ϸ� �ϳ��� �ڷ����� ����ϱ� ������ '����ȯ�� �ʿ����'
		int num = list.get(0);
		num = list.get(1);
		
		System.out.println("num : " + num);
	}
	
	
	// 2. ObjectList
	public void objectExample() {
		ObjectList list = new ObjectList();	// ObjectList�� ��ü ����
		list.add(11);
		list.add("��");
		list.add(new Student());
		// ���� int(����)�� �迭�� �� �� �־��µ�(Intlist)
		// ObjectList�� �ٲٴ� int, string, ��ü �� ���� ���� ������Ÿ���� �ٷ� �� �ִ�.
		
		// ��������(get�޼ҵ� ���) 
		// -> �ݵ�� �ٿ�ĳ����(�پ��� ���� ���� �� ������ ���� ���� �ٿ�ĳ���� -> ����ȯ)
		// �ش� ��ü�� 'ObjectList'�̹Ƿ� ����(�ڷ���)�� ����Ŭ������ 'Object'�� ���ϵ�����
		// �ڽ� ��ü�� �������ִ� Ÿ���� �����ϰ����ϹǷ� '��������ȯ'(int, string ��)�� ���ش�.
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
	}
	
	
	// 1. IntList
	public void intExample() {
		// �������� �� �ߺ�����Ͽ� ����
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("ù��° : " + list.get(0));
		System.out.println("�ι�° : " + list.get(1));
		System.out.println("����° : " + list.get(2));
		System.out.println("ũ�� : " + list.size());
		
		// �����ϱ�
		list.clear();
		System.out.println("ũ�� : " + list.size());	// ���� �� size �ٽ� Ȯ��
	}

}

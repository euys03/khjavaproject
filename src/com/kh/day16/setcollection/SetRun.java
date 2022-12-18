package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** set
 * list�� �޸� �ߺ��� ������� ����
 * set Ư¡ : ������ �������� �ʰ� ���� �� �ߺ� ���� �ȵ� (ex. �ζ�) **/


public class SetRun {
	public static void main(String [] args) {
		// Collection�� List(�ߺ����), Set(ex.�ζ�), Map(ex.������ȣ) ������� ������ �Ѵ�.
		// �ӽ� �Ǵ� ���������� ������ ��
		// �ڷᱸ���� Ư���� ���� List, Set, Map�� �����Ͽ� �� �� ����.
		
	// 3. Set<��ü>
//		// StudentŬ������ �ҷ����� ��� -> new ���
		// ��ü�� int, string�� �޸� 'new'�Ͽ� ���� �ִ´�. ex. new Student("���켺", ...)
		Set<Student> set3 = new HashSet<Student>();
		set3.add(new Student("���켺", 55, 70));
		set3.add(new Student("������", 60, 80));
// (1)������ �߰� ���
//		set3.add(new Student("������", 35, 100));
		
// (2)������ �߰� ��� -> kdw�� ����
		Student kdw = new Student("������", 35, 100);		
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		
		// 1. 'kdw' �� ����ִ� ������ �˱� ���� ����ϴ� ���(kdw�� ������ �߰��ϰԵǸ� ���߿� kdw�� �ִ� ������ �ذԵȴ�)
//		System.out.println(kdw.getName() + ", " + kdw.getScore1() + ", " + kdw.getScore2());
		// ��� ��� : ������, 35, 100 -> ����ִ� �����Ͱ��� Ȯ���� �� �ִ�.
		
		// 2. �Ź� �Է��ϱ� �����Ƿ� Student�� information()�� ����� information�� �ҷ����� ���·� ���
		
		// 3. toString Ű���带 �������̵��Ͽ� ��ȯ�ϴ� �������� �Ѵ�.
		System.out.println(kdw.toString());
		
//		System.out.println(new Student("������", 35, 100).hashCode());
//		System.out.println(new Student("������", 35, 100).hashCode());
//		System.out.println(new Student("������", 35, 100).hashCode());
	}
	
	
	// 1. Set<���ڿ�>
	public void setExample1() {
		// Generic(���׸�)
		// -> <String>�̹Ƿ� set.�� "���ڿ�"�� �߰�(add)
		Set<String> set = new HashSet<String>();	// Set -> java.util ��Ű���� '�������̽�'�� import.
		set.add("one");
		set.add("tow");
		set.add("three");
		System.out.println("����� �������� �� : " + set.size());
		
		// ��� (iterator = �ݺ���/ ��ūó�� ���)
		Iterator<String> iterator = set.iterator();	// Iterator -> java.util ��Ű���� '�������̽�'�� import.
		// set�� �����Ͽ� �ϳ��� �������� ��. (=��ġ�� �������ش�)
		
		// �ε����� ������� ���(���� ������� ���� ������ ���, ������ ���x)
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 'one'�̶�� ���� �� �� �� �õ�(�ߺ�Ȯ��)
		set.add("one");		// �ߺ��� ������� ����.
		System.out.println("===== ===== =====");
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());	// ���: �ߺ��̹Ƿ� ���� �ʴ´�.(���x)
		}
		// '�ζ� ���α׷�'������ ���� ������ ���ڰ� �ִ��� ������(�ߺ�) Ȯ���Ͽ� ���ڸ� �̾ƾ�������
		// Set�� �ߺ��� ������� �����Ƿ� �ߺ� �������� set�� ���ڸ� �־� ����� �� �ִ�. 
		
	}
	
	
	// 2. Set<����>
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
		// �� �߰� ��� (���ϴ� ��(����) �Է�(add))
		set2.add(1);
		set2.add(23);
		
		
	}
	
}

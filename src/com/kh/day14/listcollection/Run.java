package com.kh.day14.listcollection;

public class Run {
	public static void main(String[] args) {

		ObjectList objList = new ObjectList();	// obj����ϸ�
		objList.add(11);	// 1. '����'����
		objList.add("��");	// 2. '���ڿ�'����
//		objList.add(23);	// resize�� ���߱� ������ ������ �ȵ� ��.
//		objList.add("��");
		objList.add(new Student());	// 3. '��ü'����
		Student std = new Student();	// 3.�� ������ �ڵ� �� ��
		objList.add(std);
		
		
		// returnŸ���� Object�ε�(ObjectList.java- public Object get~)
		// �޴� Ÿ���� int, string, studentŬ���� ���� ��Ȳ�� ���� �ذ�.
		
		// error : Type mismatch: cannot convert from Object to int
		// ����) �پ��� �ڷ����� ����� �� ������ ������ ����� ������
		//		 �ٿ�ĳ����(��������ȯ) ���־�� �Ѵ�.
		int num = (int)objList.get(0);
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);		
	}
	
	
	// IntList.java�� �����ڵ� -> �����Ϸ��� intExample() ���� �ڵ���� Run���� �Űܼ� ����
	public void intExample() {
		// �迭�� ����
//		int [] nums = new int[3];
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
		// java.lang.ArrayIndexOutOfBoundsException (�迭�� 3�� �����س��� 4���� �Է��Ͽ� ����)
		// -> ����Ʈ�� �̷��� ������ ����(�ε����� ����ġ�ʰ� ���ϴ� ��ŭ ���� ���� �� �ִ�)
		// Index 3 out of bounds for length 3
//		nums[3] = 4;	// -> �Ұ���
		
		// ����Ʈ�� ���� (�ε���[]�� ����ġ �ʰ� ���ϴ¸�ŭ ���� ���� �� �ִ�. - �迭 Ȯ������)
		IntList nums = new IntList();
		
		// IntList �迭�� �ε����� �����ϴ� ��. ��ü�� ����� �޼ҵ带 ���� ���� ���� �� �ְ� �� ���̴�
		// �ε����� ���� �ִ� ���� �ƴ϶� �޼ҵ�ȭ�Ͽ� �޼ҵ� ȣ��� ���� �ִ´�.		
		nums.add(1); 	// �޼ҵ�(add)�� ȣ���ؼ� �ְ���� '��'�� �ִ´�. �ε��� ��������x
		nums.add(2);	// add()�޼ҵ�� IntList.java�� ����
		nums.add(3);	
		nums.add(4);	// -> ���� (�̾ ��� �߰��� ����)
		// ex) nums.add("kh"); �� ���� ���ڿ��� �ְ� ���� ���?
		// -> StringList.java�� ���� Ŭ������ ����� ���� ����������Ѵ�.
		// int�� ���� ���� Int�迭�̾���ϰ�, String�� ���� ���� string�迭,
		// Student�� �������� student�迭�̾���ϴ� ��Ȳ�̴�..(Ŭ������ �Ź� �������ϴ�)
		/**
		 * ��� Ÿ��(int, string, ��������Ŭ����)�� �迭�� ���� �� �ִ� ���.
		 * => ��� Ŭ������ ����Ŭ������ object�迭�� ����� ��� Ÿ���� ��밡���ϴ�.
		 **/
		
		// ���� ������ �� : get() �޼ҵ� ���
		System.out.println("1��° �� : " + nums.get(0));
		System.out.println("2��° �� : " + nums.get(1));
		System.out.println("3��° �� : " + nums.get(2));
		System.out.println("4��° �� : " + nums.get(3));
		System.out.println("ũ�� : " + nums.size());
		
		// ����
		//nums[0] = nums[1] = nums[2] = 0;	// ������ �� ���� ���
		nums.clear();	// �迭(nums)�� ���� -> 0
		System.out.println("���� �� ũ�� : " + nums.size());
	}

}

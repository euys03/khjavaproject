package com.kh.day15.listcollection;

/** int, string, ���� Ŭ���� ���� ����Ʈ -> ObjectList
 * Point) ObjectList ���� ���� / ����� �� �����ؾ��� �� (day14 ����)**/

public class ObjectList {
	private Object [] objects;
	private int size;
	
	// object�� ����ϸ� �Ʒ��� �ڵ尡 ����������.
//	objects = new String();
//	objects = new Student();
//	objects = new Integer();
	// string�� object�� ��ӹ��� �ڽ�Ŭ����.
	// �θ�Ÿ���� ���۷��� ������ �ڽİ�ü�� �ٷ��. (��ĳ����)
	// ��ĳ���õǹǷ� ���� ����Ʈ�� 'Object'�� ������ �Ѵ�.	
	
	
	// ��ĳ����(������)�� �̿��ؼ� �Ʒ� �ڵ���� ��������� ��.
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	
	// ���ϰ��� ������(return) ���ϰ��� �ڷ����� �޼ҵ� ��ȯ��(void)�� ������.
	// �޼ҵ带 ���� �������� ��� -> get() �޼ҵ� ���
	public Object get (int index) {	// void -> int
		return objects[index];		// nums[0] -> 1, 2
	}
	
	// length �������� -> size() �޼ҵ� ���
	public int size() {
		return size;
	}
	
	// �����ϱ� -> clear() �޼ҵ� ��� (�ȿ� �ִ� �� ��� �ʱ�ȭ)
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}

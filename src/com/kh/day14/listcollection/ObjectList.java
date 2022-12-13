package com.kh.day14.listcollection;

// IntList, StringList, StudentList ��� �����Ϸ��� objectList(object�迭)�� �־�� �Ѵ�.
// IntList, StringList, StudentList ���� ObjectList �� �ʿ��� ������ ���� �����ϱ� ���� �����.
// => ��� Ŭ������ ����Ŭ������ object�迭�̴�.
// Run.java���� ����.


/** int, string, ���� Ŭ���� ����Ʈ -> ObjectList
 * Point) ObjectList ���� ���� / ����� �� �����ؾ��� �� **/

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
	
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}

package com.kh.day15.listcollection;


// �ƹ� �ڷ����̳� �� ���� �� �ִٴ� �� -> <T> (���׸�)
// �ƹ� �ڷ����̳� ��� �� �� �ִٴ� ������ 'T'�� ���. ������ (����)<T> ���.
public class RList<T> {

	private Object [] objects;
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {	// �ڷ����ڸ��� T (�ƹ��ų� �� �� �� �ִٴ� ��)
								// int -> T
		objects[size] = input;
		size++;
	}
	
	// ���ϰ��� ������(return) ���ϰ��� �ڷ����� �޼ҵ� ��ȯ��(void)�� ������.
	public T get (int index) {			// void -> int
		return (T)objects[index];		// nums[0] -> 1, 2
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}


}

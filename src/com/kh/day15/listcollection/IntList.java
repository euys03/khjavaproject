package com.kh.day15.listcollection;

/** �迭�� ���� ���� -> ����Ʈ 
 * ����Ʈ Ư¡ : �迭�� �޼ҵ带 ���� ������ �����ϰ�  �ߺ����� ���� �� ���� ����
 * 				- �ڷᱸ�� �� �ϳ�. (ex. ����� ��� ��)
 * Point) IntList ���� ���� / IntList ����� ��� **/

public class IntList {
	// �ʵ�
	private int [] nums;
	private int size;
	
	// �ʵ��� �ʱ�ȭ -> �������� ����
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int input) {
		nums[size] = input;		// �Է��� �� �迭�� ����
		size++;		// ������ ����
	}
	
	// ���ϰ��� ������(return) ���ϰ��� �ڷ����� �޼ҵ� ��ȯ��(void)�� ������.
	// �޼ҵ带 ���� �� �������� ��� -> get() �޼ҵ� ���
	public int get (int index) {	// void -> int
		return nums[index];			// nums[0] -> 1, 2 �� ���� int�迭�̹Ƿ�
	}
	
	// length �������� -> size() �޼ҵ� ���
	public int size() {	// size�� �ڷ����� int.
		return size;	// ��ȯ��(return) : void -> int
	}
	
	// �����ϱ� -> clear() �޼ҵ� ��� (�ȿ� �ִ� �� ��� �ʱ�ȭ)
	public void clear() {
		nums = new int[3];
		size = 0;
	}

}

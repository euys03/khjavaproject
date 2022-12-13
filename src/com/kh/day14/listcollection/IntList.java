package com.kh.day14.listcollection;

import java.util.Arrays;

/** �迭 -> ����Ʈ 
 * Point) IntList ���� ���� / IntList ����� ��� **/
public class IntList {
	// �ʵ�
	private int [] nums;
	private int size;	// ��� ����
	
	// �ʵ��� �ʱ�ȭ -> �������� ����
	public IntList() {	// ������ : Ŭ������� �̸��� ������ �޼ҵ�.
		nums = new int[3];	// �ʵ��� �ʱ�ȭ
		size = 0;	// ���ϴ� ��(�ε���) �ʱ�ȭ
	}
	
	private void resize() {
		// array_capacity : ���� �����ϸ� �� ���� �����ϸ鼭 ���� �� ���ο� �뷮�� ����.
		// ���� �迭�� ũ��-> capacity�� ����
		int array_capacity = nums.length;
		
		// 2. �뷮�� �� �� ���
		// size -> ������ �ε���������, array_capacity -> ������ �迭�� ũ��
		if(size == array_capacity) {
			// 2-1) �뷮�� 2��� ����
			int new_capacity = array_capacity * 2;
			// 2-2) ���Ӱ� �迭�� �������
			nums = Arrays.copyOf(nums, new_capacity); // �������� �����ϸ� 2��� ���� �� �־���.
			// copyOf��� static()�� �̿��� ���� �� 2�� �� �迭�� nums�� ����  (capacity ����)
		}
	}
	
	
	// add �޼ҵ�
	public void add(int input) {
		// int input = 3	// Run.java���� 3���� �Ѿ���� 3�� �Էµǰ� input�� ����ȴ�(�Ű����� input)
							// �Ѿ�� input���� ���� private�迭�� ������ nums�� �����Ѵ�.
		
		// 1. �� ���ִ� ���¶�� ũ�⸦ ���Ҵ��ؼ� �迭 ����
		if(size == nums.length) {
			resize();
		}
		// ������ ��ġ�� ��� �߰�
		nums[size] = input;
		size++;
	
	}
	
	// �޼ҵ带 ���� �������� ��� -> get() �޼ҵ� ���
	public int get(int index) {
		// error : Void methods cannot return a value
		// �ذ��� : public void -> public int�� ����(return ����̹Ƿ�)
		return nums[index];
	}
	
	// length �������� -> size() �޼ҵ� ���
	public int size() {
		// error : Void methods cannot return a value
		// �ذ��� : void -> int �� ����
		return size;
	}
	
	// �����ϱ� -> clear() �޼ҵ� ���(�ȿ� �ִ� �� ��� �ʱ�ȭ)
	public void clear() {
		nums = new int[3];
		size = 0;
	}
	
}

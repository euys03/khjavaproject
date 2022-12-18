package com.kh.day15.listcollection;


// 아무 자료형이나 다 넣을 수 있다는 뜻 -> <T> (제네릭)
// 아무 자료형이나 들어 갈 수 있다는 뜻으로 'T'를 사용. 선언은 (꺽쇠)<T> 사용.
public class RList<T> {

	private Object [] objects;
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {	// 자료형자리에 T (아무거나 다 들어갈 수 있다는 뜻)
								// int -> T
		objects[size] = input;
		size++;
	}
	
	// 리턴값이 있으면(return) 리턴값의 자료형을 메소드 반환형(void)에 적어줌.
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

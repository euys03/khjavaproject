package com.kh.day15.listcollection;

/** int, string, 만든 클래스 등의 리스트 -> ObjectList
 * Point) ObjectList 나온 이유 / 사용할 때 주의해야할 점 (day14 참고)**/

public class ObjectList {
	private Object [] objects;
	private int size;
	
	// object를 사용하면 아래의 코드가 가능해진다.
//	objects = new String();
//	objects = new Student();
//	objects = new Integer();
	// string은 object를 상속받은 자식클래스.
	// 부모타입의 레퍼런스 변수를 자식객체로 다룬다. (업캐스팅)
	// 업캐스팅되므로 실제 리스트는 'Object'로 만들어야 한다.	
	
	
	// 업캐스팅(다형성)을 이용해서 아래 코드들이 만들어지는 것.
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	
	// 리턴값이 있으면(return) 리턴값의 자료형을 메소드 반환형(void)에 적어줌.
	// 메소드를 통해 가져오는 방법 -> get() 메소드 사용
	public Object get (int index) {	// void -> int
		return objects[index];		// nums[0] -> 1, 2
	}
	
	// length 가져오기 -> size() 메소드 사용
	public int size() {
		return size;
	}
	
	// 삭제하기 -> clear() 메소드 사용 (안에 있는 것 모두 초기화)
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}

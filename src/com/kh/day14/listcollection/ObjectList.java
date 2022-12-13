package com.kh.day14.listcollection;

// IntList, StringList, StudentList 모두 실행하려면 objectList(object배열)가 있어야 한다.
// IntList, StringList, StudentList 등은 ObjectList 가 필요한 이유에 대해 설명하기 위해 만든것.
// => 모든 클래스의 조상클래스는 object배열이다.
// Run.java에서 실행.


/** int, string, 만든 클래스 리스트 -> ObjectList
 * Point) ObjectList 나온 이유 / 사용할 때 주의해야할 점 **/

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

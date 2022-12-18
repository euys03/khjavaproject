package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String [] args) {
//		Run run = new Run();
//		run.intExample();
		
	///////////////////////////// 응용예시(사용이유) //////////	
//		레시피, 회원정보, 자동차
//		ex. 여러 명의 학생의 정보를 리스트에 저장
		List<Student> studentList = new ArrayList<Student> ();
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());
		studentList.add(new Student());	// 학생정보들
		
		// 학생정보 출력(for-each문으로 출력가능)
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
	// => <Student>가 <Member>로 바뀌면 -> 회원관리 프로그램.
	//				  <레시피> 로 바뀌면 -> 레시피 프로그램.
	//				  <Car> 로 바뀌면 -> 자동차관리 프로그램 등.
	//////////////////////////////////////////////////////////////	
		
		
		
		// 다양한 값(데이터형)을 담게 하기 위한 E (제네릭).
		List<Integer> list = null;
		
		list = new ArrayList<Integer>();	// 업캐스팅
									// -> ArrayList는 인터페이스를 상속받은 것이므로 업캐스팅 가능
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		System.out.println("1번째 값 : " + list.get(0));
		
		// 리스트를 자유롭게 추가/삭제
		list.add(2023);	// 리스트 추가 -> size + 1됨
		System.out.println("size : " + list.size());
		
//		list.clear();	// 리스트 삭제 -> size - 1됨
//		System.out.println("size : " + size);
		
		System.out.println("~~~~ 출력하겠습니다 ~~~~");
		for(int i = 0; i < list.size(); i++) {	// 전체 출력을 위한 clear() 주석처리
			System.out.println((i+1)+"번째 값 : " + list.get(i));
		}
		
		
		// 리스트 중간에 값 추가 (3번째에 값이 들어가고 뒤의 데이터들이 밀린다.)
		// -> 'add()메소드' 사용
		list.add(2, 2022);	// 2번째 값(23) 뒤에 넣겠다
		
		
		// 인덱스[] 없이 사용할 수 있는 for-each문
		System.out.println("~~~~ For-each로 출력하겠습니다 ~~~~");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		
		// 중간에 있는 값 수정 (5번째 있는 값 수정)
		// -> 'set()메소드' 사용
		list.set(4,  7);	// 4번째 뒤의 값을 7로 바꾸겠다
		System.out.println("~~~~ 다시한번 출력하겠습니다 (값 변경) ~~~~");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}		
		
	}
	
	
	// 3. RList
	// 생각보다 다양한 자료형을 사용(ObjectList)하지 않아서 제네릭에 '하나의 형'을 넣는다.
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();	// 꺽쇠사이에 T(아무 자료형) 대신 
													// 하나의 자료형(Integer)을 넣는다
													// Integer, String 등..
		list.add(11);
		list.add(23);
		list.add(5);
		
		// list.에 add한 값 꺼내오기
		// -> ObjectList에서는 다양한 형태의 값들이 들어가므로 '형변환'을 해줘야했지만
		//	Generic <'자료형'>을 사용하면 하나의 자료형을 사용하기 때문에 '형변환이 필요없다'
		int num = list.get(0);
		num = list.get(1);
		
		System.out.println("num : " + num);
	}
	
	
	// 2. ObjectList
	public void objectExample() {
		ObjectList list = new ObjectList();	// ObjectList로 객체 생성
		list.add(11);
		list.add("월");
		list.add(new Student());
		// 원래 int(숫자)만 배열에 들어갈 수 있었는데(Intlist)
		// ObjectList로 바꾸니 int, string, 객체 등 여러 개의 데이터타입을 다룰 수 있다.
		
		// 가져오기(get메소드 사용) 
		// -> 반드시 다운캐스팅(다양한 값을 넣을 수 있지만 꺼낼 때는 다운캐스팅 -> 형변환)
		// 해당 객체는 'ObjectList'이므로 형태(자료형)가 조상클래스인 'Object'가 리턴되지만
		// 자식 객체가 가지고있는 타입을 리턴하고자하므로 '강제형변환'(int, string 등)을 해준다.
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
	}
	
	
	// 1. IntList
	public void intExample() {
		// 순서유지 및 중복허용하여 나열
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번째 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		
		// 삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());	// 삭제 후 size 다시 확인
	}

}

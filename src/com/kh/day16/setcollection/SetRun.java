package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** set
 * list와 달리 중복을 허용하지 않음
 * set 특징 : 순서를 유지하지 않고 저장 및 중복 저장 안됨 (ex. 로또) **/


public class SetRun {
	public static void main(String [] args) {
		// Collection의 List(중복허용), Set(ex.로또), Map(ex.지역번호) 저장소의 역할을 한다.
		// 임시 또는 영구적으로 저장을 함
		// 자료구조의 특성에 따라서 List, Set, Map을 선택하여 쓸 수 있음.
		
	// 3. Set<객체>
//		// Student클래스를 불러오는 방법 -> new 사용
		// 객체는 int, string과 달리 'new'하여 값을 넣는다. ex. new Student("정우성", ...)
		Set<Student> set3 = new HashSet<Student>();
		set3.add(new Student("정우성", 55, 70));
		set3.add(new Student("소지섭", 60, 80));
// (1)강동원 추가 방법
//		set3.add(new Student("강동원", 35, 100));
		
// (2)강동원 추가 방법 -> kdw로 선언
		Student kdw = new Student("강동원", 35, 100);		
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		
		// 1. 'kdw' 에 들어있는 내용을 알기 위해 출력하는 방법(kdw를 여러개 추가하게되면 나중엔 kdw에 있는 내용을 잊게된다)
//		System.out.println(kdw.getName() + ", " + kdw.getScore1() + ", " + kdw.getScore2());
		// 출력 결과 : 강동원, 35, 100 -> 들어있는 데이터값을 확인할 수 있다.
		
		// 2. 매번 입력하기 어려우므로 Student에 information()을 만들어 information을 불러오는 형태로 사용
		
		// 3. toString 키워드를 오버라이딩하여 반환하는 형식으로 한다.
		System.out.println(kdw.toString());
		
//		System.out.println(new Student("강동원", 35, 100).hashCode());
//		System.out.println(new Student("강동원", 35, 100).hashCode());
//		System.out.println(new Student("강동원", 35, 100).hashCode());
	}
	
	
	// 1. Set<문자열>
	public void setExample1() {
		// Generic(제네릭)
		// -> <String>이므로 set.에 "문자열"을 추가(add)
		Set<String> set = new HashSet<String>();	// Set -> java.util 패키지의 '인터페이스'를 import.
		set.add("one");
		set.add("tow");
		set.add("three");
		System.out.println("저장된 데이터의 수 : " + set.size());
		
		// 출력 (iterator = 반복자/ 토큰처럼 사용)
		Iterator<String> iterator = set.iterator();	// Iterator -> java.util 패키지의 '인터페이스'를 import.
		// set에 접근하여 하나씩 꺼내오는 것. (=위치를 지정해준다)
		
		// 인덱스에 상관없이 출력(순서 관계없이 값이 있으면 출력, 없으면 출력x)
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 'one'이라는 값을 한 번 더 시도(중복확인)
		set.add("one");		// 중복을 허용하지 않음.
		System.out.println("===== ===== =====");
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());	// 결과: 중복이므로 들어가지 않는다.(출력x)
		}
		// '로또 프로그램'에서는 전에 동일한 숫자가 있는지 없는지(중복) 확인하여 숫자를 뽑아야했지만
		// Set은 중복을 허용하지 않으므로 중복 걱정없이 set에 숫자를 넣어 출력할 수 있다. 
		
	}
	
	
	// 2. Set<숫자>
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
		// 값 추가 방법 (원하는 값(숫자) 입력(add))
		set2.add(1);
		set2.add(23);
		
		
	}
	
}

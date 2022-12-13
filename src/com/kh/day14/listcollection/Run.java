package com.kh.day14.listcollection;

public class Run {
	public static void main(String[] args) {

		ObjectList objList = new ObjectList();	// obj사용하면
		objList.add(11);	// 1. '숫자'가능
		objList.add("월");	// 2. '문자열'가능
//		objList.add(23);	// resize를 안했기 때문에 넣으면 안될 뿐.
//		objList.add("일");
		objList.add(new Student());	// 3. '객체'가능
		Student std = new Student();	// 3.과 동일한 코드 두 줄
		objList.add(std);
		
		
		// return타입은 Object인데(ObjectList.java- public Object get~)
		// 받는 타입은 int, string, student클래스 등인 상황에 대한 해결.
		
		// error : Type mismatch: cannot convert from Object to int
		// 설명) 다양한 자료형을 사용할 수 있으나 꺼내서 사용할 때에는
		//		 다운캐스팅(강제형변환) 해주어야 한다.
		int num = (int)objList.get(0);
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);		
	}
	
	
	// IntList.java의 실행코드 -> 실행하려면 intExample() 안의 코드들을 Run으로 옮겨서 실행
	public void intExample() {
		// 배열로 선언
//		int [] nums = new int[3];
//		nums[0] = 1;
//		nums[1] = 2;
//		nums[2] = 3;
		// java.lang.ArrayIndexOutOfBoundsException (배열을 3개 선언해놓고 4개를 입력하여 오류)
		// -> 리스트는 이러한 단점을 보완(인덱스에 개의치않고 원하는 만큼 값을 넣을 수 있다)
		// Index 3 out of bounds for length 3
//		nums[3] = 4;	// -> 불가능
		
		// 리스트로 선언 (인덱스[]에 개의치 않고 원하는만큼 값을 넣을 수 있다. - 배열 확장위해)
		IntList nums = new IntList();
		
		// IntList 배열에 인덱스를 접근하는 것. 객체를 만들어 메소드를 통해 값을 넣을 수 있게 할 것이다
		// 인덱스에 값을 넣는 것이 아니라 메소드화하여 메소드 호출로 값을 넣는다.		
		nums.add(1); 	// 메소드(add)만 호출해서 넣고싶은 '값'만 넣는다. 인덱스 존재하지x
		nums.add(2);	// add()메소드는 IntList.java에 선언
		nums.add(3);	
		nums.add(4);	// -> 가능 (이어서 계속 추가도 가능)
		// ex) nums.add("kh"); 와 같은 문자열을 넣고 싶은 경우?
		// -> StringList.java와 같이 클래스를 만들어 따로 선언해줘야한다.
		// int를 담을 때는 Int배열이어야하고, String을 담을 때는 string배열,
		// Student를 담으려면 student배열이어야하는 상황이다..(클래스를 매번 만들어야하는)
		/**
		 * 모든 타입(int, string, 내가만든클래스)의 배열을 담을 수 있는 방법.
		 * => 모든 클래스의 조상클래스인 object배열을 만들면 모든 타입이 사용가능하다.
		 **/
		
		// 값을 가져올 때 : get() 메소드 사용
		System.out.println("1번째 값 : " + nums.get(0));
		System.out.println("2번째 값 : " + nums.get(1));
		System.out.println("3번째 값 : " + nums.get(2));
		System.out.println("4번째 값 : " + nums.get(3));
		System.out.println("크기 : " + nums.size());
		
		// 삭제
		//nums[0] = nums[1] = nums[2] = 0;	// 원래의 값 삭제 방법
		nums.clear();	// 배열(nums)를 삭제 -> 0
		System.out.println("삭제 후 크기 : " + nums.size());
	}

}

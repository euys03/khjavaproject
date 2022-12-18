package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day16.setcollection.Student;

/** Map
 * 키는 중복 불가능하지만 (지역번호02,  02 (x))
 * 값은 중복 가능 (서울, 서울 (o) ) **/


public class MapRun {
	public static void main(String [] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();	// day16.setcollection 의 Student를 import.
		// Map<String, com.kh.day16.setcollection.Student> stdMap = new HashMap<String, Student>();
		// 오류 원인 : 이미 MapRun.java에 똑같은 이름의 student클래스를 import해놓은 상태이기 때문. 
		// com.kh ~~ 가 나온다면 맨 위 import로 올라가서 코드와 같이 import해주고 본래있던 import는 지워준 후,
		// Student를 입력해주면 된다.
		stdMap.put("1", new Student("손예진", 44, 66));
		stdMap.put("2", new Student("현빈", 55, 100));
		
		System.out.println("첫번째 학생 : " + stdMap.get("1").toString());
		// .get()하여 키값 "1"을 불러올 때, 해당 키의 값은 객체(new Student)로 구성되어 있어
		// 'stdMap.get("1")' 전체가 객체가 되고, 점(.)을 이용하여 toString()을 불러올 수 있다.
		
	}
	
	public void mapExample1() {
		// Map 인터페이스를 import
		Map<String, String> map = new HashMap<String, String>();	// <키, 값>
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");
		System.out.println("저장된 데이터의 수 : " + map.size());
		System.out.println("02 누르면 서울이 나옵니다 : " + map.get("02"));	// .get에는 "키값"을 넣는다
		System.out.println("031 누르면 경기도가 나옵니다 : " + map.get("031"));	// 키('031')를 불러오면 값('경기도')를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력 : ");
		String regionCode = sc.next();
		
		System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));
		
	}
	
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "핫팩");
		objMap.put("price", 1500);
		objMap.put("isGood", true);	// 값을 true, false로 저장하여 삼항연산자의 조건에 맞게 출력
		System.out.println("상품 이름은 " + objMap.get("name"));
		System.out.println("가격은 " + objMap.get("price") + "원");
		String result = (boolean)objMap.get("isGood") ? "추천" : "비추천";	// 삼항연산자
		System.out.println("추천여부는 " + result);
		
	}
}

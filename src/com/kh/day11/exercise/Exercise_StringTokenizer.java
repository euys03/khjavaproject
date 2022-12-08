package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// 홍길동/장화/홍련/콩쥐/팥쥐/ 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오
		String data = "홍길동/장화/홍련/콩쥐/팥쥐";
		
		// 1. 전체 출력
		/*
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {	// 토큰 호출
			System.out.println(st.nextToken());	//토큰 있으면 출력
		}
		*/
		
		// 2. 홍련만 출력
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {	// 토큰 호출
			if(st.nextToken().equals("홍련"))	// ('홍련'일때)
			System.out.println("홍련");	//토큰 있으면 출력(홍련 출력)
		// "홍련"뒤에 st.nextToken()을 쓰면 while문 반복하여 다음 '콩쥐'가 출력된다.
		}
		
		
		
	}
}

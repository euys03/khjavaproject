package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=kite &addr=seoul &age=21";
		//(원래) &로 배열을 만든다
		//String [] words = query.split("&");
		
		// "&" ver.
//		StringTokenizer st = new StringTokenizer(query, "&");
//		while(st.hasMoreTokens()) {	// 토큰 호출
//			System.out.println(st.nextToken());	//토큰 있으면 출력. 없으면 끝
//		}
		
		// "&=" ver.
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreTokens()) {	// 토큰 호출
			System.out.println(st.nextToken());	//토큰 있으면 출력. 없으면 끝
		}
		
		
		
	}

}

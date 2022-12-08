package com.kh.day11.javaapi;

public class Exam_StringBuffer {
	public static void main(String [] args) {
		// StringBuffer : 문자열을 연결해주는 클래스
		// 문자열 연결해주는 메소드 : concat()
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println("연결된 문자열 : " + sb.toString());
		
		StringBuffer stb = new StringBuffer()
				.append("KH")
				.append(" Java Class")
				.append(" F CLASS")
				.append(" Hot");
		System.out.println("연결된 문자열 : " + stb.toString());
	}
}

package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=kite &addr=seoul &age=21";
		//(����) &�� �迭�� �����
		//String [] words = query.split("&");
		
		// "&" ver.
//		StringTokenizer st = new StringTokenizer(query, "&");
//		while(st.hasMoreTokens()) {	// ��ū ȣ��
//			System.out.println(st.nextToken());	//��ū ������ ���. ������ ��
//		}
		
		// "&=" ver.
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreTokens()) {	// ��ū ȣ��
			System.out.println(st.nextToken());	//��ū ������ ���. ������ ��
		}
		
		
		
	}

}

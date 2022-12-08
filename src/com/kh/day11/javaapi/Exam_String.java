package com.kh.day11.javaapi;

public class Exam_String {
// 6장 PDF p.45
	public static void main (String [] args) {
		String msg = "Hello Java";
		// 원래 '생성자(new)'를 통해 객체 생성 후 주소를 레퍼런스 안에 담는 형태로 만들었다.
		msg = new String("Hello J");
		
// String의 메소드들 종류 알아보기
		// 선언
		String data1 = new String(" C#");
		String data2 = new String(", C++ ");
		
		// 공백을 포함한 문자열의 길이출력 (contains()메소드 사용)
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length()); 
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결(concat()메소드 사용)
		data1 = data1.concat(data2); // data1에 data1과 data2문자가 연결된 값이 저장된다
		System.out.println("연결된 문자열 : " + data1); //  C#, C++ 형태가 출력될 것.
		
		// 공백제거(trim()메소드 사용)
		data1 = data1.trim();	// trim()을 통해 공백제거 후 data1에 다시 저장
		System.out.println("공백 제거 확인 : " + data1);
		
		// C# -> JAVA (replace()메소드 사용)
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리 (split()메소드 사용) 
		// (data1 : string객체 / split : string의 메소드)
		// 한번은 java, 한번은 c++ 로 총 2번 출력될 것이다
		String [] words = data1.split(",");		// ,를 기준으로 분리
		for(int i = 0; i < words.length; i++) {
			System.out.println("분리된 문자열 : " + i + " : " + words[i]);
		}
		
		// 문자열 자르기(substring()메소드 사용)
		data1 = data1.substring(4);	//[4]번째 문자~끝까지 출력
		System.out.println("문자열 자르기 : " + data1);
		
		data1 = data1.substring(1, 4);	//[1]번째 문자 ~ [3]번째 문자까지만 출력
										// (포함([1]번째), 포함하지않음([4]번째))
		System.out.println("범위로 자르기 : " + data1);
		
		// 문자 한 개씩 자르기 (char.At()메소드 사용)
		char word = data1.charAt(1);	// 0이면 [0]번째 자리가 공백이므로 공백이 출력된다
		System.out.println("문자 자르기 : " + word);
		
	}
}

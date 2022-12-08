package com.kh.day11.wrapperEx;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		
		//예전 사용방법(new 키워드 사용) -> 사라져서 쓰는 것 권장x
		// error : The constructor Integer(int) is deprecated since version 9
		//Integer soo = new Integer(0);
		
		//클래스로 다루겠다, 숫자를 넣고싶다(0)
		Integer su = Integer.valueOf(0);
		
		//여러 메소드들(toLowerCase/isDigit/isAlphabetic)
		//Character. 하면 오른쪽에 키워드들 볼 수 있다(개발에 참고)

		//toLowerCase()메소드 -> String에서 많이 사용(소문자로 변환)
		System.out.println(Character.toLowerCase('A'));
		// 선언
		char c1 = '4', c2 = 'F';
		//isDigit()메소드 -> 숫자인지 아닌지 판단
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		} // isAlphabetic()메소드 -> 문자인지 아닌지 판단
		if(Character.isAlphabetic(c2)) {
			System.out.println(c1 + "는 영문자");
		}
		//글씨가 기울어져있으면 static 메소드이다.
	
	
	}

}

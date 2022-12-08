package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// 두 값을 계산해서 출력하시오 (strNum2 - strNum)
		// 결과 : 9379
		
		// 문자열끼리 뺄셈 불가능하므로 'parseInt메소드' 통해 int로 변경
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("결과 : " + result);
		
		// 따로 변수에 담아서 해도 된다.
		//int num2 = Integer.parseInt(strNum2);
		//int num1 = Integer.parseInt(strNum);	
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		
		// 1. strData를 byte, short, int, long으로 변환하시오.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		
		// 2. strData2를 float, double로 변환하시오.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		
		// 3. strData3을 char로 변환하시오.
		/* Character 메소드 사용해서 문자(char)로 바꾸려고 했더니 해당 메소드는
		 * 매개변수타입 char만 받을 수 있다. 하지만 전달값은 String이므로
		 * char로 변경하기위한 Character메소드를 사용할 수 없다.*/
		//char word = Character;	// 불가능
		
		// 문자열(String)을 문자(Char)로 바꾸는 방법 하나뿐. charAt(0)사용.
		char word = strData3.charAt(0);
		

	}
	
	
	
}

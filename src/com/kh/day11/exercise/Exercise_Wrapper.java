package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// �� ���� ����ؼ� ����Ͻÿ� (strNum2 - strNum)
		// ��� : 9379
		
		// ���ڿ����� ���� �Ұ����ϹǷ� 'parseInt�޼ҵ�' ���� int�� ����
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("��� : " + result);
		
		// ���� ������ ��Ƽ� �ص� �ȴ�.
		//int num2 = Integer.parseInt(strNum2);
		//int num1 = Integer.parseInt(strNum);	
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		
		// 1. strData�� byte, short, int, long���� ��ȯ�Ͻÿ�.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		
		// 2. strData2�� float, double�� ��ȯ�Ͻÿ�.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		
		// 3. strData3�� char�� ��ȯ�Ͻÿ�.
		/* Character �޼ҵ� ����ؼ� ����(char)�� �ٲٷ��� �ߴ��� �ش� �޼ҵ��
		 * �Ű�����Ÿ�� char�� ���� �� �ִ�. ������ ���ް��� String�̹Ƿ�
		 * char�� �����ϱ����� Character�޼ҵ带 ����� �� ����.*/
		//char word = Character;	// �Ұ���
		
		// ���ڿ�(String)�� ����(Char)�� �ٲٴ� ��� �ϳ���. charAt(0)���.
		char word = strData3.charAt(0);
		

	}
	
	
	
}
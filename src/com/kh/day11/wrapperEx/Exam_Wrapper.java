package com.kh.day11.wrapperEx;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		
		//���� �����(new Ű���� ���) -> ������� ���� �� ����x
		// error : The constructor Integer(int) is deprecated since version 9
		//Integer soo = new Integer(0);
		
		//Ŭ������ �ٷ�ڴ�, ���ڸ� �ְ�ʹ�(0)
		Integer su = Integer.valueOf(0);
		
		//���� �޼ҵ��(toLowerCase/isDigit/isAlphabetic)
		//Character. �ϸ� �����ʿ� Ű����� �� �� �ִ�(���߿� ����)

		//toLowerCase()�޼ҵ� -> String���� ���� ���(�ҹ��ڷ� ��ȯ)
		System.out.println(Character.toLowerCase('A'));
		// ����
		char c1 = '4', c2 = 'F';
		//isDigit()�޼ҵ� -> �������� �ƴ��� �Ǵ�
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "�� ����");
		} // isAlphabetic()�޼ҵ� -> �������� �ƴ��� �Ǵ�
		if(Character.isAlphabetic(c2)) {
			System.out.println(c1 + "�� ������");
		}
		//�۾��� ������������ static �޼ҵ��̴�.
	
	
	}

}

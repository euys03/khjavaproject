package com.kh.day09.point;


public class ColorPointEx {
	public static void main(String[] args) {
		/** ColorPoint�� �Ű����� �ִ� �����ڰ� �ְ� �⺻�����ڰ� ���� ����!
		 * �⺻ �����ڰ� ���µ� �⺻�����ڸ� ����Ϸ��� ������ ����.
		 * 1. ColorPoint Ŭ������ �⺻�����ڸ� ���ų�
		 * 2. �Ʒ� �ڵ带 �Ű����� �ִ� �����ڷ� �ٲ��ش�. [v]
		**/
		ColorPoint cp = new ColorPoint(5, 6, "blue");
//		cp.set(3, 4);	// Point�� set() ȣ��
//		cp.setColor("red");	// ColorPoint�� setColor() ȣ��
		// error : blue cannot be resolved to a variable
		cp.showColorPoint();  //�÷��� ��ǥ ���
		
		/**��°��
		 * red		// (�ڽĸ޼ҵ�) 		
		 * (3, 4)	// �θ�Ŭ���� Point�� showPoint()�� ���(�θ�޼ҵ�)
		 * */
	}
}

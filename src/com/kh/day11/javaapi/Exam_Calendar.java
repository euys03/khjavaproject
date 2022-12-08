package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String [] args) {
	/*
		Calendar today = Calendar.getInstance();
		// ���� ��¥ ��������
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; // MONTH�� 0���� �����̶� +1���ֱ�
		int day = today.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK); // ���� ǥ��
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24�ð� ǥ��
		int ampm = cal.get(Calendar.AM_PM);		// ���� ���� ǥ��		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int minllisecond = cal.get(Calendar.MILLISECOND);	// �и��� ǥ��		
		
		System.out.println("�⵵ : " + year);
		System.out.println("�� : " + month);
		System.out.println("�� : " + day);
		System.out.println("���� : " + dayOfWeek);
		System.out.println("�� : " + hour);
		System.out.println("�� : " + minute);
		System.out.println("�� : " + second);
	*/
		
		
	// �ʿ��� ������ ������ �� �� �����Ƿ� "���ȭ"�� ����
	// �ѹ��� ��밡���ϵ��� �ؾ��Ѵ�. (�޼ҵ� �����)		
		
		Exam_Calendar exCal = new Exam_Calendar();
	// Calendar - �߻� Ŭ����(A�� �پ� ����)
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("����",today);
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		System.out.println();
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("������", someDate);
		System.out.println();
		
		// �������� ����غ�����!
		Calendar endDate = Calendar.getInstance();
		someDate.clear();
		endDate.set(2023, 4, 2);
		endDate.set(Calendar.HOUR_OF_DAY, 17);
		endDate.set(Calendar.MINUTE, 50);
		exCal.printCalendar("������", endDate);
	}
 	
	public void printCalendar(String msg, Calendar cal) {
		//Calendar today = Calendar.getInstance();
		// ���� ��¥ ��������
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // MONTH�� 0���� �����̹Ƿ� +1���ֱ�
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // ���� ǥ��
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24�ð� ǥ��
		int ampm = cal.get(Calendar.AM_PM);		// ���� ���� ǥ��
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);	// �и��� ǥ��
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		System.out.print(msg + " " + year + "/" + month + "/" + day + "/");
		// ���Ϻ� ��Ÿ����
		switch(dayOfWeek) {
			case Calendar.SUNDAY : 		System.out.print("�Ͽ���"); break;
			case Calendar.MONDAY : 		System.out.print("������"); break;
			case Calendar.TUESDAY : 	System.out.print("ȭ����"); break;
			case Calendar.WEDNESDAY : 	System.out.print("������"); break;
			case Calendar.THURSDAY : 	System.out.print("�����"); break;
			case Calendar.FRIDAY : 		System.out.print("�ݿ���"); break;
			case Calendar.SATURDAY : 	System.out.print("�����"); break;
		}
		System.out.print("(" + hourOfDay + "��)");
		if(ampm == Calendar.AM) System.out.print(" ���� ");
		else System.out.print(" ���� ");
		System.out.print(hour + "�� " + minute + "�� " + second + "�� " + millisecond + "�и���");
	}
	
	
	
	
}

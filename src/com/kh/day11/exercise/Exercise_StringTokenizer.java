package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// ȫ�浿/��ȭ/ȫ��/����/����/ �� ���ڿ� �����͸�
		// '/' �������� �߶� ȫ�ø� ����Ͻÿ�
		String data = "ȫ�浿/��ȭ/ȫ��/����/����";
		
		// 1. ��ü ���
		/*
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {	// ��ū ȣ��
			System.out.println(st.nextToken());	//��ū ������ ���
		}
		*/
		
		// 2. ȫ�ø� ���
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {	// ��ū ȣ��
			if(st.nextToken().equals("ȫ��"))	// ('ȫ��'�϶�)
			System.out.println("ȫ��");	//��ū ������ ���(ȫ�� ���)
		// "ȫ��"�ڿ� st.nextToken()�� ���� while�� �ݺ��Ͽ� ���� '����'�� ��µȴ�.
		}
		
		
		
	}
}

package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day16.setcollection.Student;

/** Map
 * Ű�� �ߺ� �Ұ��������� (������ȣ02,  02 (x))
 * ���� �ߺ� ���� (����, ���� (o) ) **/


public class MapRun {
	public static void main(String [] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();	// day16.setcollection �� Student�� import.
		// Map<String, com.kh.day16.setcollection.Student> stdMap = new HashMap<String, Student>();
		// ���� ���� : �̹� MapRun.java�� �Ȱ��� �̸��� studentŬ������ import�س��� �����̱� ����. 
		// com.kh ~~ �� ���´ٸ� �� �� import�� �ö󰡼� �ڵ�� ���� import���ְ� �����ִ� import�� ������ ��,
		// Student�� �Է����ָ� �ȴ�.
		stdMap.put("1", new Student("�տ���", 44, 66));
		stdMap.put("2", new Student("����", 55, 100));
		
		System.out.println("ù��° �л� : " + stdMap.get("1").toString());
		// .get()�Ͽ� Ű�� "1"�� �ҷ��� ��, �ش� Ű�� ���� ��ü(new Student)�� �����Ǿ� �־�
		// 'stdMap.get("1")' ��ü�� ��ü�� �ǰ�, ��(.)�� �̿��Ͽ� toString()�� �ҷ��� �� �ִ�.
		
	}
	
	public void mapExample1() {
		// Map �������̽��� import
		Map<String, String> map = new HashMap<String, String>();	// <Ű, ��>
		map.put("02", "����");
		map.put("031", "��⵵");
		map.put("061", "����");
		map.put("053", "�뱸");
		System.out.println("����� �������� �� : " + map.size());
		System.out.println("02 ������ ������ ���ɴϴ� : " + map.get("02"));	// .get���� "Ű��"�� �ִ´�
		System.out.println("031 ������ ��⵵�� ���ɴϴ� : " + map.get("031"));	// Ű('031')�� �ҷ����� ��('��⵵')�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ȣ �Է� : ");
		String regionCode = sc.next();
		
		System.out.println("�Է��Ͻ� ������ȣ�� ���� ������ : " + map.get(regionCode));
		
	}
	
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "����");
		objMap.put("price", 1500);
		objMap.put("isGood", true);	// ���� true, false�� �����Ͽ� ���׿������� ���ǿ� �°� ���
		System.out.println("��ǰ �̸��� " + objMap.get("name"));
		System.out.println("������ " + objMap.get("price") + "��");
		String result = (boolean)objMap.get("isGood") ? "��õ" : "����õ";	// ���׿�����
		System.out.println("��õ���δ� " + result);
		
	}
}

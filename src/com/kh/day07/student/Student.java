package com.kh.day07.student;

public class Student {
	// ĸ��ȭ.
	// ������ �̸��� ��������(private)�� �����ߴ�.
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {	
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
// ��������� private�̱� ������ ���������� �����ؾ��Ѵ�. (setter, getter�޼ҵ�)
	
	// setter �޼ҵ�
	// ��������� ���� �ʱ�ȭ���ش�.
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// getter �޼ҵ�
	// ��������� ���� �����Ѵ�.
	// name�� private�� �����Ͽ� �ܺο��� ������ �Ұ��ϹǷ� ��ȸ�ؼ� ����ϱ����� �ڵ��.
	// ��������� �ҷ����� �޼ҵ���� get �ڿ� �ʵ���� �ٿ���� �Ѵ�.(��Ģ)
	public String getName() {
		return this.name;	// name�� ����� �� �ֵ��� return ���ش�.
							// -> ��ȯ���̹Ƿ� void->string���� �ٲ�����Ѵ�.
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
}

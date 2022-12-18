package com.kh.day16.setcollection;

// SetRun.java�� ����������
public class Student {
	
	private String name;
	private int score1;
	private int score2;
	
	/** �޼ҵ� �ڵ��ϼ� **
	 * (����) ��Ŭ���� �� �޼ҵ��� ��ȣ �ٷ� ���� Ŭ�� �� �ؾ��Ѵ�.
	 * ��Ŭ�� -> source -> Generate Constructor using Feild -> �ʱ�ȭ�� �޼ҵ常 üũ �� Generate
	 * 
	 * getter/setter �ڵ��ϼ�
	 * ��Ŭ�� -> sorce -> Gerate Getters and Setters -> getter/setter ����� �޼ҵ�� ����
	 * 
	 * ----------------------------------------------------------------------
	 ** �������̵� **
	 * �������̵����� ������ ���� ���������� ���� ���ο� ��ü��� �ν��Ͽ� �����(����)�� ��� �ٸ�����
	 * �������̵������ν� ���� ������ �߰��ϴ��� ������ �������� �ν��Ͽ� ������ ���ڰ� ��µȴ�.
	**/
	
	
	// �޼ҵ� �ڵ��ϼ� (�⺻������ �ڵ��ϼ�)
	 // ��Ŭ�� -> source -> Generate Constructor using Feild -> �ʱ�ȭ�� �޼ҵ常 üũ �� Generate
	public Student() {
		super();
	}
	// �޼ҵ� ��� üũ (�Ű����� �����ڵ� �ڵ��ϼ� ����)
	public Student(String name, int score1, int score2) {	// �Ű����� ���� �����ֱ�!
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	
	// getter/setter �ڵ��ϼ�
	// ��Ŭ�� -> sorce -> Gerate Getters and Setters -> getter/setter ����� �޼ҵ�� ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	
	// �������̵����� ������ ���� ���������� ���� ���ο� ��ü��� �ν��Ͽ� �����(����)�� ��� �ٸ�����
	// �������̵������ν� ���� ������ �߰��ϴ��� ������ �������� �ν��Ͽ� ������ ���ڰ� ��µȴ�.
	
	// hashCode �������̵�
	@Override
	public int hashCode() {
		// SetRun���� �Է��� �����͵��� this.�� �޾ƿ� '�̸�, 1������, 2������'�� ������
		// ���ڿ��� ���������, �ش� ���ڿ��� �ؽ��ڵ�(.hashCode()) ���� �����ϵ��� �������̵� �Ͽ���.
		// ����Ͽ��� �� ������ �����͸� ������ �Է��Ͽ��� '������ ����'���� �ν��Ͽ� ������ ���ڰ� ��µȴ�.
		return (this.name + this.score1 + this.score2).hashCode();
	}
	
	// �Ź� ( System.out.println(kdw.getName() + ", " + kdw.getScore1() + ", " + kdw.getScore2()); ) �Ͽ�
	// �����Ͱ��� Ȯ���ϱ� �����Ƿ� information�޼ҵ带 StudentŬ������ ���� �����
	// ��¹��� information()�� ���� �ҷ��� ����ϴ� �������� ����Ѵ�.
	// -> toString�� �������̵��Ͽ� �� ���� ����Ѵ�.
	public String information() {	// return��(int�� string���� �ٲ�Ƿ� ���� �ڷ����� string�� �ȴ�. void -> string)
		return "name : " + this.name + ", socre1 : " + this.score1 + ", socre2 : " + this.score2;
	}
	
	// toString �������̵� -> information() �޼ҵ带 ����� ������� �� �����ϰ� ��밡��
	@Override
	public String toString() {

		return "name : " + this.name + ", socre1 : " + this.score1 + ", socre2 : " + this.score2;
//		return super.toString();
	}
	
	
	
	// equals �������̵� (3���� ���ؾ��ϴ� ��Ȳ�̹Ƿ� �������̵�)
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std = (Student)obj;	// Student�� �ٿ�ĳ����
			// SetRun���� �߰��� ���� ���� �߰��Ǿ��� ���� ������ ��
			// ���ٸ� ���� ������ �ν��ϰ� ���� �� ��� (���� �ٸ� ��ü�� �ν����� �ʴ´�)
			return this.hashCode() == std.hashCode();	// �� == ��
			
		}else {
			return super.equals(obj);
		}
	}
	
	
	
	
	
	
}

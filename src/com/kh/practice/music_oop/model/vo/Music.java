package com.kh.practice.music_oop.model.vo;

public class Music {
	// ���
	private String title;
	// ������
	private String singer;
	
	
	
	// �ڵ��ϼ�1. �Ű����� �ִ� ������
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	
	// �ڵ��ϼ�2. getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	

	// �ڵ��ϼ�3. toString (������ Ȯ�ο�)
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
}

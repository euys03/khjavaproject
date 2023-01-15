package com.kh.practice.music_oop.model.vo;

public class Music {
	// 곡명
	private String title;
	// 가수명
	private String singer;
	
	
	
	// 자동완성1. 매개변수 있는 생성자
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	
	// 자동완성2. getter/setter
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
	

	// 자동완성3. toString (데이터 확인용)
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
}

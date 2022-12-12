package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	
	// f1이라는 파일객체가 넘어올때 파일 객체의 '서브리스트'출력하기
	// ex) cmd에 dir을 입력하였을 때 파일탐색기처럼 폴더 리스트들이 뜨는 것.
	
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트입니다.------");
		// 서브리스트 출력(listFiles()메소드의 반환형이 File의 객체배열이므로 File을 배열로 선언)
		File [] subFiles = dir.listFiles();
		
		for(int i = 0; i < subFiles.length; i++) {
			// 인덱스[i]로 접근해서 하나의 객체만 fOne에 넣어주는 것
			File fOne = subFiles[i];
			// 마지막 수정시간(lastModified)가져오기
			long time = fOne.lastModified();
				// 정렬을 위한 printf. (print(fOne.getName()); 해도 된다
			System.out.printf("%25s", fOne.getName());
			System.out.print("\t파일 크기  " + fOne.length());
			// 변환문자 : '%tb' = 월, '%td' = 일, '%ta' = 요일, '%tT' = 시간
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",time, time, time, time);
		}
	}
	

	public static void main(String[] args) {
		// 폴더의 리스트를 출력하기 때문에(listDirectory) 파일명이 아닌 폴더명까지만 입력한다.
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

		// 위에 정의한 메소드(listDirectory) 호출
		listDirectory(f1);
	}

}

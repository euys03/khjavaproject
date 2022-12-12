package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String [] args) {
		// 경로 출력하기
		File file = new File("D:\\Temp\\wow.png");	// 'File' import 하기 + 'new File' File(String Pathname) import하기
		String fileName = file.getName();
		String path		= file.getPath();
		String parent	= file.getParent();
		
		System.out.println("파일 이름 : " + fileName);
		System.out.println("파일 경로 : " + path);
		System.out.println("부모 폴더 : " + parent);
		
		
		// 파일 및 폴더 생성도 가능(createNewFile() 메소드 사용 - 예외처리)
		try {
			// 파일 생성
			File fileMake = new File("src/iostream/fileOne.txt");
			//fileMake.createNewFile();		// 덮어씌우지 않기 위해 make들 주석처리.
			// 폴더 생성
			File folderMake = new File("src/file");
			//folderMake.mkdir();
			// 만든 폴더 안에 파일 만들기 (매번 객체를(fileMake1,2) 호출해서 메소드를 호출해야만 파일이 생성된다.)
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();	// (위의 의미로 주석처리 하려했지만 오류나서 하지않음)
		
			
			// 파일의 유무 -> exists()메소드 사용
			System.out.println("파일이 존재하는가? : " + fileMake.exists());
			// 파일이 아니면 폴더일 수 있으므로 파일인지 확인 -> isFile()메소드 사용
			System.out.println("fileOne.txt가 파일이 맞는가? : " + fileMake.isFile());
			// 폴더인지 확인 -> isDirectory()메소드 사용
			System.out.println("file폴더가 폴더가 맞는가? : " + folderMake.isDirectory());
			
			/** is형태의 메소드들은 결과값으로 True or False 를 반환한다.
			 * ex) isFile(), isDirectory
			**/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

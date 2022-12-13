package com.kh.day14.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

// [구조적 프로그래밍] -> 객체지향 프로그래밍으로 변경해보기
public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;
	
	
	public static void main(String[] args) {
		
	/*		1. 정보입력
	 *		2. 정보출력
	 *		3. 정보저장(save)
	 *		4. 정보불러오기(load)
	 *		0. 종료
	 *		메뉴 입력 : 1		
	
	 *		이름 입력 : 일용자
	 *      나이 입력 : 33
	 *		주소 입력 : 서울시 종로구
	
	 *		1. 정보입력
	 *		2. 정보출력
	 *		3. 정보저장(save)
	 *		4. 정보불러오기(load)
	 *		0. 종료
	 *      메뉴 입력 : 2
	 *
	 * 		이름 : 일용자
	 * 		나이 : 33
	 * 		주소 : 서울시 종로구
		
	 * 		3. 선택하여 저장 후 파일을 열어보면
	 * 		단, 파일의 이름은 이름으로 한다.
	 * 		일용자.txt -> 일용자/33/서울시 종로구
	 * 		이용자.txt -> 이용자/22/서울시 중구
	 * 		삼용자.txt -> 삼용자/11/서울시 서대문구
	 * 
	 * 		4. 선택 후 파일의 제목을 입력하여 로드한 후에
	 * 		2. 선택하면 정보가 출력됨
	 * 
	 * 		이름 : 이용자
	 * 		나이 : 22
	 * 		주소 : 서울시 중구
	 * 	
	 */	
		
		
	// 구조적프로그래밍 중 ...
		end:
		while(true) {
			int choice = printMenu();
			
			switch(choice) {
				case 1 : insert();
					break;
				case 2 : print();
					break;
				case 3 : save();
					break;
				case 4 : load();
					break;
				case 0 : break end;		// end 이용하여 while문 탈출 (exit, escape 등 맘대로)
				default : System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
			}
		}
	}
	
	
	static int printMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save 후 입력받은 이름은 파일명)");
		System.out.println("4. 정보불러오기(load 후 2번으로 출력)");
		System.out.println("0. 종료하기");
		System.out.print("메뉴 입력 : ");	
		int select = sc.nextInt();
		return select;	// return으로 저장(반환). + 자료형 변경(void -> int)
	}
	
	
	static void insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ===== ===== =====");
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("주소 입력 : ");
		// * sc.nexLine() 쓸 때 주의해야할 점 *
		sc.nextLine();
		// 나이 입력 후 '엔터'를 쳤을 때 주소입력의 'sc.nextLine()'으로 들어가
		// 주소를 치지 않아도 사라지므로 지우는 버퍼코드를 위에 하나 적어줘야 한다.
		address = sc.nextLine();
		System.out.println("===== ===== ===== =====");
	}
	
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("======== ======= =======");
	}
	
	
	static void save() {
		
		// 프로그램 기준 iostream(메모장)으로 '나가는 것' -> 출력스트림 write 사용
		Writer os = null;
		
		try {
			String result = name + "/" + age + "/" + address;	// 문자기반 파일 쓰기 (FileWriter)
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();	// flush를 통해 버퍼에 있는 문자(result)를 출력한다.
			System.out.println("저장완료되었습니다.");
			System.out.println("===== ===== ===== =====");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	static void load() {
		// 파일에 있는 정보를 '읽어들인다' -> 입력스트림 Reader 사용
		Reader reader = null;
		BufferedReader bfReader = null;		// 빠르게 읽기위해 bufferedReader 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.next();
		String result = "";
		
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			// 파일 크기와 상관없이 개행 전까지 코드를 한 줄 씩 읽어옴
			bfReader = new BufferedReader(reader);
			//reader.read();
			result = bfReader.readLine();
			
			// result -> 일용자/22/서울시 중구
			
			// '/'를 기준으로 자르는 방법 2가지
			// 1. split() 메소드 사용
			// 2. StringTokenizer 사용
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();		// nextToken(첫번째, 일용자)
			// String을 Int로 변경 -> Integer.parseInt()메소드 사용
			//age = st.nextToken();
			age = Integer.parseInt(st.nextToken());	// nextToken(두번째, 22)
			address = st.nextToken();	// nextToken(세번째, 서울시 중구)
			System.out.println("로드가 완료되었습니다 !");
			System.out.println("정보 출력이 가능합니다. 2번을 눌러주세요");
			System.out.println("===== ===== ===== =====");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

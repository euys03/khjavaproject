package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 6565;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("서버 구동중입니다.");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			
			while(true) {
				// 받은 메시지 : 12 + 1			
				String msg = dis.readUTF();
				
				// bye 입력시 종료(server)
				if(msg.equalsIgnoreCase("bye")) {	// 문자열은 ==으로 비교 불가능 (equals 사용)
									// 대소문자 구분없이 받을 수 있는 메소드 -> equalsIgnoreCase()
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.println("받은 메시지 : " + msg);
				
				// 연산결과 보내기 
				/** -> split() 메소드 사용위해 연산 띄어서 입력받음
				 * split() 메소드는 빈 문자열이 주어졌을 경우 빈 배열이 아니라
				 * 빈 문자열을 포함한 배열을 반환한다.
				 * ex) split() = 공백이 몇 개이든 상관없이 무조건 1개로 보고 출력
				 * 	split(" ") = 공백 하나하나를 각각의 공백으로 보고 갯수만큼 그대로 출력
				 * - split()은 공백 뿐만이 아니라 "\t"(탭), "\n"(엔터)도 처리해준다.
				**/
				String [] msgArrs = msg.split(" ");	//받은 메시지(msg)를 공백으로 나누어(split()) 배열로 만듬
				if(msgArrs.length != 3) {	// 만든 배열의 길이가 3이 아니면(숫자, 연산자, 숫자) 경고문 출력
					msg = "end";		// "end"자리에 "잘못입력하였습니다,"와 같이 출력문을 입력하기에 너무
					dos.writeUTF(msg);	// 길기 때문에 "end"라는 문자를 통해 클라이언트로 전달하여 클라이언트에서
										// 출력문이 나오도록 한다.
					continue;	// (무한반복)해당 조건문의 처음으로 간다. -> continue;
					
					// break문 대신 continue 이유 : while(true)무한반복문에 의해 입력배열이 3 이상인 경우에는
					// 		"잘못입력하였습니다~" 출력 후 입력을 다시 받아야 하는데 break문에 의해 끝나고
					// 		이어서 아래코드가 실행되기 때문에.
					
					//System.out.println("잘못입력하셨습니다. 형식에 맞게 입력해주세요.");
				}
				
				// error : Type mismatch: cannot convert from int to String (Int -> String으로 바꿔라)
				// 해결방법 : Integer.parseInt()메소드 사용
				int num1 = Integer.parseInt(msgArrs[0]);
				String operator = msgArrs[1];
				int num2 = Integer.parseInt(msgArrs[2]);
				String result = "";
				switch(operator) {
					// error : Type mismatch: cannot convert from String to int (String -> int로 바꿔라)
					// 방법1) 문자열 ""을 추가해준다.
					// 방법2) valueOf() 메소드 사용.
					case "+" : result = num1 + num2 + ""; break;
					case "-" : result = String.valueOf(num1 - num2); break;
					case "*" : result = String.valueOf(num1 * num2); break;
					case "/" : result = num1 / num2 + ""; break;
					case "%" : result = num1 % num2 + ""; break;
					default : result = "연산자를 잘못 입력하셨습니다."; break;
				}
				dos.writeUTF(result);
				// 결과 보내기 끝
				
			}
			
		} catch (Exception e) {		// Exception 하나로 모든 예외를 처리할 수 있다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

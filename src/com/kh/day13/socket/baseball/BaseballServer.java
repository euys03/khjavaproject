package com.kh.day13.socket.baseball;
// 1. 볼 : 자리도 맞고 숫자도 맞은 경우
// 2. 스트라이크 : 자리는 맞지 않지만 숫자는 맞은 경우

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];	// 3개의 번호를 넣을 배열을 할당
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);	// 2초 지연
			Date date = new Date(); // 지연중인 현재 시간을 알 수 있다.
			System.out.println(trans.format(date));	// SimpleDateFormat 사용
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			
		// 1 ~ 9 중 번호 3개를 랜덤으로 뽑은 후(배열에 넣어)에 게임을 준비해야 함
			for(int i = 0; i < numbers.length; i++) {
				// 1 ~ 9 사이의 랜덤한 숫자
				numbers[i] = rand.nextInt(9)+1;
				// 중복제거해서 배열에 저장
				for(int e = 0; e < i; e++) {
					// 전에 뽑은 숫자(i)와 방금 뽑은 숫자(e)가 같으면(중복) 다시 뽑는다(i--)
					if(numbers[e] == numbers[i]) {
						i--;
						break;
					}
				}
				
			}
			System.out.println("서버 숫자 -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("서버 준비 완료");
			
			
			while(true) {
				// 값 받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				// 받은 값이 numbers의 값과 비교했을 때
				// - 숫자가 맞고 위치도 맞는지(볼)
				// - 숫자는 맞는데 위치는 틀린지(스트라이크)
				// - 아무것도 맞지 않았는지를
				// 스트라이크, 볼로 출력해준다.
				// hint) 인덱스 -> 위치비교
				// hint) 중복for문 사용
				int strike = 0;
				int ball = 0;
				
				// 1. 배열과 배열의 비교. numbers가 int 배열이라서 입력받은 값은
				// 숫자가 저장되는 배열로 변경(split() 사용) -> String 배열
				String [] readNums = readNum.split(" "); // 띄어쓰기를 기준으로 배열하는 메소드 -> split()
				
				// 2. 문자열과 숫자의 비교
				for(int i = 0; i < numbers.length; i++) {	// 랜덤 출력된 숫자들(numbers)
					for(int e = 0; e < readNums.length; e++) {	// 입력받은 숫자들(readNums)
						// error : Incompatible operand types int and String (호환 불가능한 연산자이다)
						//	-> parseInt() 메소드로 String을 Int로 변경해준다.
						//if(numbers[i] == readNums[e]) {}
						if(numbers[i] == Integer.parseInt(readNums[e])) {	// 1) 값이 같은지 비교
							
							// 스트라이크인지 볼인지 판정
							if(i == e) {	// 2) 위치가 같은지 비교
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				// 클라이언트로 결과값 보내주기!
				String result = strike + "스트라이크 " + ball + "볼";
				System.out.println(result);
				dos.writeUTF(result);
				
				// 스트라이크가 3이면 게임종료하기~
				if (strike == 3) {
					System.out.println("아웃! 게임을 종료합니다.");
					break;
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		

	}

}

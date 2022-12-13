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

// [������ ���α׷���] -> ��ü���� ���α׷������� �����غ���
public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;
	
	
	public static void main(String[] args) {
		
	/*		1. �����Է�
	 *		2. �������
	 *		3. ��������(save)
	 *		4. �����ҷ�����(load)
	 *		0. ����
	 *		�޴� �Է� : 1		
	
	 *		�̸� �Է� : �Ͽ���
	 *      ���� �Է� : 33
	 *		�ּ� �Է� : ����� ���α�
	
	 *		1. �����Է�
	 *		2. �������
	 *		3. ��������(save)
	 *		4. �����ҷ�����(load)
	 *		0. ����
	 *      �޴� �Է� : 2
	 *
	 * 		�̸� : �Ͽ���
	 * 		���� : 33
	 * 		�ּ� : ����� ���α�
		
	 * 		3. �����Ͽ� ���� �� ������ �����
	 * 		��, ������ �̸��� �̸����� �Ѵ�.
	 * 		�Ͽ���.txt -> �Ͽ���/33/����� ���α�
	 * 		�̿���.txt -> �̿���/22/����� �߱�
	 * 		�����.txt -> �����/11/����� ���빮��
	 * 
	 * 		4. ���� �� ������ ������ �Է��Ͽ� �ε��� �Ŀ�
	 * 		2. �����ϸ� ������ ��µ�
	 * 
	 * 		�̸� : �̿���
	 * 		���� : 22
	 * 		�ּ� : ����� �߱�
	 * 	
	 */	
		
		
	// ���������α׷��� �� ...
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
				case 0 : break end;		// end �̿��Ͽ� while�� Ż�� (exit, escape �� �����)
				default : System.out.println("1 ~ 4 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	
	static int printMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������(save �� �Է¹��� �̸��� ���ϸ�)");
		System.out.println("4. �����ҷ�����(load �� 2������ ���)");
		System.out.println("0. �����ϱ�");
		System.out.print("�޴� �Է� : ");	
		int select = sc.nextInt();
		return select;	// return���� ����(��ȯ). + �ڷ��� ����(void -> int)
	}
	
	
	static void insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ===== ===== =====");
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		// * sc.nexLine() �� �� �����ؾ��� �� *
		sc.nextLine();
		// ���� �Է� �� '����'�� ���� �� �ּ��Է��� 'sc.nextLine()'���� ��
		// �ּҸ� ġ�� �ʾƵ� ������Ƿ� ����� �����ڵ带 ���� �ϳ� ������� �Ѵ�.
		address = sc.nextLine();
		System.out.println("===== ===== ===== =====");
	}
	
	
	static void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("======== ======= =======");
	}
	
	
	static void save() {
		
		// ���α׷� ���� iostream(�޸���)���� '������ ��' -> ��½�Ʈ�� write ���
		Writer os = null;
		
		try {
			String result = name + "/" + age + "/" + address;	// ���ڱ�� ���� ���� (FileWriter)
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();	// flush�� ���� ���ۿ� �ִ� ����(result)�� ����Ѵ�.
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			System.out.println("===== ===== ===== =====");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	static void load() {
		// ���Ͽ� �ִ� ������ '�о���δ�' -> �Է½�Ʈ�� Reader ���
		Reader reader = null;
		BufferedReader bfReader = null;		// ������ �б����� bufferedReader ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.next();
		String result = "";
		
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			// ���� ũ��� ������� ���� ������ �ڵ带 �� �� �� �о��
			bfReader = new BufferedReader(reader);
			//reader.read();
			result = bfReader.readLine();
			
			// result -> �Ͽ���/22/����� �߱�
			
			// '/'�� �������� �ڸ��� ��� 2����
			// 1. split() �޼ҵ� ���
			// 2. StringTokenizer ���
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();		// nextToken(ù��°, �Ͽ���)
			// String�� Int�� ���� -> Integer.parseInt()�޼ҵ� ���
			//age = st.nextToken();
			age = Integer.parseInt(st.nextToken());	// nextToken(�ι�°, 22)
			address = st.nextToken();	// nextToken(����°, ����� �߱�)
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ� !");
			System.out.println("���� ����� �����մϴ�. 2���� �����ּ���");
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

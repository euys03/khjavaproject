package com.kh.day15.listcollection;

/** 배열의 단점 보완 -> 리스트 
 * 리스트 특징 : 배열과 메소드를 통해 순서를 유지하고  중복으로 저장 및 나열 가능
 * 				- 자료구조 중 하나. (ex. 대기자 명단 등)
 * Point) IntList 만든 이유 / IntList 만드는 방법 **/

public class IntList {
	// 필드
	private int [] nums;
	private int size;
	
	// 필드의 초기화 -> 생성자의 역할
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int input) {
		nums[size] = input;		// 입력한 값 배열에 저장
		size++;		// 사이즈 증가
	}
	
	// 리턴값이 있으면(return) 리턴값의 자료형을 메소드 반환형(void)에 적어줌.
	// 메소드를 통해 값 가져오는 방법 -> get() 메소드 사용
	public int get (int index) {	// void -> int
		return nums[index];			// nums[0] -> 1, 2 와 같은 int배열이므로
	}
	
	// length 가져오기 -> size() 메소드 사용
	public int size() {	// size의 자료형은 int.
		return size;	// 반환형(return) : void -> int
	}
	
	// 삭제하기 -> clear() 메소드 사용 (안에 있는 것 모두 초기화)
	public void clear() {
		nums = new int[3];
		size = 0;
	}

}

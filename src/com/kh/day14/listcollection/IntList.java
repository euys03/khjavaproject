package com.kh.day14.listcollection;

import java.util.Arrays;

/** 배열 -> 리스트 
 * Point) IntList 만든 이유 / IntList 만드는 방법 **/
public class IntList {
	// 필드
	private int [] nums;
	private int size;	// 요소 갯수
	
	// 필드의 초기화 -> 생성자의 역할
	public IntList() {	// 생성자 : 클래스명과 이름이 동일한 메소드.
		nums = new int[3];	// 필드의 초기화
		size = 0;	// 변하는 값(인덱스) 초기화
	}
	
	private void resize() {
		// array_capacity : 값이 존재하면 그 값을 유지하면서 복사 후 새로운 용량을 만듦.
		// 기존 배열의 크기-> capacity에 저장
		int array_capacity = nums.length;
		
		// 2. 용량이 꽉 찰 경우
		// size -> 현재의 인덱스사이즈, array_capacity -> 기존의 배열의 크기
		if(size == array_capacity) {
			// 2-1) 용량을 2배로 해줌
			int new_capacity = array_capacity * 2;
			// 2-2) 새롭게 배열을 만들어줌
			nums = Arrays.copyOf(nums, new_capacity); // 기존값을 유지하며 2배로 만들 수 있었다.
			// copyOf라는 static()를 이용해 복사 후 2배 된 배열을 nums에 저장  (capacity 영향)
		}
	}
	
	
	// add 메소드
	public void add(int input) {
		// int input = 3	// Run.java에서 3값이 넘어오면 3이 입력되고 input에 저장된다(매개변수 input)
							// 넘어온 input값은 위에 private배열로 선언한 nums에 들어가야한다.
		
		// 1. 꽉 차있는 상태라면 크기를 재할당해서 배열 생성
		if(size == nums.length) {
			resize();
		}
		// 마지막 위치에 요소 추가
		nums[size] = input;
		size++;
	
	}
	
	// 메소드를 통해 가져오는 방법 -> get() 메소드 사용
	public int get(int index) {
		// error : Void methods cannot return a value
		// 해결방법 : public void -> public int로 변경(return 사용이므로)
		return nums[index];
	}
	
	// length 가져오기 -> size() 메소드 사용
	public int size() {
		// error : Void methods cannot return a value
		// 해결방법 : void -> int 로 변경
		return size;
	}
	
	// 삭제하기 -> clear() 메소드 사용(안에 있는 것 모두 초기화)
	public void clear() {
		nums = new int[3];
		size = 0;
	}
	
}

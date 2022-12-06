package com.kh.day10.exercise;
// 계산기 5장PDF p.49 예제

// error : The type GoodCalc must implement
// 		   the inherited abstract method Calculator.add(int, int)
// (구현해야한다.는 오류 -> 오류 위에서 'Add Unimplemented Methods'해준다)
public class GoodCalc extends Calculator {
	
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		//선언(a), 할당과 초기화
		int [] a = {1, 2, 3, 4, 5};
		
		System.out.println("덧셈 : " + calc.add(1, 2));
		System.out.println("뺄셈 : " + calc.substract(5, 2));
		System.out.println("평균 : " + calc.average(a));
	}

	@Override	// 더하기
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override	// 빼기
	public int substract(int a, int b) {
//		int result = a - b;
//		return result;
		return a - b;
	}

	@Override	// 평균
	public double average(int[] a) {
		//(ex.평균구하기 1차)
		//a = {1, 2, 3}
		//int sum = a[0] + a[1] + a[2];
		//double avg = sum/(double)3;
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;	// return 해줘야 출력가능
		
	}

}

package com.kh.day10.zoointerface;
// 사육사 클래스
public class ZooKeeper {
	
	public void feed() {
		System.out.println("feed meat");
	}
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}

	// 10마리 ~ 100마리 ~ 가 되면 각각 먹이주기 힘들다.
	// 'Predator.java'에서 인터페이스로 해결.

//	public void feed() {	// 먹이주기 (=여러곳에 막 뿌리는 것.)
//		System.out.println("feed meat");
//	}
//	public void feed(Tiger tiger) {	//'호랑이'에게 먹이주기
//		System.out.println("feed beef");
//	}
//	public void feed(Lion lion) { //'사자'에게 먹이주기
//		System.out.println("feed gazel");
//	}
//	public void feed(Bear bear) { //'곰'에게 먹이주기
//		System.out.println("feed salmon");
//	}
	

}

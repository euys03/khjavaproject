package com.kh.day10.zoointerface;

public class Lion extends Animal implements Predator{

	@Override
	public String animalFood() {
		// 준비했던 먹이들(특식) return해주기		
		return "gazel";
	}

}

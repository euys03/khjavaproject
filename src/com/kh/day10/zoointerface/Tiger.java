package com.kh.day10.zoointerface;

public class Tiger extends Animal implements Predator{

	@Override
	public String animalFood() {
		// �غ��ߴ� ���̵�(Ư��) return���ֱ�
		return "beef";
	}

}

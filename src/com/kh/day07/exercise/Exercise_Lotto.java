package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void LottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ����� �����ϱ� !!
		// ��, ����� ������������ ����
		// - �ζ� ��ȣ�� 6��, �ζ� ��ȣ�� ������ 1 ~ 45 ������ ����.
		// hint) i--(�ٽ�����), random ���, ũ�Ⱑ 6�� �迭
		int[] lottos = new int[6];
		Random rand = new Random();
		
		// 1. ��ȣ�� �̴´�. x6
		for (int i = 0; i < lottos.length; i++) {
			// ��ȣ�� �̴´�.
			// 1 ~ 45 -> 0 ~ 44 -> 1 ~ 45
			lottos[i] = rand.nextInt(45) + 1; // 6�� ��ΰ� �������� ���ư��� �Ѵ�.
			
			
			// 2. �ߺ����� �� (���� ���ڷ� ������ ���ϴ� Ƚ�� ���� ��������.)
			// �̹� �����ϴ� ������ i�� e < 'i' �� ���ش�.(���ϴ� Ƚ�� ���� �ǹ�)
			// �񱳴� �̹� ���� ���ڿ� ù��°���ں��� ~ ���� ���� ������.
			for (int e = 0; e < i; e++) {
				if (lottos[i] == lottos[e]) {
					// �� ���� ������ i--;
					i--; // ���ڰ� �ߺ��ϰ�� �ٽ� �̱� ���� -1 �ؼ� �ǵ��ư���.
					break;
				}
				// ������ ��� �ǵ��ư��� ù��°���� �ٽ� �̱⶧����
				// �� ��ġ�� �����ʴ�.
			}
		}
		
		// ����
		// 3. ��������
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int e = 0; e < (lottos.length - 1) - i; e++) {
				if (lottos[e] > lottos[e + 1]) {
					int temp = lottos[e + 1];
					lottos[e + 1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}

		// 4. ���
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}

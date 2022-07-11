package com.gm.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// 몬스터 정보
		String[] monsterNames = { "고블린", "오크", "트롤", "골렘" };
		int[] monsterHPs = { 5, 7, 10, 15 };

		// 캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();

		// 스킬 - 파이어 볼
		int magicPower = 6;

		// 몬스터 파티 생성
		// 몬스터 수 입력(1-4마리)
		System.out.println("몬스터 수 입력(1-4)");
		int nums = sc.nextInt(); // 몬스터 수
		String[] monsterPartyNames = new String[nums]; // 몬스터 이름
		int[] monsterPartyHPs = new int[monsterPartyNames.length]; // 몬스터 체력
		int[] monsterAttack = new int[monsterPartyNames.length]; // 파이어 볼 데미지

		// 몬스터 생성(중복 가능)
		for (int i = 0; i < monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHPs[i] = monsterHPs[index];
		}

		// 몬스터 출력
		for (int i = 0; i < monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i] + " HP|" + monsterPartyHPs[i]);
			;
		}

		System.out.println("================================================");

		// 1회성 공격
		// 0-6이하의 랜덤한 데미지로 몬스터 공격
		// 1. 사냥 2. 도망
		boolean check = true;

		while (check) {
			System.out.println("1. 사냥 2. 도망");
			int select = sc.nextInt();
			int death = 0;

			if (select == 1) {
				for (int i = 0; i < monsterPartyNames.length; i++) {
					int damage = random.nextInt(magicPower);
					System.out.println(monsterPartyNames[i] + "에게 " + damage + "만큼의 데미지를 줌");
					monsterPartyHPs[i] = monsterPartyHPs[i] - damage;
					if(monsterPartyHPs[i] < 1) {
						death++;
					}
				}
			} else {
				System.out.println("도망");
				break;
			}
			
			System.out.println("사냥 한 몬스터 수: " + death);
		} //while 끝
	}

}

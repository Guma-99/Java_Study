package com.gm.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//키보드로부터 인원 수를 입력 받아서
		//인원 수 만큼 이름을 입력 받고
		//이름들을 출력		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수를 입력하세요");
		int nums = sc.nextInt(); //인원 수
		String [] names = new String[nums]; //이름
		int [] kor = new int[nums]; //입력받은 이름의 점수
		int total_kor = 0;
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1 + "번 이름 입력");
			names[i] = sc.next();
		}
		//각 학생의 이름별로 국어 점수 입력 후 출력
		for(int i = 0; i < kor.length; i++) {
			System.out.println(names[i] + "의 국어 점수를 입력");
			kor[i] = sc.nextInt();
		}
		
		for(int i = 0; i < kor.length; i++) {
			System.out.println(names[i] + "의 국어 점수: " + kor[i]);
			total_kor = total_kor + kor[i];
		}
		
		//반의 국어 총점을 계산하고 출력
		System.out.println("총점: " + total_kor);	}

}

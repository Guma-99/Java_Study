package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수입력 
		// 짝수면 짝수 출력, 홀수면 홀수 출력
		// 단, 단일 if 한번만 사용
		Scanner sc = new Scanner(System.in);
		
		String result="홀수 입니다";
		
		System.out.println("정수를 입력");
		int num = sc.nextInt();
		
		if(num%2==0) {
			result="짝수 입니다";
		}
		
		result = num%2==0?"짝수입니다":"홀수입니다";
		
		System.out.println(result);

	}

}

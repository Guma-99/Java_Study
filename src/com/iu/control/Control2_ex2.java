package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();//1-5;
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		
		int result = ch+num;
		
		//소문자가 범위를 벗어났을 때
		if(result>'z') {
			result = result - 'z'-1;//2
			result = 'a'+result;
		}
		
		//대문자가 범위를 벗어났을 때
		if(result>'Z' && result<'a') {
			result = result-'Z' -1;
			result = 'A'+result;
		}
		
		
		
		ch = (char)result;
		System.out.println("ch : "+ch);
		//num:2 ch : z
		
		
		// num:1 ch:a 출력 b
		// num:2 ch:a 출력 c
		// num:1 ch:z 출력 a
		// num:2 ch:z 출력 b
		
		//집에서 추가한것
		

		//Study Edition
		//Home Edition


	}

}

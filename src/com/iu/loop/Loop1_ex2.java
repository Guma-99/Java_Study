package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 1번 대문자, 2번 소문자
		//   1번이면 A - Z 출력
		//   2번이면 a - z 출력
		
		System.out.println("1.대문자  2.소문자");
		int select = sc.nextInt();
		
		int i=97;
		int j=123;
		
		if(select==1) {
			i=65;
			j=91;
		}
		
		for(int c=i;c<j;c++) {
			System.out.println((char)c);
		}
		
//		if(select==1) {
//			for(int c=65;c<91;c++) {
//				System.out.println((char)c);
//			}
//		}else {
//			for(int c=97;c<123;c++) {
//				System.out.println((char)c);
//			}
//			
//		}
		
		//A: 65  Z: 90
		//a: 97  z: 122
		
	System.out.println("=============================");
		
		//2. 1-10까지의 합 구하기
		//sum=0;
		//sum=sum+1;
		//sum=sum+2;
		//sum=sum+3;
		//...
		//sum=sum+10;
		int sum=0;//합을 담을 변수
		for(int start=1;start<11;start++) {
			sum=sum+start;
		}
		System.out.println(sum);
		
		System.out.println("===================");
		
		//3. ID, PW입력해서 로그인 판단
		//	 최대 5번까지 시도 가능
		//   로그인이 성공하면 그즉시 종료
		int yId=1234;//회원가입시 입력한 ID
		int yPw=5678;//회원가입시 입력한 PW
		boolean check=false;
		int count=0;
		for(count=0;count<5;count++) {
			System.out.println("ID 입력");
			int id = sc.nextInt();
			System.out.println("PW 입력");
			int pw = sc.nextInt();
			
			if(id==yId&&pw==yPw) {
				System.out.println("로그인 성공");
				check=!check;
				count=1000;
				break;
			}else {
				System.out.println("로그인 실패");
			}
			
		}//for 끝
		
//		if(count==5) {
//			System.out.println("은행 방문");
//		}else {
//			System.out.println("게임 시작");
//		}
		
		if(check) {
			System.out.println("게임 시작");
		}else {
			System.out.println("은행 방문");
		}
		
		//1. 로그인 성공
		//2. 로그인 5번 전부 실패
		
		System.out.println("Finish");
	}

}

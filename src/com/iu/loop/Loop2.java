package com.iu.loop;

public class Loop2 {

	public static void main(String[] args) {
		
		//반복문의 보조문
		//1. break
		//   반복문 내에서 break를 만나면 그 즉시 반복문 종료	
		//2. continue
		//   반복문 내에서 break를 만나면 
		//   for   : 그 즉시 증감식으로 이동
		//   while : 그 즉시 조건식으로 이동
		System.out.println("===== break =======");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		
		
		System.out.println("======== continue =======");
		
		for(int i=0;i<10;i++) {
			
			if(i%2 != 0) {
				System.out.println(i);
				continue;
			}
			
			System.out.println(i);
			
		}
		
		

	}

}

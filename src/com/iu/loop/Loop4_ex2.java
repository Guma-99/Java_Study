package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//FPS
		//총알 : 
		//탄창 : 30발, 3개
		
		//1. 단발 2. 점사
		
		for(int mag=0;mag<3;mag++) {
			
			System.out.println("1.단발 2.점사");
			int select=sc.nextInt();

			int inc = 3;
			String sound="타타탕";
			
			if(select==1) {
				inc = 1;
				sound = "탕";
			}
			
			for(int b=0;b<30;b=b+inc) {
				System.out.println(sound);
			}
			
			
			
// -----------------------------------------------			
//			int count=10;
//			String sound="타타탕";
//			if(select==1) {
//				count=30;
//				sound="탕";
//			}
//			for(int b=0;b<count;b++) {
//				System.out.println(sound);
//			}
			
			
// -------------------------------------------------------			
//			if(select==1) {
//				for(int b=0;b<30;b++) {
//					System.out.println("탄창 : "+mag+" 총알: "+b + " 탕");
//				}
//			}else {
//				for(int b=0;b<10;b++) {
//					System.out.println("탄창 : "+mag+" 총알: "+b + " 타타탕");
//				}
//				
//			}
			
		}
		

	}

}

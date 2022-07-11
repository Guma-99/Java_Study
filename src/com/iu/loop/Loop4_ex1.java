package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분 과 초 입력받음
		//ex) 1, 15
		System.out.println("분 입력");
		int min = sc.nextInt();//1
		
		System.out.println("초 입력");
		int sec = sc.nextInt();//15
		
		boolean flag=false;
		
		for(int m=0;m<60;m++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(m + "분 :"+ s+"초");
				if(min==m&&sec==s) {
					flag=!flag;
					m=60;
					break;
				}
			}
			
//			if(flag) {
//				break;
//			}
			
		}
		
		

	}

}

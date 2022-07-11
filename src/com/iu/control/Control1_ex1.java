package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avg=0.0;
		
		// TODO Auto-generated method stub
		// 키보드로부터, 국어, 영어, 수학 점수를 차례로 입력
		// 총점과 평균을 계산
		// 평균이 90점 이상이면 우등상 수상 출력 
		// 모든 학생들은 졸업 출력
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor+eng+math;
		
		avg = total / 3.0;
		
		if(avg>=90) {
			System.out.println("우등상 수상");
		}
		
		System.out.println("졸업");
		// 2. 평균이 90점 이상이면 A학점 출력
		//	  평균이 80점 이상이면 B학점 출력
		//	  평균이 70점 이상이면 C학점 출력
		//    평균이 60점 이상이면 D학점 출력
		//	  그외 나머지는  F학점 출력
		
		if(avg>=90) {
			System.out.println("A");
		}
		
		if(avg>=80 && avg<90) {
			System.out.println("B");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C");
		}
		if(avg>=60 && avg<70) {
			System.out.println("D");
		}
		if(avg<60) {
			System.out.println("F");
		}

	}

}

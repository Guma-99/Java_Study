package com.iu.array;

import java.util.Scanner;

public class Array_1 {
	
	public static void main(String[] args) {
		//변수 선언 공식
		//데이터타입 변수명;
		//String name;
		//Scanner sc;
		int age = 30;
		//배열 선언
		//모을려고 하는 데이터타입 [] 변수명
		int [] nums = new int[3];
		char [] names = new char[2];
		
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
 		
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);
		System.out.println(nums[0]);
		System.out.println(nums[2]);
	}

}

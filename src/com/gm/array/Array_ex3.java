package com.gm.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = null; // 이름
		int[] number = null; // 번호
		int[] kor = null; // 국어 점수
		int[] math = null; // 수학 점수
		int[] eng = null; // 영어 점수
		int[] total = null; // 총점
		double[] avgs = null; // 평균

		boolean check = true;

		while (check) {
			System.out.println("=====학생 성적 프로그램=====");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			int nums = sc.nextInt();

			//1. 학생 정보 입력
			//	 - 학생 수 입력
			//	 - 이름, 번호, 국어, 수학, 영어 입력 후 총점, 평균 계산
			if (nums == 1) {
				System.out.println("학생 수 입력");
				int study_num = sc.nextInt();

				name = new String[study_num]; // 이름
				number = new int[study_num]; // 번호
				kor = new int[study_num]; // 국어 점수
				math = new int[study_num]; // 수학 점수
				eng = new int[study_num]; // 영어 점수
				total = new int[study_num]; // 총점
				avgs = new double[study_num]; // 평균

				for (int i = 0; i < name.length; i++) {
					System.out.println(i + 1 + "번 학생 이름 입력");
					name[i] = sc.next();
					System.out.println(name[i] + "의 국어 점수 입력");
					kor[i] = sc.nextInt();
					System.out.println(name[i] + "의 수학 점수 입력");
					math[i] = sc.nextInt();
					System.out.println(name[i] + "의 영어 점수 입력");
					eng[i] = sc.nextInt();

				}

				for (int i = 0; i < study_num; i++) {
					total[i] = 0;
					total[i] = total[i] + (kor[i] + math[i] + eng[i]);
					avgs[i] = total[i] / 3.0;

					System.out.println(name[i] + "의 총점: " + total[i]);
					System.out.println(name[i] + "의 평균: " + avgs[i]);
				}
			} //1번 끝 
			
			//2. 학생 정보 조회
//			 - 모든 학생의 이름, 번호, 총점, 평균 출력
			else if (nums == 2) {
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + "총점: " + total[i]);
				}
			} //2번 끝
			
			//6. 프로그램 종료
			else if (nums == 6) {
				break;
			}
		} // while 끝
	}
}

//학생 성적 프로그램
//1. 학생 정보 입력
//	 - 학생 수 입력
//	 - 이름, 번호, 국어, 수학, 영어 입력 후 총점, 평균 계산
//2. 학생 정보 조회
//	 - 모든 학생의 이름, 번호, 총점, 평균 출력
//3. 학생 정보 검색
//	 - 검색할 학생의 번호 입력
//	 - 입력한 번호와 일치하는 학생의 모든 정보 출력
//	 - 일치하는 번호가 없으면 '없는 학생이다' 출력
//4. 학생 정보 삭제
//	 - 삭제할 학생의 번호 입력
//	 - 입력한 번호와 일치하는 학생의 정보 삭제(배열 한칸 삭제)
//	 - 일치하는 번호가 없으면 '없는 학생이다' 출력
//5. 학생 정보 추가
//	 - 추가할 학생의 이름, 번호, 국어, 수학, 영어, 총점, 평균 추가
//6. 프로그램 종료
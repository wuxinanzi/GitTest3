package com.iu.s1.controls;

import java.util.Scanner;

public class Contro12_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		System.out.println("국어 입력");
		kor = sc.nextInt();
		
		System.out.println("영어 입력");
		eng = sc.nextInt();
		
		System.out.println("수학 입력");
		math = sc.nextInt();
		
		total = kor +eng + math;
		
		avg = total/3.0;
		
		boolean flag = false;
		
		if(avg>=60) {
			flag =true;
		}
		if(flag) {
			if(kor<40 || eng<40 || math <40) {
				flag = false;
			}else {
				flag =true;
			}
		}
		if(flag) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}

package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg =0.0;
		
		System.out.println("국업 입력");
		kor =sc.nextInt();
		
		System.out.println("영어 입력");
		eng =sc.nextInt();
		
		System.out.println("수학 입력");
		math =sc.nextInt();
		
		total = kor + eng + math;
		
		avg = total/3.0;
		
		String level ="F";
		
		if(avg>=90) {
			level = "A";
		}
		if(avg>=80 && avg<90) {
			level = "B";
		}
		if(avg>=70 && avg<80) {
			level = "C";
		}
		if(avg<70) {
			level = "F";
		}
	    System.out.println(level);
	    System.out.println(total);
	    System.out.println(avg);
	}

}

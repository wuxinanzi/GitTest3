package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id =1234;
		int pw =5678;
		
		System.out.println("ID를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw = sc.nextInt();
		
		boolean check = false;
		
		if(yId == id && yPw == pw) {
			System.out.println("로그인 성공");
			check = true;
		}else {
			System.out.println("로그인 실패");
			check = false;
		}
		if(check) {
			System.out.println("급여입력");
			int salary = sc.nextInt();
			
			System.out.println("1.정규직 2.계약직");
			
		}
	}

}

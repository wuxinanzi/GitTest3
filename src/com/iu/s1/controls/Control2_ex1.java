package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("ID를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw = sc.nextInt();
		
		if(yId == id && pw == yPw){
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}

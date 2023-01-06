package com.iu.s1.controls;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		System.out.println("본인의 나이를 쓰시오");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성년입니다");
			int count = 1;
		}else {
			System.out.println("미성년입니다");
		}

	}

}

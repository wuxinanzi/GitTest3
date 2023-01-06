package com.iu.api.strings;

import java.util.Scanner;

public class StringStudy10 {

	public static void main(String[] args) {
		System.out.println("지금 현재 당신의 행동을 선택하시오:");
		System.out.println("화를 내실꺼면 1번을 눌러주세요 ");
		System.out.println("화를 내지 않고 말을 못하실꺼면 2번을 눌러주세요");
		
		
		Scanner sc =  new Scanner(System.in);
		int select = sc.nextInt();
		
		if(select==1){
			System.out.println("화를 냈다");
			
			
		}else {
			System.out.println("화 못 낼꺼면 혼잣말도 안했다");
		}
	  }	
	}



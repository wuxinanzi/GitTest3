package com.iu.api.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str2==str);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		
		char ch = str2.charAt(0);
		System.out.println("char : " +ch);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		//char    charAt(int index)
		//int      indexOf(int ch)
		
		int num = str2.indexOf('k',3);
		System.out.println("Num : "+num);
	}

}

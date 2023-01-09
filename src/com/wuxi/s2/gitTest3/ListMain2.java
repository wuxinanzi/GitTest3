package com.wuxi.s2.gitTest3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		// 다형성 형태가 다양하다
		Integer num1 = 1;
		int num2 =3;
		ar.add(num2);// Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer)ar.get(0);//언 박싱 개념
		double n2 = (Double)ar.get(1);// 오토 언박싱
		
		
		for(int i=0;i<= ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}

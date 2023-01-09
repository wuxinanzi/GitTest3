package com.wuxi.s2.gitTest3;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//순서 유지, 값의 중복 허용, 배열기반
		int [] arr = new int [3];
		ArrayList ar = new ArrayList();
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		//add 새로운 데이터추가
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========================================================");
		
		ar.add(1, 8);// 끼워 넣기
		ar.remove(0);// 0번에 있는거 지워짐  
		ar.set(2, 9);//추가가 아니라 수정
		//ar.clear();//clear은 전체 지우기
		
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}

package com.iu.api.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		
		System.out.println("파일명을 입력");
		String fileName = sc.next(); // ab.cdef.jpg
		
		//확장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);// .을제거 하기위해 +1을 함
		System.out.println(result);

		//확장자가 이미지인지 검증
		boolean flag = true;
		for(int i=0;i<names.length;i++){
			if(result.equals(names[i])) { //문자열 비교할땐 == 사용안하고 equals사용해야됩니다 반드시
				System.out.println("정상 파일이다.");
				i=names.length;
				//flag = false;
				flag =! flag;
				break;
			}
			
		}
		if(flag) {
		      System.out.println("비정상 파일이다");
		}System.out.println("finish");
	}
		

}

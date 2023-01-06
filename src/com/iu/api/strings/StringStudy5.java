package com.iu.api.strings;

public class StringStudy5 {

	
	public static void main(String[] args) {
		String str="apple# Apple, aPPLe# appLe";  //전처리
		
		str = str.replace(",", "#");
		str = str.replace(" ","");
		//str = str.trim(); 한개일땔 trim
		
		
		
		String [] result = str.split("#");//파싱(parsing)
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i].trim().toUpperCase());//toLowerCase()): 모든것을 소문자로
		}
 
	}

}

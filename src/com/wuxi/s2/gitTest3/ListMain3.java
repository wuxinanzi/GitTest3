package com.wuxi.s2.gitTest3;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다 Objec reference 타입만가능
		//Generic : Type의 안전성
		//E : 변수명
		//E : Integer
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		int num = ar.get(0);
		
		ArrayList<WetherDTO> ar2 = new ArrayList<>();
		WetherDTO wetherDTO = new WetherDTO();
		wetherDTO.setCity("Seoul");
		ar2.add(wetherDTO);
		wetherDTO = new WetherDTO();
		wetherDTO.setCity("Jeju");
		ar2.add(wetherDTO);
		
//		wetherDTO = new WetherDTO();
//		wetherDTO.setCity("Jeju");
		
		ar2.remove(wetherDTO);
		
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());
		}
	}

}

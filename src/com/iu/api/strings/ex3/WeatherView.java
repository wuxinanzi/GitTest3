package com.iu.api.strings.ex3;

public class WeatherView {
	
	public void view(WeatherDTO [] datas) {  //datas는 weatherDTO를 모아놓은 것입니다
		for(int i=0;i<datas.length;i++) {
			this.view(datas[i]);
		}
		
	}
	
	
	public  void view(WeatherDTO weatherDTO) {
		System.out.println("---------------");
		System.out.println("City : "+weatherDTO.getCity());
		System.out.println("Gion : "+weatherDTO.getGion());
		System.out.println("Status : "+weatherDTO.getStatus());
		System.out.println("Mise : "+weatherDTO.getMise());
		
	}
	
	//2개의 메서드 생성
	 
	//1. 모든 날씨 정보를 출력
	
	//2. DTO하나의 정보를 출력

}

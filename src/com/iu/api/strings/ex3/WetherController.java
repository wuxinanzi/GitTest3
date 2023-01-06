package com.iu.api.strings.ex3;

import java.util.Scanner;

public class WetherController {
	 
	private WeatherDTO[] weatherDTOs;

	//start
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		WeatherData2 weatherData = new WeatherData2();
		WeatherDTO weatherDTO = new WeatherDTO();
		WeatherInput weatherInput = new WeatherInput();
		WeatherView weatherView = new WeatherView();
		WeatherDTO[] weatherDTOs= weatherData.init();
		
		
	
		while(true) {
		System.out.println("1. 2. 3. 4. 5.");
		int i = sc.nextInt();
		for(int k=0; k<weatherDTOs.length;k++) {
			System.out.println(weatherDTOs[k]);
		}
		if(i==1) {
		System.out.println("날씨 정보초기화 되었습니다.");
		
		
		}else if (i==2) {
			
			weatherView.view(weatherDTOs);
			
		}else if (i==3) {
			
		}else if (i==4) {
		this.weatherDTOs = weatherInput.add(this.weatherDTOs);
	   }else if (i==5) {
		   
	   }else {
		   
		   break;
	   }
	}
	}
	//1. 날씨정보초기화 init()
		 //초기화가 완료 되었습니다
	//2. 전국날씨정보
	//3. 지역날씨검색
	//   도시 정보가 없습니다.
	//4. 지역날씨추가
	//   
	//5. 지역날씨삭제
	
	//6. 종	  료
	
	
	
	
	
	
	
	
	
}

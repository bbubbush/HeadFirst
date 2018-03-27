package com.bbubbush.github.observer;

public class WeatherStation {
	public static void main(String[] args) {
		/* Observer pattern
		 * 
		 * */
		WeatherData weatherData = new WeatherData();
		
		// 생성자를 활용해 subject에 별도에 등록절차 없이 바로 등록
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);		// 1차 기상관측
		System.out.println();
		weatherData.removeObserver(currentDisplay);		// currentDisplay 삭제
		weatherData.setMeasurements(82, 70, 29.2f);		// 2차 기상관측
		System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);		// 3차 기상관측
	}
}

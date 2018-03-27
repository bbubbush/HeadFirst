package com.bbubbush.github.observer;

public class WeatherStation {
	public static void main(String[] args) {
		/* Observer pattern
		 * 
		 * */
		WeatherData weatherData = new WeatherData();
		
		// �����ڸ� Ȱ���� subject�� ������ ������� ���� �ٷ� ���
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);		// 1�� ������
		System.out.println();
		weatherData.removeObserver(currentDisplay);		// currentDisplay ����
		weatherData.setMeasurements(82, 70, 29.2f);		// 2�� ������
		System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);		// 3�� ������
	}
}

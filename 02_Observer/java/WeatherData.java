package com.bbubbush.github.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;	// 데이터를 전달할 옵저버리스트
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}
	
	// 옵저버를 등록하는 메서드
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}
	
	// 옵저버를 제거하는 메서드
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	// 옵저버들에게 변화를 알려주는 메서드
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	// 변화를 감지하는 메서드
	public void measurementsChanged() {
		notifyObserver();
	}
	
	// 값을 변경하는 메서드
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	
}

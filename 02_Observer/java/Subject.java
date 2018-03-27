package com.bbubbush.github.observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();		// subject의 상태가 변경되었을 때 모든 옵저버들에게 알림
}

package com.bbubbush.github.observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();		// subject�� ���°� ����Ǿ��� �� ��� �������鿡�� �˸�
}

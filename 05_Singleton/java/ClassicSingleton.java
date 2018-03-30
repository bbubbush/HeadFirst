package com.bbubbush.github.sington;

public class ClassicSingleton {
	// �������� singleton
	
	private static ClassicSingleton uniqueInstance;
	
	private ClassicSingleton() {}
	
	public static ClassicSingleton getInstance() {
		if( uniqueInstance == null ) {
			uniqueInstance = new ClassicSingleton();
		}
		return uniqueInstance;
	}
	
}

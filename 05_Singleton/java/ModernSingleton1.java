package com.bbubbush.github.sington;

public class ModernSingleton1 {
	/* 오늘날의 싱글턴방식 1
	 * 
	 * [고전적 싱글턴의 문제점]
	 * 고전적인 싱글턴방식은 멀티스레드 환경에서 초기 접근을 동시에 시도하는 경우에 꼬이는 경우가 발생한다. 
	 * 싱글턴방식은 하나의 인스턴스만 생성하는 것을 전제로 만드는데 위와 같은 경우는 매우 치명적인 버그나 오류를 야기시킬 수 있다.
	 * 따라서 오늘날의 싱글턴은 멀티스레드환경에서도 문제 없이 동작하게 설계해야한다.
	 * 
	 * [방법1의 장/단점]
	 * JVM이 동작하자마자 메모리에 올리므로 항상 메모리에 올라가 있다. 따라서 무조건 사용해야하는 경우에는 바람직한 설계가 될 수 있으나,
	 * 싱글턴 클래스 자체가 무거운데 사용빈도도 높지 않다면, 메모리에 큰 공간을 계속 차지하게 되는 단점이 있다.
	 * */
	
	private static ModernSingleton1 uniqueInstance = new ModernSingleton1();
	
	private ModernSingleton1() {}
	
	public static ModernSingleton1 getInstance() {
		return uniqueInstance;
	}
}

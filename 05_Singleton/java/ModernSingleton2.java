package com.bbubbush.github.sington;

public class ModernSingleton2 {
	/* 오늘날의 싱글턴방식 2
	 * 	 * 
	 * [방법2의 장/단점]
	 * 객체의 접근을 synchronized를 통해 쉽게 동기화 하여 문제를 간단하게 해결할 수 있다.
	 * 다만 동기화는 처음 초기화 할 때만 필요하고, 그 이후로는 필요없다. 따라서 지나치게 과감한 해결방법이 아닌가 싶은 생각이 들 수 있다.
	 * 속도가 중요하지 않고 호출 빈도가 잦지 않을 때 좋은 방법이다. 다만 동기화는 성능을 100배정도 저하시킨다는 것을 기억하면 좋다.
	 * 
	 * */
	
	private static ModernSingleton2 uniqueInstance;
	
	private ModernSingleton2() {}
	
	public static synchronized ModernSingleton2 getInstance() {
		if( uniqueInstance == null ) {
			uniqueInstance = new ModernSingleton2();
		}
		return uniqueInstance;
	}
}

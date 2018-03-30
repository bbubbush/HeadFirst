package com.bbubbush.github.sington;

public class ModernSingleton3 {
	/* 오늘날의 싱글턴방식 3
	 * 
	 * [방법3의 장/단점]
	 * DCL(Double-Checking Locking)방식이라고 한다. 방법2의 단점을 보완하여 초기에 생성할 때만 동기화를 하고, 그 이후로는 동기화를 거치지 않는다.
	 * volatile 키워드를 통해 멀티스레드환경에서도 reordering을 회피할 수 있다.
	 * synchronized는 작업단위를 하나의 원자성을 갖게 만들기 때문에 데이터 불일치에 대해선 안전하지만 성능면에서는 현저하게 떨어지게 되기 때문에
	 * volatile를 통해 원자성을 통해 얻는 데이터의 안정성을 reordering을 회피함으로 어느정도 채우고 성능면에서의 이점도 챙기는 중간의 형태라고 생각할 수 있다.
	 * 다만, Java 1.4 이전 버전에서는 사용할 수 없음을 유의해야한다. 
	 * 
	 * 보충자료: http://thswave.github.io/java/2015/03/08/java-volatile.html
	 * */
	
	private volatile static ModernSingleton3 uniqueInstance;	// volatile 사용
	
	private ModernSingleton3() {}
	
	public static ModernSingleton3 getInstance() {
		if( uniqueInstance == null ) {
			synchronized (ModernSingleton3.class) {
				if( uniqueInstance == null ) {			// 동기화 후에도 한번더 확실히 확인
					uniqueInstance = new ModernSingleton3();
				}
			}
		}
		return uniqueInstance;
	}
}

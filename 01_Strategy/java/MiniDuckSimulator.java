package com.bbubbush.github.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		/* Strategy pattern
		 * 
		 * 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
		 * 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
		 * 
		 * 기존의 Duck 클래스는 나는 행동과 소리내는 행동이 종속적이었는데 이를 인터페이스로 각각을 알고리즘군으로 정의하여 유연하게 정의하도록 개선했다.
		 * 이는 가변적인 영역과 고정적인 영역을 구분함에서 시작된다.
		 * 
		 * 연습문제로 캐릭터와 무기를 선택하는 프로그램을 작성.
		 * */
		System.out.println("mallard duck >>> ");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();
		
		
		System.out.println("model duck >>>");
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();		// 동적으로 변경시킴
		
	}
}

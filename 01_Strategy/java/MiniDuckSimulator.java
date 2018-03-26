package com.bbubbush.github.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		/* Strategy pattern
		 * 
		 * �˰����� �����ϰ� ������ ĸ��ȭ�Ͽ� ��ȯ�ؼ� ����� �� �ֵ��� �����.
		 * ��Ʈ��Ƽ���� Ȱ���ϸ� �˰����� ����ϴ� Ŭ���̾�Ʈ�ʹ� ���������� �˰����� ������ �� �ִ�.
		 * 
		 * ������ Duck Ŭ������ ���� �ൿ�� �Ҹ����� �ൿ�� �������̾��µ� �̸� �������̽��� ������ �˰������� �����Ͽ� �����ϰ� �����ϵ��� �����ߴ�.
		 * �̴� �������� ������ �������� ������ �����Կ��� ���۵ȴ�.
		 * 
		 * ���������� ĳ���Ϳ� ���⸦ �����ϴ� ���α׷��� �ۼ�.
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
		model.performFly();		// �������� �����Ŵ
		
	}
}

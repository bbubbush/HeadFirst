package com.bbubbush.github.decorator;

public class StarbuzzCoffe {
	public static void main(String[] args) {
		/* Decorator pattern
		 * 
		 * �츮�� ���ϰ� ���� BufferedInputStream�� ���ڷ����� �����̾���!!!!
		 * */
		Beverage beverage1 = new Espresso();		// �ƹ��͵� �߰� ���� ���������� �ϳ� �ּ���
		StarbuzzCoffe.getBeverageInfo(beverage1);
		
		Beverage beverage2 = new DarkRoast();	// ��ũ �ν�Ʈ Ŀ�ǿ� ���� ��ī�� ����ũ�� �÷��ּ���~
		beverage2 = new Whip(new Mocha(new Mocha(beverage2)));
		StarbuzzCoffe.getBeverageInfo(beverage2);
		
		Beverage beverage3 = new HouseBlend();	// �Ͽ콺 ���忡 ������ ��ī �߰����ְ�... �� ���ε� �ּ���
		beverage3 = new Whip(new Mocha(new Soy(beverage3)));
		StarbuzzCoffe.getBeverageInfo(beverage3);
		
		Beverage beverage4 = new Espresso();	// ������ ��å�� �߰��� ���������� �⺻������(T)  ���� �߰�
		beverage4 = new Mocha(beverage4);
		StarbuzzCoffe.getBeverageInfo(beverage4);
		
		Beverage beverage5 = new Espresso("T");	// ������ ��å�� �߰��� ���������� T ������  ���� �߰�
		beverage5 = new Mocha(beverage5);
		StarbuzzCoffe.getBeverageInfo(beverage5);
		
		Beverage beverage6 = new Espresso("G");	// ������ ��å�� �߰��� ���������� G ������  ���� �߰�
		beverage6 = new Mocha(beverage6);
		StarbuzzCoffe.getBeverageInfo(beverage6);
		
		Beverage beverage7 = new Espresso("V");	// ������ ��å�� �߰��� ���������� V ������  ���� �߰�
		beverage7 = new Mocha(beverage7);
		StarbuzzCoffe.getBeverageInfo(beverage7);
		
		
	}
	
	
	// ���� ������ �������ִ� �޼���
	public static void getBeverageInfo (Beverage beverage) {
		System.out.println(beverage.getDescription());
		System.out.println("$" + beverage.cost());
	}
}

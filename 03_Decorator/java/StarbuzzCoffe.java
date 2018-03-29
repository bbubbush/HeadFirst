package com.bbubbush.github.decorator;

public class StarbuzzCoffe {
	public static void main(String[] args) {
		/* Decorator pattern
		 * 
		 * 우리가 흔하게 쓰던 BufferedInputStream은 데코레이터 패턴이었음!!!!
		 * */
		Beverage beverage1 = new Espresso();		// 아무것도 추가 없이 에스프레소 하나 주세요
		StarbuzzCoffe.getBeverageInfo(beverage1);
		
		Beverage beverage2 = new DarkRoast();	// 다크 로스트 커피에 더블 모카에 휘핑크림 올려주세요~
		beverage2 = new Whip(new Mocha(new Mocha(beverage2)));
		StarbuzzCoffe.getBeverageInfo(beverage2);
		
		Beverage beverage3 = new HouseBlend();	// 하우스 블렌드에 두유와 모카 추가해주고... 참 휘핑도 주세요
		beverage3 = new Whip(new Mocha(new Soy(beverage3)));
		StarbuzzCoffe.getBeverageInfo(beverage3);
		
		Beverage beverage4 = new Espresso();	// 사이즈 정책이 추가된 에스프레소 기본사이즈(T)  휘핑 추가
		beverage4 = new Mocha(beverage4);
		StarbuzzCoffe.getBeverageInfo(beverage4);
		
		Beverage beverage5 = new Espresso("T");	// 사이즈 정책이 추가된 에스프레소 T 사이즈  휘핑 추가
		beverage5 = new Mocha(beverage5);
		StarbuzzCoffe.getBeverageInfo(beverage5);
		
		Beverage beverage6 = new Espresso("G");	// 사이즈 정책이 추가된 에스프레소 G 사이즈  휘핑 추가
		beverage6 = new Mocha(beverage6);
		StarbuzzCoffe.getBeverageInfo(beverage6);
		
		Beverage beverage7 = new Espresso("V");	// 사이즈 정책이 추가된 에스프레소 V 사이즈  휘핑 추가
		beverage7 = new Mocha(beverage7);
		StarbuzzCoffe.getBeverageInfo(beverage7);
		
		
	}
	
	
	// 음료 정보를 리턴해주는 메서드
	public static void getBeverageInfo (Beverage beverage) {
		System.out.println(beverage.getDescription());
		System.out.println("$" + beverage.cost());
	}
}

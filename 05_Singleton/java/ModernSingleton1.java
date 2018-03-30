package com.bbubbush.github.sington;

public class ModernSingleton1 {
	/* ���ó��� �̱��Ϲ�� 1
	 * 
	 * [������ �̱����� ������]
	 * �������� �̱��Ϲ���� ��Ƽ������ ȯ�濡�� �ʱ� ������ ���ÿ� �õ��ϴ� ��쿡 ���̴� ��찡 �߻��Ѵ�. 
	 * �̱��Ϲ���� �ϳ��� �ν��Ͻ��� �����ϴ� ���� ������ ����µ� ���� ���� ���� �ſ� ġ������ ���׳� ������ �߱��ų �� �ִ�.
	 * ���� ���ó��� �̱����� ��Ƽ������ȯ�濡���� ���� ���� �����ϰ� �����ؾ��Ѵ�.
	 * 
	 * [���1�� ��/����]
	 * JVM�� �������ڸ��� �޸𸮿� �ø��Ƿ� �׻� �޸𸮿� �ö� �ִ�. ���� ������ ����ؾ��ϴ� ��쿡�� �ٶ����� ���谡 �� �� ������,
	 * �̱��� Ŭ���� ��ü�� ���ſ ���󵵵� ���� �ʴٸ�, �޸𸮿� ū ������ ��� �����ϰ� �Ǵ� ������ �ִ�.
	 * */
	
	private static ModernSingleton1 uniqueInstance = new ModernSingleton1();
	
	private ModernSingleton1() {}
	
	public static ModernSingleton1 getInstance() {
		return uniqueInstance;
	}
}

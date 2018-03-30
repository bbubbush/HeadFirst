package com.bbubbush.github.sington;

public class ModernSingleton2 {
	/* ���ó��� �̱��Ϲ�� 2
	 * 	 * 
	 * [���2�� ��/����]
	 * ��ü�� ������ synchronized�� ���� ���� ����ȭ �Ͽ� ������ �����ϰ� �ذ��� �� �ִ�.
	 * �ٸ� ����ȭ�� ó�� �ʱ�ȭ �� ���� �ʿ��ϰ�, �� ���ķδ� �ʿ����. ���� ����ġ�� ������ �ذ����� �ƴѰ� ���� ������ �� �� �ִ�.
	 * �ӵ��� �߿����� �ʰ� ȣ�� �󵵰� ���� ���� �� ���� ����̴�. �ٸ� ����ȭ�� ������ 100������ ���Ͻ�Ų�ٴ� ���� ����ϸ� ����.
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

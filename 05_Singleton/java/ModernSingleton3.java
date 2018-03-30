package com.bbubbush.github.sington;

public class ModernSingleton3 {
	/* ���ó��� �̱��Ϲ�� 3
	 * 
	 * [���3�� ��/����]
	 * DCL(Double-Checking Locking)����̶�� �Ѵ�. ���2�� ������ �����Ͽ� �ʱ⿡ ������ ���� ����ȭ�� �ϰ�, �� ���ķδ� ����ȭ�� ��ġ�� �ʴ´�.
	 * volatile Ű���带 ���� ��Ƽ������ȯ�濡���� reordering�� ȸ���� �� �ִ�.
	 * synchronized�� �۾������� �ϳ��� ���ڼ��� ���� ����� ������ ������ ����ġ�� ���ؼ� ���������� ���ɸ鿡���� �����ϰ� �������� �Ǳ� ������
	 * volatile�� ���� ���ڼ��� ���� ��� �������� �������� reordering�� ȸ�������� ������� ä��� ���ɸ鿡���� ������ ì��� �߰��� ���¶�� ������ �� �ִ�.
	 * �ٸ�, Java 1.4 ���� ���������� ����� �� ������ �����ؾ��Ѵ�. 
	 * 
	 * �����ڷ�: http://thswave.github.io/java/2015/03/08/java-volatile.html
	 * */
	
	private volatile static ModernSingleton3 uniqueInstance;	// volatile ���
	
	private ModernSingleton3() {}
	
	public static ModernSingleton3 getInstance() {
		if( uniqueInstance == null ) {
			synchronized (ModernSingleton3.class) {
				if( uniqueInstance == null ) {			// ����ȭ �Ŀ��� �ѹ��� Ȯ���� Ȯ��
					uniqueInstance = new ModernSingleton3();
				}
			}
		}
		return uniqueInstance;
	}
}

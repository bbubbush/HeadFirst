package com.bbubbush.github.strategy;

public class CharacterSimulator {
	public static void main(String[] args) {
		System.out.println("King >>>");
		Character king = new King();
		king.fight();		// ���� �⺻���Ⱑ ����
		king.setWeapon(new SwordBehavior());	// ���⸦ Į�� ����
		king.fight();		// ���� Į�� ������
		System.out.println();
		
		System.out.println("Troll >>>");
		Character troll = new Troll();
		troll.fight();			// Ʈ���� ȭ���� �⺻����
		troll.setWeapon(new AxeBehavior());		// ������ ���� �ٲ�
		troll.fight(); 		// ���� ����	
	}
}

package com.bbubbush.github.strategy;

public class CharacterSimulator {
	public static void main(String[] args) {
		System.out.println("King >>>");
		Character king = new King();
		king.fight();		// 왕은 기본무기가 도끼
		king.setWeapon(new SwordBehavior());	// 무기를 칼로 변경
		king.fight();		// 왕은 칼로 공격함
		System.out.println();
		
		System.out.println("Troll >>>");
		Character troll = new Troll();
		troll.fight();			// 트롤은 화살이 기본무기
		troll.setWeapon(new AxeBehavior());		// 도끼로 무기 바꿈
		troll.fight(); 		// 도끼 공격	
	}
}

package com.bbubbush.github.observer;

public class CYL implements Student{
	String math;
	String kor;
	String eng;
	
	TeacherInterface teacher;
	
	public CYL(TeacherInterface teacher) {
		// TODO Auto-generated constructor stub
		this.teacher = teacher;
		teacher.addStudent(this);
	}
	
	@Override
	public void listening(String math, String kor, String eng) {
		// TODO Auto-generated method stub
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		speaking();
	}
	
	@Override
	public void speaking() {
		// TODO Auto-generated method stub
		System.out.println("CYL >>> ���й����� " + math + "�ۿ� �� �ǰ�, ����� " + kor + "�̸鼭, ����� " + eng + "�� ���� ������ ��� ����...");
	}
}

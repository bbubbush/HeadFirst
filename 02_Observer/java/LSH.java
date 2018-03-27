package com.bbubbush.github.observer;

public class LSH implements Student{
	String math;
	String kor;
	String eng;
	
	TeacherInterface teacher;
	
	public LSH(TeacherInterface teacher) {
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
		System.out.println("LSH >>> 아 수학범위가 " + math + "에 국어는 " + kor + "인데 영어는 " + eng + "이나 되네...");
	}
}

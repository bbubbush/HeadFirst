package com.bbubbush.github.observer;

import java.util.ArrayList;

public class Teacher implements TeacherInterface{
	private ArrayList<Student> students;
	private String math;
	private String kor;
	private String eng;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
	}
	
	@Override
	public void addStudent(Student o) {
		// TODO Auto-generated method stub
		students.add(o);
	}
	@Override
	public void deleteStudent(Student o) {
		// TODO Auto-generated method stub
		int i = students.indexOf(o);
		
		if(i <= 0) {
			students.remove(i);
		}
	}
	@Override
	public void notice() {
		// TODO Auto-generated method stub
		for (int i = 0; i < students.size(); i++) {
			Student student = (Student) students.get(i);
			student.listening(math, kor, eng);
		}
		
	}
	
	public void setRangeOfTest(String math, String kor, String eng) {
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		notice();
	}
}

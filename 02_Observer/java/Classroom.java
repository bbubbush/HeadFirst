package com.bbubbush.github.observer;

public class Classroom {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		
		LSH lsh = new LSH(teacher);
		CYL cyl = new CYL(teacher);
		
		
		teacher.setRangeOfTest("1-100",	"1-20", "3-20");
	}
		
}

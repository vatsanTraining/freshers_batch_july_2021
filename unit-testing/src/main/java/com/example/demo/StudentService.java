package com.example.demo;

public class StudentService {

	
	public String allotGrade(int mark) {
		
		String grade ="O";
		if(mark<40) {
			grade ="B";
		} else if(mark>40 && mark<80) {
			grade ="A";
		}
		
		return grade;
	}
}

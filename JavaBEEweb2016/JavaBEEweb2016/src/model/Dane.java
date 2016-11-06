package model;

import java.util.ArrayList;
import java.util.List;

public class Dane {
	private List<Student> students = new ArrayList<>();

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public Dane(){
		students.add(new Student("Jane","Doe",123456,"JaneDoe.jpg"));
		students.add(new Student("John","Doe",654321,"man.jpg"));
		students.add(new Student("Anna","Kowalska",123123,"JaneDoe.jpg"));
	}
}

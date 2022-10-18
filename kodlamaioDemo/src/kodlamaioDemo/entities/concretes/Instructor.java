package kodlamaioDemo.entities.concretes;

import kodlamaioDemo.entities.abstracts.Entity;

public class Instructor implements Entity {

	private int instructorId;
	private String instructorName;
	
	public Instructor(int instructorId, String instructorName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	



}

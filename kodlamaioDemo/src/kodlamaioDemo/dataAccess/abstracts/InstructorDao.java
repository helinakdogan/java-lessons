package kodlamaioDemo.dataAccess.abstracts;

import kodlamaioDemo.entities.concretes.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);
	void update(Instructor instructor);
	void delete(Instructor instructor);
	Instructor get(int instructorId);

}

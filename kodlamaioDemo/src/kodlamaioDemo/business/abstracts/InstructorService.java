package kodlamaioDemo.business.abstracts;

import java.util.List;

import kodlamaioDemo.entities.concretes.Instructor;

public interface InstructorService {

	void add(Instructor instructor);
	List<Instructor> getAll();
}

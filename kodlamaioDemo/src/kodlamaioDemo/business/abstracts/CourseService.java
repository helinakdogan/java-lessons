package kodlamaioDemo.business.abstracts;

import java.util.List;

import kodlamaioDemo.entities.concretes.Course;

public interface CourseService {
	
	void add(Course course) throws Exception;
	List<Course> getAll();

}

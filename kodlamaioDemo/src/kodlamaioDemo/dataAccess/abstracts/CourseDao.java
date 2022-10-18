package kodlamaioDemo.dataAccess.abstracts;

import java.util.List;
import kodlamaioDemo.entities.concretes.Course;

public interface CourseDao {
	
	void add(Course course);
	void update(Course course);
	void delete(Course course);
	Course get(int courseId);
	List<Course> getList();

}

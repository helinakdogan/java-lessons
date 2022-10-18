package kodlamaioDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import kodlamaioDemo.dataAccess.abstracts.CourseDao;
import kodlamaioDemo.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile eklendi : " + course.getCourseName());	
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course get(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getList() {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course(1,"Java", 100));
		return courses;
	}

}

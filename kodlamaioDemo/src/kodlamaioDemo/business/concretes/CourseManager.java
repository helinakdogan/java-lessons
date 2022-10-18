package kodlamaioDemo.business.concretes;

import java.util.List;

import kodlamaioDemo.business.abstracts.CourseService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.CourseDao;
import kodlamaioDemo.entities.concretes.Course;

public class CourseManager implements CourseService{

	private CourseDao courseDao;
	private List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Course course)throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan az olamaz");
		}
		List<Course> courses = courseDao.getList();
		for(Course c : courses) {
			if(c.getCourseName().equals(course.getCourseName())) {
				System.out.println("Kurs ismi tekrar edemez");
				return;
			}
		}
		this.courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



}

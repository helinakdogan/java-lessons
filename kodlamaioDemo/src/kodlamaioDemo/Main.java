package kodlamaioDemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.abstracts.CategoryService;
import kodlamaioDemo.business.abstracts.CourseService;
import kodlamaioDemo.business.abstracts.InstructorService;
import kodlamaioDemo.business.concretes.CategoryManager;
import kodlamaioDemo.business.concretes.CourseManager;
import kodlamaioDemo.business.concretes.InstructorManager;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.core.concretes.DatabaseLogger;
import kodlamaioDemo.core.concretes.FileLogger;
import kodlamaioDemo.core.concretes.MailLogger;
import kodlamaioDemo.dataAccess.concretes.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.concretes.HibernateCourseDao;
import kodlamaioDemo.dataAccess.concretes.HibernateInstructorDao;
import kodlamaioDemo.entities.concretes.Category;
import kodlamaioDemo.entities.concretes.Course;
import kodlamaioDemo.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add( new DatabaseLogger());
		loggers.add(new MailLogger());
		
		CourseService courseService = new CourseManager(new HibernateCourseDao(), loggers);
		Course course1 = new Course(1, "java", 100);
		courseService.add(course1);
		System.out.println(" ");

		CategoryService categoryService = new CategoryManager(new HibernateCategoryDao(), loggers);
		Category category1 = new Category(1, "mobil programlama");
		categoryService.add(category1);
		System.out.println(" ");
		
		Category category2 = new Category(2, "web geliştirme");
		categoryService.add(category2);
		System.out.println(" ");
		
		InstructorService instructorService = new InstructorManager(new HibernateInstructorDao(), loggers);
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
		instructorService.add(instructor1);
		System.out.println(" ");

	}

}

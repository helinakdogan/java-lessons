package kodlamaioDemo.business.concretes;

import java.util.List;

import kodlamaioDemo.business.abstracts.InstructorService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Instructor instructor) {
		this.instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log("Eğitmen sisteme eklendi : " + instructor.getInstructorName());
		}
	}
	

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



}

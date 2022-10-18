package kodlamaioDemo.dataAccess.concretes;

import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile eklendi : " + instructor.getInstructorName());
		
	}

	@Override
	public void update(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Instructor instructor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Instructor get(int instructorId) {
		// TODO Auto-generated method stub
		return null;
	}



}

package kodlamaioDemo.business.abstracts;

import java.util.List;

import kodlamaioDemo.entities.concretes.Category;

public interface CategoryService {
	
	void add(Category category) throws Exception;
	List<Category> getAll();


}

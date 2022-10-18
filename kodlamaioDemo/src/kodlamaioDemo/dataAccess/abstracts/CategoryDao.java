package kodlamaioDemo.dataAccess.abstracts;

import java.util.List;

import kodlamaioDemo.entities.concretes.Category;

public interface CategoryDao {

	void add(Category category);
	void update(Category category);
	void delete(Category category);
	Category get(int categoryId);
	List<Category> getList();
}

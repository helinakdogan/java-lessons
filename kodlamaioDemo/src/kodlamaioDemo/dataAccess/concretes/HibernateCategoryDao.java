package kodlamaioDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.dataAccess.abstracts.CategoryDao;
import kodlamaioDemo.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate ile eklendi : " + category.getCategoryName());	
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category get(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getList() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1, "mobil programlama"));
		return categories;
	}

}

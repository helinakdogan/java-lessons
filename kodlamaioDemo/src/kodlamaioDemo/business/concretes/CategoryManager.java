package kodlamaioDemo.business.concretes;

import java.util.List;

import kodlamaioDemo.business.abstracts.CategoryService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.CategoryDao;
import kodlamaioDemo.entities.concretes.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	private List<Logger> loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	@Override
	public void add(Category category) throws Exception {
		List<Category> categories = categoryDao.getList();
		for (Category c : categories) {
			if (c.getCategoryName().equals(category.getCategoryName())) {
				System.out.println("Kategori ismi tekrar edemez");
				return;
			}
		}
		this.categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}





}

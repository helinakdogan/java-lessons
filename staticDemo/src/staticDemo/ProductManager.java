package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}
		else
			System.out.println("eklenemedi");
		
		
		ProductValidator validator = new ProductValidator();
		validator.bisey();
		
		
		
		
		
		/*
		ProductValidator validator = new ProductValidator();
		if(validator.isValid(product)) {
			System.out.println("eklendi");
		}
		else
			System.out.println("eklenemedi");
		*/
	}

}

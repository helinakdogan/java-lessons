package staticDemo;

public class ProductValidator { 
	
	static {
		System.out.println("static yapıcı blok çalıştı");
	}
	//static constructor
	
	
	public ProductValidator() {
		System.out.println("yapıcı blok çalıştı");
	}
	//constructor newleyince çalışır
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else
			return false;
		
	}
	
	
	public void bisey() {
		System.out.println("bi şey oldu");	
	}
	
	
	
	/*
	//main class static yapılamaz ama inner class oluşturulabilir
	public class BaskaBirClass{
		public static void sil() {
			
		}
	}
	*/

}

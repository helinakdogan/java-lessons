package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.price = 100;
		product.name = "mouse";
		product.id = 1;
		
		ProductManager manager = new ProductManager();
		manager.add(product);

		DatabaseHelper.Crud.Delete();
	}

}

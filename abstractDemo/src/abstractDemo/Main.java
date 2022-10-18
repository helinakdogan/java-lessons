package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new SqlServerDatabaseManager(); //bunu ekledik, databaseManagerın hangisi olduğunu belirlemem gerekiyor ki onun getData()'sı çalışsın 
		customerManager.getCustomers(); //sadece bununla çalışmaz çünkü abstract sınıfın içindeki metot çalışmaz, boş metot

	}

}

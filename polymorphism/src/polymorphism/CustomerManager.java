package polymorphism;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		this.baseLogger = logger;
	}
	
	public void add() {
		System.out.println("müşteri eklendi");
		this.baseLogger.log("log mesajı");
	}

}

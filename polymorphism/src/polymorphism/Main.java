package polymorphism;

public class Main {

	public static void main(String[] args) {
		ConsoleLogger clogger = new ConsoleLogger();
		clogger.log("hi");
		
		//polymorphism sayesinde hepsini BaseLogger türünden yazabildik
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new ConsoleLogger(), new DatabaseLogger()};
		for(BaseLogger logger : loggers) {
			logger.log("hello");
		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	
}
}

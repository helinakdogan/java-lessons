package kodlamaioDemo.core.concretes;

import kodlamaioDemo.core.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı : " + data);
	}

}

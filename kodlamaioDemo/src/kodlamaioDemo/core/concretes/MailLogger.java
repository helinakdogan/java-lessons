package kodlamaioDemo.core.concretes;

import kodlamaioDemo.core.abstracts.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Maile loglandı : " + data);
	}

}

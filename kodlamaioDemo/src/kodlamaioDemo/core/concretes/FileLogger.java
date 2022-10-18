package kodlamaioDemo.core.concretes;

import kodlamaioDemo.core.abstracts.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);	
	}

}

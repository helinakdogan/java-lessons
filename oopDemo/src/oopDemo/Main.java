package oopDemo;

import oopDemo.business.concretes.CustomerManager;
import oopDemo.business.concretes.MilitaryCreditManager;
import oopDemo.entities.abstracts.Customer;

public class Main {

	public static void main(String[] args) {
		
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();

	}

}

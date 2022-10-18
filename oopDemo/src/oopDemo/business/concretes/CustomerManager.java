package oopDemo.business.concretes;

import oopDemo.business.abstracts.ICreditManager;
import oopDemo.entities.abstracts.Customer;

public class CustomerManager{

    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ICreditManager getCreditManager() {
		return creditManager;
	}

	public void setCreditManager(ICreditManager creditManager) {
		this.creditManager = creditManager;
	}

	public void  save(){
        System.out.println("müşteri kaydedildi");
    }
	
    public void  delete(){
        System.out.println("müşteri silindi");
    }

    public void  giveCredit(){
        creditManager.calculate();
        System.out.println("kredi verildi");
        creditManager.save();
    }
}

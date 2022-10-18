package oopDemo.entities.concretes;

import oopDemo.entities.abstracts.Customer;

public class Company extends Customer{
	
    public String taxNumber;
    public String companyName;
    
	public Company(String taxNumber, String companyName) {
		super();
		this.taxNumber = taxNumber;
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
    
    

   
    
}

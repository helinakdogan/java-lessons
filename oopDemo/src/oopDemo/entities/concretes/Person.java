package oopDemo.entities.concretes;

import oopDemo.entities.abstracts.Customer;

public class Person extends Customer {
    public String nationalIdentity;
    public String lastName;
    public String firstName;

    public Person(String nationalIdentity, String lastName, String firstName) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    
}

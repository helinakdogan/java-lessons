package oopDemo.business.concretes;

import oopDemo.business.abstracts.ICreditManager;
import oopDemo.entities.abstracts.Customer;

public class TeacherCreditManager extends Customer implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("öğretmen kredisi hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("Öğretmen kredisi kaydedildi");
    }
}

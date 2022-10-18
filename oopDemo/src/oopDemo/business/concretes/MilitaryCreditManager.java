package oopDemo.business.concretes;

import oopDemo.business.abstracts.ICreditManager;
import oopDemo.entities.abstracts.Customer;

public class MilitaryCreditManager extends Customer implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("asker kredisi hesaplandı");
    }

    @Override
    public void save() {
        System.out.println("asker kredisi kaydedildi");
    }
}

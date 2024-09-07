package org.example.segregation;

public class ManagerOperations implements Manager{

    @Override
    public void hire() {
        System.out.println("The manager is hiring ...");
    }

    @Override
    public void train() {
        System.out.println("The manager is training ...");
    }

    @Override
    public void addBonus() {
        System.out.println("The manager add Bonus ...");
    }

    @Override
    public void salary() {
        System.out.println("The manager is paid ...");
    }
}

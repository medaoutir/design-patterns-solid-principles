package org.example.segregation;

public class CeoOperations implements Ceo{
    @Override
    public void makeDecisions() {
        System.out.println("CEO has make decision ...");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO add stocks ...");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO add Bonus ...");
    }

    @Override
    public void salary() {
        System.out.println("CEO is paid ...");
    }
}

package org.example.segregation;

public class EmployeeOperationClient {

    public static void main(String[] args) {
        Ceo ceoOperations = new CeoOperations();
        ceoOperations.addBonus();
        ceoOperations.makeDecisions();
        ceoOperations.addStocks();
        ceoOperations.salary();
    }
}

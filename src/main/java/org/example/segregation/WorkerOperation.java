package org.example.segregation;

public class WorkerOperation implements Worker{
    @Override
    public void salary() {
        System.out.println("The worker is paid ...");
    }
}

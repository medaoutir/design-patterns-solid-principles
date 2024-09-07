package org.example.observer;

public class StockProcessor {
    public static void main(String[] args) {
        StockExchange exchange = new StockExchange();
        InstitutionSub subscriber = new InstitutionSub(exchange);
        exchange.start();
    }
}

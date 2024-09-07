package org.example.observer;

public class InstitutionSub implements Subscriber {

    private float stockPrice;
    private Publisher publisher;

    public InstitutionSub(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void notify(float stockPrice) {
        this.stockPrice = stockPrice;
        handleStockPrice(stockPrice);
    }

    private void handleStockPrice(float stockPrice) {
        String stock = String.format("%s$", stockPrice);
        if (stockPrice < 95) {
            System.out.println("buying that given stock: " + stock);
        } else if (stockPrice > 105) {
            System.out.println("Selling that given stock: " + stock);
        }
    }
}

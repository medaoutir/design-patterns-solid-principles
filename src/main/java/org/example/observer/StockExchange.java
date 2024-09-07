package org.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Publisher {

    private List<Subscriber> subscribers;
    private float price = 100;
    private Random random;

    public StockExchange() {
        this.subscribers = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.notify(this.price));
    }

    public void setPrice(float price) {
        this.price = price;
        notifySubscribers();
    }

    public void start() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                price += 2 * random.nextFloat() - 1;
                setPrice(price);
            }
        }
    }
}

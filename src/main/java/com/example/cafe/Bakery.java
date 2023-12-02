package com.example.cafe;

public class Bakery extends Menu {

    public Bakery(int id, String name, double price) {
        super(id, name, price);
    }

    public Bakery(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}


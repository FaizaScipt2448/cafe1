package com.example.cafe;

public class Coffee extends Menu{

    public Coffee(int id, String name, double price)
    {
        super(id, name, price);
    }

    public Coffee(String name, double price, int quantity)
    {
        super(name, price, quantity);
    }

}

package com.example.cafe;



public class Menu {

    private String name;
    private double price;
    private int id;
    private int quantity;

    public Menu()
    {}

    public Menu(String name)
    {
        this.name = name;
    }

    public Menu(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public Menu(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

}


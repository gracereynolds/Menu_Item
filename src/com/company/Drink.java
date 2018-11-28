package com.company;

public class Drink implements MenuItem {
    private double price;
    private String name;
    public Drink(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public double getPrice()
    {
        return price;
    }
}

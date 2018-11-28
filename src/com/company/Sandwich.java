package com.company;

public class Sandwich implements MenuItem {
    private double price;
    private String name;
    public Sandwich(String name, double price)
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

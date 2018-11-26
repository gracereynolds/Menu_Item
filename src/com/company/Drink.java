package com.company;

public class Drink implements MenuItem {
    private int price;
    private String name;
    public Drink(String name, int price)
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
    public int getPrice()
    {
        return price;
    }
}

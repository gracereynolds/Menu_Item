package com.company;

public class Trio implements MenuItem {
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    public Trio (Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    @Override
    public String getName()
    {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }
    @Override
    public double getPrice()
    {
        double p1= 0, p2 = 0;
        double san = sandwich.getPrice();
        double sal = salad.getPrice();
        double dr = drink.getPrice();
        if (san > sal && san > dr)
        {
            p1 = san;
            if(sal > dr)
            {
                p2 = sal;
            } else {
                p2 = dr;
            }
        } else if (sal > san && sal > dr) {
            p1 = sal;
            if (san > dr)
            {
                p2 = san;
            }
            else {
                p2 = dr;
            }
        } else if (dr > san && dr > sal) {
            p1 = dr;
            if (san > sal)
            {
                p2 = san;
            }
            else {
                p2 = sal;
            }
        }
        return p1 + p2;
    }

}

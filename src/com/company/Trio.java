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
    public int getPrice()
    {
        int p1, p2;
        int san = sandwich.getPrice();
        int sal = salad.getPrice();
        int dr = drink.getPrice();
        if (san > sal && san > dr)
        {
            p1 = san;
            if(sal > dr)
            {
                p2 = sal;
            } else {
                p2 = dr;
            }
        }
        if (sal > san && sal > dr)
        {
            p1 = sal;
            if (san > dr)
            {
                p2 = san;
            }
            else
        }
    }

}

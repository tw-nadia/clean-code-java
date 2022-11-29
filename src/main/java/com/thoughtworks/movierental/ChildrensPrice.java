package com.thoughtworks.movierental;

public class ChildrensPrice extends Price {
    @Override
    public double getCost(int daysRented) {
        double cost = 1.5;
        if (daysRented > 3)
            cost += (daysRented - 3) * 1.5;
        return cost;
    }

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}

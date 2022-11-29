package com.thoughtworks.movierental;

public class RegularPrice extends Price {
    @Override
    public double getCost(int daysRented) {
        double cost =2;
        if (daysRented > 2)
            cost += (daysRented - 2) * 1.5;
        return cost;
    }

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}

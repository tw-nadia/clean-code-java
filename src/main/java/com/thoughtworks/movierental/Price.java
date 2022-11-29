package com.thoughtworks.movierental;

public abstract class Price {

    public abstract double getCost(int daysRented);
    public abstract int getPriceCode();

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}

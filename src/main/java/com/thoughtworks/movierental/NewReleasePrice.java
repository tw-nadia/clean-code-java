package com.thoughtworks.movierental;

public class NewReleasePrice extends Price{
    @Override
    public double getCost(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}

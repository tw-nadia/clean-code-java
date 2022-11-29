package com.thoughtworks.movierental;

public class BluRayPrice extends Price{
    @Override
    public double getCost(int daysRented) {
        return 4 * daysRented;
    }

    @Override
    public int getPriceCode() {
        return Movie.BLURAY;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 3;
    }
}

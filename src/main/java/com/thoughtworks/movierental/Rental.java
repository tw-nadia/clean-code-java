package com.thoughtworks.movierental;

public class Rental {

    private int daysRented;
    Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
    public double getCost() {
        return movie.getCost( daysRented);
    }

}
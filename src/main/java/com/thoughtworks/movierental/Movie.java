package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int BLURAY = 3;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case BLURAY:
                this.price = new BluRayPrice();
        }
    }

    public String getTitle() {
        return title;
    }

    double getCost(int daysRented) {
        return price.getCost(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
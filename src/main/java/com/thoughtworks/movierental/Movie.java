package com.thoughtworks.movierental;

public class Movie {

    private String title;
    private Category category;

    public Movie(String title, Category category) {
        this.title = title;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    double getCost( int daysRented) {
        return category.getCost(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return category.getFrequentRenterPoints(daysRented);
    }

}
package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        for (Rental rental : rentals) {
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(rental.getCharge()).append("\n");
        }

        //add footer lines result
        result.append("Amount owed is ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    public String htmlStatement() {
        StringBuilder result = new StringBuilder("<h1>Rental Record for " + getName() + "</h1><p>\n");
        for (Rental rental : rentals) {
            result.append(rental.getMovie().getTitle()).append(":").append(rental.getCharge()).append("<br>\n");
        }

        //add footer lines result
        result.append("<p> Amount owed is ").append(getTotalCharge()).append("<p>\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points<p>");
        return result.toString();
    }

    private double getTotalCharge(){
        double result =0;
        for (Rental rental: rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());
        }
        return result;
    }




}


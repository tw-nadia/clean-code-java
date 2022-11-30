package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        for (Rental rental : rentals) {
            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(rental.getCost())
                    .append("\n");
        }
        //add footer lines result
        result.append("Amount owed is ")
                .append(getTotalCost())
                .append("\n");
        result.append("You earned ")
                .append(getTotalFrequentRenterPoints())
                .append(" frequent renter points");
        return result.toString();
    }

    public String htmlStatement() {
        StringBuilder result = new StringBuilder("<h1>Rental Record for <b>" + getName() + "</b></h1>");
        for (Rental rental : rentals) {
            result.append("<p>")
                    .append(rental.getMovie().getTitle())
                    .append("<b>")
                    .append(rental.getCost())
                    .append("</b></p></br>");
        }
        //add footer lines result
        result.append("<p>Amount owed is <b>")
                .append(getTotalCost())
                .append("</b></p></br>");
        result.append("<p>You earned <b>")
                .append(getTotalFrequentRenterPoints())
                .append("</b> frequent renter points</p></br>");
        return result.toString();
    }

    private double getTotalCost(){
        double totalCost =0;
        for (Rental rental : rentals){
            totalCost += rental.getCost();
        }
        return totalCost;
    }

    private int getTotalFrequentRenterPoints(){
        int frequentRenterPoints =0;
        for (Rental rental : rentals) {
            frequentRenterPoints +=
                    rental.getFrequentRenterPoints(rental.getDaysRented());
        }
        return frequentRenterPoints;
    }




}


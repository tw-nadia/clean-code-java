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

    public static String statement(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
        for (Rental rental : customer.rentals) {
            double rentalAmount = rental.getCostAmount();

            frequentRenterPoints += rental.movie.getFrequentRenterPoints(rental.getDaysRented());

            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(rentalAmount).append("\n");
            totalAmount += rentalAmount;
        }

        //add footer lines result
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result.toString();
    }




}


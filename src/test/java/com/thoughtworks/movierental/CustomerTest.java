package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void noMoviesTest() {

        Customer testCustomer = new Customer("Sam");
        System.out.println(testCustomer.statement());
        String expected = "Rental Record for Sam\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";

        Assert.assertEquals(expected, testCustomer.statement());
    }
    @Test
    public void oneMovieTest() {
        Movie testMovie = new Movie("Avatar", 1);
        Rental testRental = new Rental(testMovie,2);
        Customer testCustomer = new Customer("Sam");
        testCustomer.addRental(testRental);
        System.out.println(testCustomer.statement());
        String expected = "Rental Record for Sam\n" +
                "\tAvatar\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";


        Assert.assertEquals(expected, testCustomer.statement());
    }

}
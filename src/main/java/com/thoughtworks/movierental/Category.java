package com.thoughtworks.movierental;

public enum Category {
    CHILDRENS {
        @Override
        double getCost(int daysRented) {
            double cost = 1.5;
            if (daysRented > 3)
                cost += (daysRented - 3) * 1.5;
            return cost;
        }
    },
    REGULAR {
        @Override
        double getCost(int daysRented) {
            double cost = 2;
            if (daysRented > 2)
                cost += (daysRented - 2) * 1.5;
            return cost;
        }
    },
    NEW_RELEASE {
        @Override
        double getCost(int daysRented) {
            return daysRented * 3;
        }

        @Override
        int getFrequentRenterPoints(int daysRented) {
            return (daysRented > 1) ? 2 : 1;
        }
    },
    BLURAY {
        @Override
        double getCost(int daysRented) {
            return daysRented * 4;
        }

        @Override
        int getFrequentRenterPoints(int daysRented) {
            return 3;
        }
    };

    abstract double getCost(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
package com.careerDevs;

// 2. Create a Fruit class that inherits from the Product class that contain fruit specific data.

public class Fruit extends Product {

    public String color;

    public Fruit(String type, boolean inStock, double price, String color) {

        super(type, inStock, price);
        this.color = color;

    }

    public String toString() {

        return "The stock of " + color + " " + type + " is " + inStock + " they are priced at " + pricePerPound + " per pound.";
    }

}

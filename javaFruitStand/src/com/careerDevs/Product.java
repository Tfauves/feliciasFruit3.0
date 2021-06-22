package com.careerDevs;

//  1. Create a Product class this should contain data that any item she sells will have

public class Product {

    public String type;
    public boolean inStock;
    public double pricePerPound;


    public Product(String type, boolean inStock, double pricePerPound) {

        this.type = type;
        this.inStock = inStock;
        this.pricePerPound = pricePerPound;
    }

    public String toString() {

       return "The stock of " + type + " is " + inStock + " they are priced at " + pricePerPound + " per pound.";
    }
}

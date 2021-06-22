package com.careerDevs;

//        3. Create a Meat class that inherits from the product class that contains Meat specific data.

public class Meat extends Product {

    public boolean isMarinated;

    public Meat(String type, double price, boolean inStock, boolean isMarinated) {
        super(type, inStock, price);
        this.isMarinated = isMarinated;
    }

    public String toString() {

        return "The stock of " + type + " is " + inStock + " they are priced at " + pricePerPound + " per pound.";
    }

}

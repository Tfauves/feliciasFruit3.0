package com.careerDevs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//
//        Fruit apples = new Fruit("apple", true, 0.49, "red");
//        Fruit lime = new Fruit("lime", true, 0.89, "green");
//        Fruit pear = new Fruit("pear", true, 0.55, "gold");
//
//
//        Meat steak = new Meat("steak tips", 8.99, false, true);
//        Meat chicken = new Meat("chicken wings", 2.27, true, false);
//        Meat groundBeef = new Meat("ground beef", 4.17, true, false);

        List<Product> myProduct = new ArrayList<>();

        myProduct.add(new Fruit("apples", true, 0.59, "red"));
        myProduct.add(new Fruit("limes", true, 0.38, "green"));
        myProduct.add(new Fruit("pears", false, .85, "gold"));
        myProduct.add(new Meat("steak tips", 6.49, true, true));
        myProduct.add(new Meat("chicken wings", 2.27, false, false ));
        myProduct.add(new Meat("ground beef", 4.17, true, false));

//        for(Product myProduce : myProduct) {
//
//            System.out.println(myProduce);
//
//        }

        displayList(myProduct);

    }

    public static void displayList(List<Product> produceList){

        for (int i = 0; i < produceList.size(); i++) {

            System.out.println(produceList.get(i));

        }

    }



}
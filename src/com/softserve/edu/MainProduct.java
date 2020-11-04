package com.softserve.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProduct {
    public static void main(String[] args) {
    ArrayList <Product> products = new ArrayList<>();
    products.add(new Product("Milk", 20, 100));
    products.add(new Product("Cheese", 50, 120));
    products.add(new Product("Yogurt", 30, 110));
    Product product = Collections.max(products,
            Comparator.comparing(s -> s.getPrice()));
        System.out.println("The most expensive is " + product.getName()
                + " with quantity " + product.getQuantity());
    Product product1  = Collections.max(products,
            Comparator.comparing(s -> s.getQuantity()));
        System.out.println("An item with the biggest quantity is " + product1.getName());


    }
}

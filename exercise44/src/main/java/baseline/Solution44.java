package baseline;
import com.google.gson.*;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that takes a product name as input
// and retrieves the current price and quantity for that product.
//Print out the product name, price, and quantity if the product is found.
// If no product matches the search, state that no product was found and start over.
public class Solution44 {
    public static void main(String[] args) {
        Solution44 myApp = new Solution44();
        //call a method called getProduct, which asks for the name of the product.
        String name = myApp.getProduct();
        //call a method called isProduct, which determines if the product is in the inventory.
        boolean itemIsFound = myApp.isProduct();
        //using a while loop, while !itemIsFound is true, keep asking for user input.
        //once the item name is found, print out the data of the item: the name, how much of the item
        //there is, and the price.
    }
    private String getProduct() {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return user input.
        return "";
    }
    public boolean isProduct() {
        //take in one input: the name of the item.
        //create a fileReader that reads through the file.
        //using Json, find the name of the object in the input file.
        //if the user input is found, return true.
        //otherwise, return false.
        return false;
    }
}

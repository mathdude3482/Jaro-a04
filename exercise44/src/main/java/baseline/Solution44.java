package baseline;
import com.google.gson.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
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
    static String name = "";
    static double price = 0.0;
    static int quantity = 0;
    public static void main(String[] args) throws FileNotFoundException {
        String nameofItem = "";
        //call a method called getProduct, which asks for the name of the product.
        nameofItem = getProduct("What is the product name?");
        //call a method called isProduct, which determines if the product is in the inventory.
        boolean itemIsFound = isProduct(nameofItem);
        //using a while loop, while !itemIsFound is true, keep asking for user input.
        while (!itemIsFound){
            System.out.println("Sorry, that product was not found in our inventory.");
            nameofItem = getProduct("What is the product name?");
            itemIsFound = isProduct(nameofItem);
        }
        //once the item name is found, print out the data of the item: the name, how much of the item
        //there is, and the price.
        System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d ", name,price,quantity);
    }
    //take in one parameter: the prompt.
    private static String getProduct(String prompt) {
        Scanner in = new Scanner(System.in);
        //print out the prompt.
        System.out.print(prompt);
        //return user input.
        return in.nextLine();
    }
    public static boolean isProduct(String nameofItem) throws FileNotFoundException {
        //take in one input: the name of the item.
        //create a fileReader that reads through the file.
        JsonParser myParser = new JsonParser();
        FileReader myFilePath = new FileReader("data/exercise44_input.json");
        //using Json, find the name of the object in the input file.
        Object myobject = myParser.parse(myFilePath);
        JsonObject myJsonobj = (JsonObject)myobject;
        JsonArray myProduct = (JsonArray)myJsonobj.get("products");
        Iterator<JsonElement> myIterator = myProduct.iterator();
        boolean determine = false;
        //if the user input is found, return true.
        for(int x = 0; x < myProduct.size(); x++){
            JsonObject temp = (JsonObject)myIterator.next();
            String tempname = temp.get("name").toString();
            tempname = tempname.replace("\"","");
            double tempprice = Double.parseDouble(temp.get("price").toString());
            int tempQuantity = Integer.parseInt(temp.get("quantity").toString());
            if(nameofItem.compareToIgnoreCase(tempname) == 0){
                name = tempname;
                price = tempprice;
                quantity = tempQuantity;
                determine = true;
                break;
            }
        }
        //return the value of determine.
        return determine;
    }
}

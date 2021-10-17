package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Construct a program that reads in the following data file
//and processes the records and display the results
// formatted as a table, evenly spaced, as shown in the example output.
public class Solution42 {
    //these arrayLists will be used to store individual data.
    private final List <String> info = new ArrayList<>();
    private final List <String> firstName = new ArrayList<>();
    private final List <String> lastName = new ArrayList<>();
    private final List<String> salary = new ArrayList<>();
    public static void main(String[] args) {
        Solution42 myApp = new Solution42();
        Scanner fileName = null;
        //try finding the path as specified. If not found, catch an exception.
        try{
            fileName = new Scanner(new File("data/exercise42_input.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //take in a file called exercise42_input and call a method called setInfo to read it.
        myApp.setInfo(fileName);
        //call a method called setData to store the data into their respective lists.
        myApp.setData();
        //call a method called display to display the data in a tabular format.
        myApp.display();
    }
    public void setInfo(Scanner nameofFile){
        //read in information from the file and store them into an arrayList called info.
        while(nameofFile.hasNext()){
            info.add(nameofFile.nextLine());
        }
    }
    private void setData(){
        //using a for each loop, split the arrayList by commas and store their respective values into
        //seperate array lists.
        for (String data: info){
            //split the data at the commas.
            String[] temp = data.split(",");
            //add the data to their respective lists.
            lastName.add(temp[0]);
            firstName.add(temp[1]);
            salary.add(temp[2]);
        }
    }
    private void display(){
        //display the data from the file in a tabular format.
        int length = info.size();
        System.out.printf("%-10s %-10s %s", "Last", "First", "Salary");
        System.out.println("\n-----------------------------");
        for (int x = 0; x < length; x++){
            System.out.printf("%-10s %-10s %s%n", lastName.get(x), firstName.get(x), salary.get(x));
        }
    }
}

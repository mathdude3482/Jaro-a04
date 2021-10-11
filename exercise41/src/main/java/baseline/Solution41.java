package baseline;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that reads in the following list of names from a file called exercise41_input.txt
//and sorts the list alphabetically.
//Don't hard-code the number of names.
public class Solution41 {
    public static void main(String[] args) {
        Solution41 app = new Solution41();
        //take in a file called exercise41_input and read it.
        File input = new File("exericse41_input.txt");
        //call a method called getOutput that returns the output file.
        File output = app.getOutPut(input);
        //print the output file.
    }

    private File getOutPut(File input) {
        //take in a file.
        File output = input;
        //call a method called sortByLastName to organize the names.
        File revisedOutput = sortByLastName(output);
        //print it to the output file.
        //return the output file.
        return null;
    }

    private File sortByLastName(File output) {
        //take in the output file.
        //read the file.
        //reorganize the file so that it is sorted by last name.
        //return the reorganized file.
        return null;
    }
}

package baseline;

import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that generates a website skeleton with the following specifications:
//
//    Prompt for the name of the site.
//    Prompt for the author of the site.
//    Ask if the user wants a folder for JavaScript files.
//    Ask if the user wants a folder for CSS files.
//    Generate an index.html file that contains the name of the site inside the <title> tag
//    and the author in a <meta> tag.
public class Solution43 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        Solution43 myApp = new Solution43();
        Create things = new Create();
        //ask for the name of the site and the author of the site.
        String name = myApp.setName("Site name: ");
        String authorName = myApp.setAuthorName("Author name: ");
        //ask if the user wants a folder for javascript.
        System.out.println("Do you want a folder for javascript? ");
        //ask if the user wants a folder for CSS.
        System.out.println("Do you want a folder for CSS?");
        //set the path for the folders and files.
    }
    private String setName(String prompt) {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return user input.
        return "";
    }
    private String setAuthorName(String prompt) {
        //take in one parameter: the prompt.
        //print out the prompt.
        //return user input.
        return "";
    }
    private String setDataPath(){
        //take in no parameters.
        //return the path needed for the files.
        return "";
    }
}

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
    public static void main(String[] args) throws IOException {
        Scanner answer = new Scanner(System.in);
        Solution43 myApp = new Solution43();
        Create websiteInfo = new Create();
        //ask for the name of the site and the author of the site.
        String name = myApp.setName("Site name: ");
        String authorName = myApp.setAuthorName("Author name: ");
        //ask if the user wants a folder for javascript.
        char jsAnswer;
        char csAnswer;
        System.out.println("Do you want a folder for javascript? ");
        jsAnswer = answer.next().charAt(0);
        //ask if the user wants a folder for CSS.
        System.out.println("Do you want a folder for CSS?");
        csAnswer = answer.next().charAt(0);
        //set the path for the folders and files.
        String createPath = "data";
        String websiteName = websiteInfo.createWebsiteName(createPath, name);
        String htmlWebsite = websiteInfo.createHTMLWebsite(createPath,name);
        websiteInfo.createFolder(createPath);
        websiteInfo.createFolder(websiteName);
        websiteInfo.createHTML(name,authorName,htmlWebsite);
        websiteInfo.createJSWebsite(jsAnswer,websiteName);
        websiteInfo.createCSSWebsite(csAnswer, websiteName);
    }
    private String setName(String prompt) {
        Scanner websiteName = new Scanner(System.in);
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.print(prompt);
        //return user input.
        return websiteName.nextLine();
    }
    private String setAuthorName(String prompt) {
        Scanner author = new Scanner(System.in);
        //take in one parameter: the prompt.
        //print out the prompt.
        System.out.print(prompt);
        //return user input.
        return author.nextLine();
    }
}

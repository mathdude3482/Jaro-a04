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
//Create a program that reads in the following list of names from a file called exercise41_input.txt
//and sorts the list alphabetically.
//Don't hard-code the number of names.
public class Solution41 {
    public void readnames(Scanner fileName, List<String> names){
        //read in the names from the file.
        while(fileName.hasNext()){
            //add the current line to the list of names.
            names.add(fileName.nextLine());
        }
    }
    public List <String> organizeName(List <String> names){
        //use collections sort to sort names by the last name.
        names.sort(String.CASE_INSENSITIVE_ORDER);
        //return the organized list.
        return names;
    }
    public static void main(String[] args){
        Solution41 app = new Solution41();
        //take in a file called exercise41_input and read it.
        Scanner fileName = null;
        //try finding the path as specified. if not found, catch an exception.
        try{
            fileName = new Scanner(new File("data/exercise41_input.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        List<String> names = new ArrayList<>();
        //ensure the fileName is not empty.
        assert fileName != null;
        app.readnames(fileName, names);
        System.out.println("Total of " + names.size() + " names");
        System.out.println("-----------------");
       List <String> revisedNames = app.organizeName(names);
        for (String x: revisedNames){
            System.out.println(x);
        }
        //close the file.
        fileName.close();
    }
}

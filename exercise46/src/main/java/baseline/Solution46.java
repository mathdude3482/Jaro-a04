package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that reads in a file named exercise46_input.txt
// and counts the frequency of words in the file. Then
// construct a histogram displaying the words and the frequency,
// and display the histogram to the screen.
public class Solution46 {
    private static List<String> word = new ArrayList<>();
    private static List<String> frequentword= new ArrayList<>();
    private static List<Integer> frequencyvalue= new ArrayList<>();
    private static List<String> stringFrequency = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        //create a method called findWord, which will call other helper methods to
        //count the frequency of words and print out the result as a histogram.
        Solution46 myApp = new Solution46();
        myApp.findWord();
    }

    public void findWord() throws FileNotFoundException {
        //take in no parameters.
        //declare a File object called filePath that refers to the path of the input file.
        File filePath = new File("data/exercise46_input.txt");
        //create a new Scanner that reads in the input file.
        Scanner myScanner = new Scanner(filePath);
        //using a while loop, read the file. Add any words found into a list called word.
        while(myScanner.hasNext())
        {
            word.add(myScanner.next());
        }
        //using a for loop, add the elements of word into a list called frequentWord.
        for (int x = 1; x < word.size(); x++){
            //if the frequent word list does not contain anything from the list of words,
            //then add it to the frequent word list.
            if(!(frequentword.contains(word.get(x)))){
                frequentword.add(word.get(x));
            }
        }
        //call a method called findFrequency to find out how many times each word pops up.
        findFrequency();
    }
    private void findFrequency(){
        //take in no parameters.
        int counter = 0;
        //use a nested for loop.
        //the first for loop runs from 0 to the size of frequentWord.
        for (int a = 0; a < frequentword.size(); a++){
            //the second for loop runs from 0 to the size of word.
            for(int b = 0; b < word.size(); b++)
            {
                //compare an element from word and an element from frequentWord.
                //if they are the same, increment a count counter by one.
                if (frequentword.get(a).compareTo(word.get(b)) == 0)
                {
                    counter += 1;
                }
            }
            //add the value of count to an integer list called frequencyvalue.
            frequencyvalue.add(counter);
            //reset count to 0.
            counter = 0;
        }
        //for each value in the frequencyvalue list, add it to the stringFrequency list.
        for(int x: frequencyvalue)
            stringFrequency.add(String.valueOf(x));
        //call sort and getIndex methods.
        sort();
        getIndex();
    }
    private void sort(){
        //sort the array by greatest to least.
        Collections.sort(frequencyvalue, Collections.reverseOrder());
    }
    private int findBiggestWord(){
        //this function will calculate the length of the largest word.
        int maxLength = frequentword.get(0).length();
        for (int i = 1; i < frequentword.size(); i++){
            maxLength = (frequentword.get(i).length() > maxLength) ?
                    frequentword.get(i).length() : maxLength;
        }
        return maxLength;
    }
    private void getIndex(){
        int index = 0;
        List<Integer> temp = new ArrayList<>();
        for (int j = 0; j < frequencyvalue.size(); j++){
            if (temp.contains(index)) {
                //the index is equal to whatever is in index j of frequencyvalue.
                index = stringFrequency.indexOf(String.valueOf(frequencyvalue.get(j)));
            }
            display(index);
            temp.add(index);
        }
    }
    private void display(int index){
        //print out the result as a histogram.
        int largestWord = findBiggestWord();
        System.out.printf("%s:", frequentword.get(index));
        int currentLength = (largestWord - frequentword.get(index).length()) + 1;
        String spaceformat = String.format("%" + currentLength + "s", " ");
        System.out.format(spaceformat);
        int value = Integer.parseInt(stringFrequency.get(index));
        for (int j = 0; j < value; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

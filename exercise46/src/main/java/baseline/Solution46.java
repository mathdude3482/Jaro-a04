package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Create a program that reads in a file named exercise46_input.txt
// and counts the frequency of words in the file. Then
// construct a histogram displaying the words and the frequency,
// and display the histogram to the screen.
public class Solution46 {
    public static void main(String[] args) {
        //create a method called findWord, which will call other helper methods to
        //count the frequency of words and print out the result as a histogram.
        Solution46 myApp = new Solution46();
        myApp.findWord();
    }

    public void findWord() {
        //take in no parameters.
        //declare a File object called filePath that refers to the path of the input file.
        //create a new Scanner that reads in the input file.
        //using a while loop, read the file. Add any words found into a list called word.
        //using a for loop, add the elements of word into a list called frequentWord.
        //call a method called findFrequency to find out how many times each word pops up.
        findFrequency();
    }
    private void findFrequency(){
        //take in no parameters.
        //use a nested for loop.
        //the first for loop runs from 0 to the size of frequentWord.
        //the second for loop runs from 0 to the size of word.
        //compare an element from word and an element from frequentWord.
        //if they are the same, increment a count counter by one.
        //add the value of count to an integer list called frequencyvalue.
        //reset count to 0.
    }
    private void sort(){
        //sort the array by greatest to least.
    }
    private void print(int index){
        //print out the result as a histogram.
    }
}

package baseline;

import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 James Jaro
 */
//Given an input file named exercise45_input.txt,
// read the file and look for all occurrences of the word utilize. Replace each occurrence with use.
// Write the modified file to a new file.
public class Solution45 {
    public static void main(String[] args) throws IOException{
        Solution45 myApp = new Solution45();
        String filePath = "data/exercise45_input.txt";
        //call a method called modifyFile that will modify the input file.
        myApp.modifyFile(filePath, "utilize", "use");
    }
    public void modifyFile(String filePath, String oldString, String newString) throws IOException {
        //take in three parameters: the path of the file, the old string that will be replaced,
        //and the new string that will replace the old string.
        File file = new File(filePath);
        StringBuilder oldVersion = new StringBuilder();
        BufferedReader reader;
        FileWriter writer = null;
        //go through the file and read each line.
        reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        //for each line, if there is an instance of oldString, replace it with newString.
        while (line != null){
            oldVersion.append(line).append(System.lineSeparator());
            line = reader.readLine();
            String newVersion = oldVersion.toString().replaceAll(oldString, newString);
            writer = new FileWriter("data/exercise45_output.txt");
            writer.write(newVersion);
        }
        reader.close();
        if(writer != null)
            writer.close();
        //write the new output to a new file.
    }
}

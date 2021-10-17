package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    private static final String FIRST_PART = "Created ";
    public String createWebsiteName(String path, String name){
        //take in two parameters: The path of the file and the name of the site.
        //return the website itself.
        return path + "/website/" + name;
    }
    public String createHTMLWebsite(String path, String name){
        //take in two parameters: the path of the file and the name of the site.
        //return the html website.
        return path + "/website/" + name + "/index.html";
    }
    public void createJSWebsite(char input, String path){
        //take in two parameters: an input character and the path of the file.
        //if the user input is y or Y (yes), then modify the file's path and create a new folder.
        if (input == 'y' || input == 'Y'){
            path = path + "/js/";
            createFolder(path);
        }
        //otherwise, do nothing.
    }
    public void createCSSWebsite(char input, String path){
        //take in two parameters: an input character and the path of the file.
        //if the user input is y or Y (yes), then modify the file's path and create a new folder.
        if (input == 'y' || input == 'Y'){
            path = path + "/css/";
            createFolder(path);
        }
        //otherwise, do nothing.
    }
    public void createFolder(String path){
        //take in one parameter: the path.
        //create a new file object.
        File newFile = new File(path);
        //create the directory.
        if(newFile.mkdirs())
            System.out.println(FIRST_PART + path);
    }
    public void createHTML(String siteName, String authorName, String path) throws IOException{
        //take in three parameters: the siteName, the authorName, and the path.
        //create a new file.
        File newFile = new File(path);
        //call writeHTMLInput for the information.
        writeHTMLinput(siteName, authorName, path);
        if(newFile.isFile())
            System.out.println(FIRST_PART + path);
    }
    private void writeHTMLinput(String name, String author, String path) throws IOException{
        //take in three parameters: the name of the website, the author's name, and the path.
        //create a HTML string to include the meta and title tags.
        String html = "<div><title>" + name+"</title><h1><meta> " + author +"</meta></h1></div>";
        //create a new file.
        File newFile = new File(path);
        //in a try-catch block, write to the new file.
        try(BufferedWriter myWriter = new BufferedWriter(new FileWriter(newFile))){
            myWriter.write(html);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

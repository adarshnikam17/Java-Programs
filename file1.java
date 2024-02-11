package com.company;


import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String[] args)
    {
        File myFile = new File("file1.txt");
        try{
            myFile.createNewFile();
        }catch(IOException e){
            System.out.println("unable to creat this file");
            e.printStackTrace();
        }
    }
}

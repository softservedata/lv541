package com.softserve.edu.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        String [] s = new String[fileName.length()];
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("File was opened");
            for (String strings : s) {
                System.out.println(strings);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

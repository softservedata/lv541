package com.softserve.edu.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String s [] = {"name", "khrystyna,", "date", "25.01.1999"};
        int i [] = {2, 4, 6, 7};
        byte [] b = {3, 6, 7};
        String fileName = "file1.txt";
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            System.out.println("File was opened");
            fileOutputStream.write(b);
            fileOutputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}

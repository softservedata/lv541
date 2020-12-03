package com.softserve.edu.thread;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("aaaaaaaaa");
        fileWriter.close();
        //
        FileReader fileReader = new FileReader("file1.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while (scanner.hasNext()){
            System.out.println(i + " " + scanner.nextLine());
            i++;
        }
        fileReader.close();

    }
}

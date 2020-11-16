package com.softserve.edu10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Appl2Read {
    public static void main(String[] args) {
        byte[] r = new byte[20];
        String fileName = "D:\\test.txt";
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            int count = inFile.read(r, 0, bytesAv);
            System.out.println("Was readed: " + count + " bytes.");
            // System.out.println(r[0] + " " + r[1] + " " + r[2]);
            // System.out.println("Arrays: " + Arrays.toString(r));
            for (int i : r) {
                if (i == 0) {
                    break;
                }
                System.out.print(i + ", ");
            }
            System.out.println();
            inFile.close(); // ERROR, move to finally
            System.out.println("Input stream was closed.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException Error: " + e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException Error: " + e.getMessage());
            System.out.println("File Read/Write Error: " + fileName);
        } catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
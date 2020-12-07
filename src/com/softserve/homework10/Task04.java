package com.softserve.homework10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task04 {
    public static void main(String[] args) {
        String fileNameRead = "./file.txt";
        String fileNameWrite = "./fileNew.txt";
        //
        int bytesCount = -1;
        try (FileInputStream fileInputStream = new FileInputStream(fileNameRead)) {
            bytesCount = fileInputStream.available();
        } catch (Exception e) {
            System.out.println("ERROR FileInputStream");
            e.printStackTrace();
        }
        //
        int num = 0;
        int count = 0;
        String s = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileNameRead));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameWrite))) {
            while ((s = br.readLine()) != null) {
                num = num + s.length() + 2;
                s = "Line = " + ++count + " value = " + s;
                bw.write(s + "\r\n");
                System.out.println(s);
            }
            bw.write("Original Byte(s) Count is " + bytesCount + "\r\n");
            bw.write("Birthday date is " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            System.out.println("num = " + num);
        } catch (Exception e) {
            System.out.println("ERROR Read/Write");
            e.printStackTrace();
        }
        //
        int temp = -1;
        System.out.println("\nNew File:");
        try (FileInputStream fis = new FileInputStream(fileNameWrite)) {
            while ((temp = fis.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (Exception e) {
            System.out.println("ERROR FileInputStream");
            e.printStackTrace();
        }
    }
}

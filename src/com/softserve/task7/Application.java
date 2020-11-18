package com.softserve.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pattern = null;
        System.out.println("First part");
        try {
            pattern = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = null;
        try {
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("--------------------\nSecond part");
        String surnameNamePatronymic = null;
        try {
            surnameNamePatronymic = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(surnameNamePatronymic);
        String pattern1 = "\\w+ [A-Z]+";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(surnameNamePatronymic);
        while (m1.find()) {
            System.out.println(surnameNamePatronymic.substring(m1.start(), m1.end()) + "*");
        }
        System.out.println("--------------------\nThird part");
        System.out.println(checkWithRegExp("viseu"));
        System.out.println(checkWithRegExp("_jiuswafn5"));
        System.out.println(checkWithRegExp("vwiusabvi___54"));
        System.out.println(checkWithRegExp("_________4acs"));
        System.out.println(checkWithRegExp("1233"));
    }

    public static boolean checkWithRegExp(String userNameString) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}

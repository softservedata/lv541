package com.softserve.edu09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplRex {
    public static void main(String[] args) {
        //String pattern = "Now is the time";
        //String pattern = "[ Na-z]+";
        //String pattern = "[a-z]+";
        //String text = "Now is the time";
        //
        //
        String pattern = "<.+>";
        // String pattern = "<[^>]+>"; // All tags
        //String pattern = ">[^><]+<"; // All text
        //String pattern = "<(.+)>[^<]+</\\1>";
        String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
        //
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        //
        // 1. Is correspond
        if (m.matches()) {
            System.out.println("m.matches() OK");
        }
        //
        // 2. Get all parts
        m.reset();
        // List<String> list = new ArrayList<>();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
            // System.out.print(text.substring(m.start() + 1, m.end() - 1).trim() + "*");
            // list.add(text.substring(m.start(), m.end()));
        }
//        for (String current : list) {
//            System.out.println(current);
//        }
    }
}

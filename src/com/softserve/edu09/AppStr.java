package com.softserve.edu09;

public class AppStr {
    public static void main(String[] args) {
        /*-
        char[] chA = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        System.out.println("chA.length = " + chA.length);
        String strThird = new String(chA);
        System.out.println("strThird = " + strThird);
        String strFourth = new String(chA, 2, 4); // CDEF
        System.out.println("strFourth = " + strFourth);
        */
        /*-
        String str = "I study Java Kava language рст";
        int n = str.indexOf("ava"); // 9
        System.out.println("n = " + n);
        char c = str.charAt(8); // Not Working: str[8]
        System.out.println("c = " + c);
        //
        String str1 = str.substring(13);     // Kava language
        System.out.println("str1 = " + str1);
        str1 = str1.toUpperCase();
        System.out.println("new str1 = " + str1);
        String str2 = str.substring(8, 13);
        System.out.println("str2 = " + str2);
        */
        /*-
        String str = "\t\t   Tabulated String  \t\n\n\r";
        System.out.println("Origin:" + str);
        str = str.trim();
        System.out.println("Updated:" + str);
        */
        /*-
        String str = "abraacadaabraa";
        System.out.println(str);
        //str = str.replace("a", "--");
        //str = str.replaceAll("a$", "--");
        str = str.replaceAll("\\Baa\\B", "--"); // \B not a word boundary
        //str = str.replaceFirst("aa", "--");
        System.out.println(str);
        str = ""; // null
        System.out.println("str.isEmpty() = " + str.isEmpty());
        */
        /*-
        String a = "a"; // What will be the results?
        String A = "A";
        String b = "a";
        System.out.println("a.equals(A) " + a.equals(A));
        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(A) " + a.equalsIgnoreCase(A));
        System.out.println("a.compareTo(A) " + a.compareTo(A));
        System.out.println("a.compareToIgnoreCase(A) " + a.compareToIgnoreCase(A));
        */
        /*-
        String a0 = "Java"; // equals new String("Java");
        String a1 = "Java"; // set reference
        String a2 = new String("Java"); // create new object
        //
        System.out.println("(a0 == a1) =  " + (a0 == a1));
        System.out.println("(a0 == a2) =  " + (a0 == a2));
        //
        System.out.println("a0.equals(a1) =  " + a0.equals(a1));
        System.out.println("a0.equals(a2) =  " + a0.equals(a2));
        //
        System.out.println("a0.compareTo(a1) =  " + a0.compareTo(a1));
        System.out.println("a0.compareTo(a2) =  " + a0.compareTo(a2));
        //
        System.out.println("a0.hashCode() =  " + a0.hashCode());
        System.out.println("a1.hashCode() =  " + a1.hashCode());
        System.out.println("a2.hashCode() =  " + a2.hashCode());
        */
        /*-
        final double PI = 3.1415926;
        String format = "%S is =%6.2f\n";
        System.out.println("const PI = " + PI);
        String s = String.format(format, "pi", PI);
        System.out.println(s);
        System.out.printf(format, "pi", PI);
        */
        // /*-
        String s1 = new String("Hello");
        String s2 = " And Goodbye";
        String str = s1 + s2;
        // str = s1.concat(s2);
        System.out.println("str = " + str);
        //
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        // str = sb.toString();
        System.out.println(" sb = " + sb);
        System.out.println(" Reverse sb = " + sb.reverse());
        System.out.println("sb.capacity() = " + sb.capacity());
        sb.append("1234");
        System.out.println("add 1234 sb.capacity() = " + sb.capacity());
        sb.append("5");
        System.out.println("add 12345 sb.capacity() = " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("set 100 sb.capacity() = " + sb.capacity());
        // */
    }
}

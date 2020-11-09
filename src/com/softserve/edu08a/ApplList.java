package com.softserve.edu08a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplList {
    //private static String s1 = "Hello";
    
    public static void main(String[] args) {
        /*-
        String[] arrStr = { "222", "1", "1111", "10" };
        //System.out.println("arrStr = " + arrStr);
        System.out.println("arrStr = " + Arrays.toString(arrStr));
        //
        List<String> lstStr = Arrays.asList(arrStr);
        System.out.println("lstStr = " + lstStr);
        arrStr[1] = "01";
        //lstStr.clear();// Error
        System.out.println("Changed lstStr = " + lstStr);
        Arrays.sort(arrStr);
        //Collections.sort(lstStr);
        //lstStr.sort((a,b)->a.compareTo(b));
        System.out.println("Sorted lstStr = " + lstStr);
        //System.out.println("arrStr = " + Arrays.toString(arrStr));
        */
        /*-
        List<String> lstStr = new ArrayList<>();
        lstStr.add("222");
        lstStr.add("1");
        lstStr.add("1111");
        lstStr.add("10");
        System.out.println("Original: lstStr = " + lstStr);
        Collections.sort(lstStr);
        System.out.println("Sorted: lstStr = " + lstStr);
        */
        /*-
        List<Student> lstStr = new ArrayList<>();
        lstStr.add(new Student(143, "Stepan"));
        lstStr.add(new Student(234, "Petro"));
        lstStr.add(new Student(567, "Ira"));
        lstStr.add(new Student(123, "Ivan"));
        System.out.println("Original: lstStr = " + lstStr);
        //Collections.sort(lstStr);
        //Collections.sort(lstStr, new Student.ByName());
        Collections.sort(lstStr, new Student.ById());
        System.out.println("\nSorted: lstStr = " + lstStr);
        */
        //
        List<String> list = new ArrayList<>();
        list.add("First element");
        list.add("Second element");
        list.add(0, "One more first element");
        list.add("Second element");
        //
        System.out.println("Original List:");
        //String element2 = list.get(1);
        //System.out.println("element2 = " + element2);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("element = " + list.get(i));
//        }
        //
        for (String current : list) {
            System.out.println("element = " + current);
        }
        //
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String current = iterator.next();
//            System.out.println("element = " + current);
//        }
        //
        //System.out.println("elements = " + list);
        //
        //
        System.out.println("\nDeleting:");
        //
        //int n = list.size();
//        for (int i = 0; i < list.size(); i++) {
        //for (int i = 0; i < n; i++) {
//            System.out.println("to view: " + list.get(i));
//            if (list.get(i).contains("Second")) {
//                list.remove(i);
//            }
//        }
        //
//        for (String current : list) {
//            System.out.println("to view: " + current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
        //
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String current = iterator.next();
            System.out.println("to view: " + current);
            if (current.contains("Second")) {
                iterator.remove();
            }
        }
        //
        System.out.println("\nFinal List:");
        for (String current : list) {
            System.out.println(current);
        }
        //
    }
}

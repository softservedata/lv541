package com.softserve.edu.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetClass {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set <Integer> set2 = new HashSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
        Set intersect = set1.stream().filter(set2 :: contains).collect(Collectors.toSet());
        System.out.println(union);
        System.out.println(intersect);





    }
}

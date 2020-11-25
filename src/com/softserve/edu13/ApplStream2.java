package com.softserve.edu13;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ApplStream2 {
    public static void main(String[] args) {
        // /*-
        List<Integer> lst = new Random().ints()
            .limit(4)
            .sorted()
            //.forEach(System.out::println);
            .boxed()
            .collect(Collectors.toList());
        System.out.println(lst);
        //
    }
}

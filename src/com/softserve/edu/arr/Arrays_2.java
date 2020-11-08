package com.softserve.edu.arr;

public class Arrays_2 {
    public static void main(String[] args) {
        System.out.println(secondMaxIndex());

    }
    public static int secondMaxIndex(){
        int [] array = {-2, -4, -1, 6, 0};
        //int first = array[0];
     int second = array[0];
        int maxIndex = 0;
        int maxIndex2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                int first = array[i];
             //   first = second;
             // continue;
             // first = array[i];
          //      int first = array[i];
               // maxIndex = i;
                break;
            }
        }
        return maxIndex;

    }
}

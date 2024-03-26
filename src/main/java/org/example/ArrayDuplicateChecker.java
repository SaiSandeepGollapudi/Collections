package org.example;

import java.util.HashSet;

public class ArrayDuplicateChecker {


    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,2,5,1,4,3};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length;i++){
            if(set.add(arr[i]))
            System.out.println(arr[i]);
        }

    }
}

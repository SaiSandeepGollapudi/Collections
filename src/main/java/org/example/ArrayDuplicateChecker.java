package org.example;

import java.util.HashSet;

public class ArrayDuplicateChecker {


    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,2,5,1,4,3,6};
        //result 1,2,4
        //
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("Duplicate array values: ");
        printArray(duplciateArray(arr));

    }
    public static int[] duplciateArray(int[] arr){
        int[] result= new int[11];
        HashSet<Integer> hashSet= new HashSet<>();
int i=0;
        //if(!hashSet.add())
       for(int a: arr) {

         if(!hashSet.add(a)) {
             result[i]=a;
             i++;
             //System.out.println(a);
         }
       }

         //  hashSet.add(arr);
        return result;
    }

    public  static void  printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

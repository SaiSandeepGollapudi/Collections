package org.example;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(20,0.25f);// Initially even if we set it to 25% usage, if there is usage it dynamically increases like list size

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter an Integer to verify if its in Set: ");
            int e = sc.nextInt();
            //hashSet.add(10);
            if(hashSet.contains(e))
                System.out.println("Element is in SET "  );
            else
                System.out.println("Element not in set"  );
            System.out.println("Values of hashSet: " + hashSet);//The 10 is not printed as set cannot have duplicate and values printed may not be in the order of the items added
            //  as they are ordered in table as per hash

            if(e==0)
                break;
        }

    }
}

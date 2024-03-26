package org.example;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(20,0.25f);// Initially even if we set it to 25% usage, if there is usage it dynamically increases like list size

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);

        System.out.println("Values of hashSet: "+ hashSet);//The 10 is not printed as set cannot have duplicate and values printed may not be in the order of the items added
        //  as they are ordered in table as per hash function
    }
}

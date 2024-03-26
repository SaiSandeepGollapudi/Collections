package org.example;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        System.out.println("HashMap put: " + hashMap.put(10, "Apple"));//Returns: the previous value associated with key, or null if there was no mapping for key
        hashMap.put(25, "Banana");
        hashMap.put(30, "Orange");
        hashMap.put(40, "Grapes");
        hashMap.put(50, "Mango");
        hashMap.put(70, "Pineapple");
        System.out.println("HashMap after Putting elements: " + hashMap.toString());

        System.out.println("HashMap get " + hashMap.get(10));
        System.out.println("HashMap after get: " + hashMap.toString());

        System.out.println("HashMap remove " + hashMap.remove(10));
        System.out.println("HashMap after remove: " + hashMap.toString());

        System.out.println("HashMap containsKey " + hashMap.containsKey(30));
        System.out.println("HashMap after containsKey: " + hashMap.toString());

        System.out.println("HashMap containsValue " + hashMap.containsValue("Grapes"));
        System.out.println("HashMap after containsValue: " + hashMap.toString());

        System.out.println("HashMap Key Set(Shows all keys)" + hashMap.keySet());
        System.out.println("HashMap after keySet: " + hashMap.toString());

       
        System.out.println("HashMap Entry Set(Displaying the entries of set): " + hashMap.entrySet());
        System.out.println("HashMap after entrySet: " + hashMap.toString());

    }
}

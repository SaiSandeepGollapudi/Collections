package org.example;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        // Create a TreeMap to store Integer keys and string values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("TreeMap before put: "+  treeMap.put(10, "Apple"));
        System.out.println("TreeMap after put: "+  treeMap.put(10, "Apple"));
        treeMap.put(30, "Orange");
        treeMap.put(40, "Grapes");
        treeMap.put(25, "Banana");
        treeMap.put(70, "Pineapple");
        treeMap.put(50, "Mango");

        System.out.println("TreeMap after Adding elements: " + treeMap);

        System.out.println("First key-value Entry in TreeMap: " + treeMap.firstEntry());
        System.out.println("TreeMap after firstEntry " + treeMap);

        System.out.println("PollFirstEntry  from TreeMap: " + treeMap.pollFirstEntry());
        System.out.println("TreeMap after removing first entry: " + treeMap);

        System.out.println("First Key in TreeMap: " + treeMap.firstKey());
        System.out.println("TreeMap after First Key: " + treeMap);

        System.out.println("Last Key in TreeMap: " + treeMap.lastKey());
        System.out.println("TreeMap after Last Key: " + treeMap);

        System.out.println("Ceiling Entry for 55(key greater than or equal to the given key): " + treeMap.ceilingEntry(55));
        System.out.println("TreeMap after Ceiling Entry : " + treeMap);

        System.out.println("HeadMap for key 40(strictly less than the given key): " + treeMap.headMap(40));
        System.out.println("TreeMap after HeadMap: " + treeMap);


        System.out.println("TailMap for key 30:(key greater than or equal to the given key) " + treeMap.tailMap(30));
        System.out.println("TreeMap after TailMap: " + treeMap);

        // Get and print a view of the portion of the TreeMap between the given keys
        System.out.println("SubMap between keys 20 and 50: " + treeMap.subMap(20, 50));
        System.out.println("TreeMap after SubMap: " + treeMap);

        // Remove and print the value associated with the specified key
        System.out.println("Removed value for key 70: " + treeMap.remove(70));
        System.out.println("TreeMap after removing key 70: " + treeMap);
    }
}

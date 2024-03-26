package org.example;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("TreeSet add: "+  treeSet.add(10));
        treeSet.add(25);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(70);
        System.out.println("TreeSet after Adding elements: " + treeSet.toString());

        System.out.println("TreeSet get "+ treeSet.getFirst());
        System.out.println("TreeSet after get: " + treeSet.toString());

        System.out.println("TreeSet poll "+ treeSet.pollFirst());
        System.out.println("TreeSet after poll: " + treeSet.toString());

        System.out.println("TreeSet first "+ treeSet.first());
        System.out.println("TreeSet after first: " + treeSet.toString());

        System.out.println("TreeSet last "+ treeSet.last());
        System.out.println("TreeSet after last: " + treeSet.toString());

        System.out.println("TreeSet Ceiling Element of 55(Element greater than 55): "+ treeSet.ceiling(55));
        System.out.println("TreeSet after ceiling: " + treeSet.toString());

        System.out.println("TreeSet headSet Elements of 40 (elements less than 40): "+ treeSet.headSet(40));
        System.out.println("TreeSet after Head Set : " + treeSet.toString());

        System.out.println("TreeSet Tail Set Elements of 30(greater than or equal to 30): "+ treeSet.tailSet(30));
        System.out.println("TreeSet after Tail Set : " + treeSet.toString());

        System.out.println("TreeSet Sub Set Elements between 20 and 50: "+ treeSet.subSet(20, 50));
        System.out.println("TreeSet after Sub Set: " + treeSet.toString());

        System.out.println("TreeSet remove "+ treeSet.remove(70));
        System.out.println("TreeSet after remove: " + treeSet.toString());

    }
}

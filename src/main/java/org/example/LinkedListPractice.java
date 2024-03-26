package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>(List.of(1,2,3,4));
        linkedList1.pop();
       // System.out.println("Adding the value 2 "+  ;);
        System.out.println("The value at index 2: "+linkedList1.get(2));
        System.out.println("Values of LinkedList1: "+ linkedList1);
        System.out.println("Reversed values of LinkedList1: "+ linkedList1.reversed());

        Object[] array = linkedList1.toArray();

        System.out.println("Elements of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//
//        LinkedList<Integer> linkedList2= new LinkedList<>();
//       linkedList1.add(0);
//       linkedList1.add(1,1);
//       linkedList1.add(2,2);
//
//       //linkedList1.get(3);
//       // linkedList2.addAll(linkedList1);
//        linkedList2.addLast(5);
//        linkedList2.add(6);
//        linkedList2.add(6);
//        linkedList2.add(6);
//        System.out.println("before LinkedList2:"+ linkedList2);
//        System.out.println("before LinkedList1:"+ linkedList1);
//        //linkedList2= (LinkedList<Integer>) linkedList1.clone();
//
//        linkedList2.addAll(2,linkedList1);
//        linkedList1.add(2);
//
//        System.out.println("Final LinkedList1:" + linkedList1);
//        System.out.println("Final LinkedList2:"+ linkedList2);
//
//
//        Iterator<Integer> iterator= linkedList1.iterator();
//        while(iterator.hasNext())
//        {
//           int z=iterator.next()+2;
//            System.out.println(z);
//        }



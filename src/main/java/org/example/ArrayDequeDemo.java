package org.example;
import java.util.ArrayDeque;
import java.util.HashSet;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer>  arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(0);
        arrayDeque.offer(1);
        arrayDeque.offer(27);
        arrayDeque.offer(23);
        arrayDeque.offer(28);
        arrayDeque.offer(6);
        arrayDeque.offer(4);

        //int FirstElement= arrayDeque.peekFirst();
        System.out.println("Elements in ArrayDeque at beginning: "+ arrayDeque);

        arrayDeque.addLast(30);
        System.out.println(" Add last element in ArrayDeque");
        System.out.println("Elements in ArrayDeque: "+ arrayDeque);

        boolean isOffered = arrayDeque.offerLast(40);
        System.out.println(" Add last element in ArrayDeque: "+ isOffered);
        System.out.println("Elements in ArrayDeque: "+ arrayDeque);



  //      int getLastElement = arrayDeque.getLast();
//        System.out.println(" Get Last element removed in ArrayDeque: "+ getLastElement);
//        System.out.println("Elements in ArrayDeque: "+ arrayDeque);
//
//        int peekLastElement = arrayDeque.peekLast();
//        System.out.println(" Peek Last element removed in ArrayDeque: "+ peekLastElement);
//        System.out.println("Elements in ArrayDeque: "+ arrayDeque);

//        int pollLastElement = arrayDeque.pollLast();
//        System.out.println(" Poll Last element removed in ArrayDeque: "+ pollLastElement);
//        System.out.println("Elements in ArrayDeque: "+ arrayDeque);
//
//        int removeLastElement = arrayDeque.removeLast();
//
//        //System.out.println("First element in ArrayDeque: "+ FirstElement);
//        System.out.println("Remove Last element removed in ArrayDeque: "+ removeLastElement);
//        System.out.println("Elements in ArrayDeque: "+ arrayDeque);

    }

}

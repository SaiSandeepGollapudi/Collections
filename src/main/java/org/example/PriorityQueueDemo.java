package org.example;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.offer(20);

        pq.add(30);
        System.out.println("Pq Offer: "+ pq.offer(40));
        System.out.println("Pq after Offer: "+ pq.toString());
        pq.offer(16);

        //System.out.println("Pq add: "+ pq.add(40));
        System.out.println("Pq after add: "+ pq.toString());//16 20 30 40 40
        pq.offer(8);

        System.out.println("Pq peek: "+ pq.peek());//8
        System.out.println("Pq after peek: "+ pq.toString());// 8 16 20 30 40 40

        System.out.println("Pq poll: "+ pq.poll());//8
        System.out.println("Pq after poll: "+ pq.toString());//16 20 30 40 40
        pq.offer(15);

        System.out.println("Pq remove: "+ pq.remove(20));//true
        System.out.println("Pq after remove: "+ pq.toString());//15 16 30 40 40


    }
}

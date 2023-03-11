package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ComparableExample {


    public static void main(String[] args) {
        PriorityQueue<Squad> comparablePriorityQueue = new PriorityQueue<>();
        comparablePriorityQueue.add(new Squad(5, "java"));
        comparablePriorityQueue.add(new Squad(32, "MERN"));
        comparablePriorityQueue.add(new Squad(1, "Node"));
        comparablePriorityQueue.add(new Squad(5, "Java"));

        while(comparablePriorityQueue.peek()!=null){
            System.out.println("This is a our integers in a priority queue -----> "+ comparablePriorityQueue.poll());
        }


        //UNBOUNDED COLLECTION EXAMPLE


    }
}

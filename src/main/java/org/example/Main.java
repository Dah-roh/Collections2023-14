package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Squad> squadPriorityQueue = new PriorityQueue<Squad>(5, new ComparingSquads());
        squadPriorityQueue.add(new Squad(5, "Java"));
        squadPriorityQueue.add(new Squad(32, "MERN"));
        squadPriorityQueue.add(new Squad(1, "Node"));
        squadPriorityQueue.add(new Squad(5, "Java"));
        System.out.println("print squad priority queue -----> " + squadPriorityQueue);


        while(!squadPriorityQueue.isEmpty()){
            System.out.println(" each element---> "+squadPriorityQueue.poll());
        }

        //List AND Arraylist... Take home
        List<String> stringList = new ArrayList<>();
        ArrayList<Squad> stringArrayList = new ArrayList<>();


        stringArrayList.add(new Squad(5, "Java"));
        stringArrayList.add(new Squad(32, "MERN"));
        stringArrayList.add(new Squad(1, "Node"));
        stringArrayList.add(new Squad(5, "Java"));

        System.out.println("Printing stringArraylist objects ---->" + stringArrayList.get(3));

    }
}
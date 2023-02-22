package org.example;

import java.util.*;

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
        PriorityQueue<Books> shelfOfBooks = new PriorityQueue<>();

        //Queue<Integer> nameQueue = new PriorityQueue<>();

        Books algoexpert = new Books(5, "java");
        Books algoexpert1 = new Books(3, "java");
        Books algoexpert2 = new Books(1, "java");

        shelfOfBooks.add(algoexpert);
        shelfOfBooks.add(algoexpert1);
        shelfOfBooks.add(algoexpert2);

        System.out.println("This is the shelfOfBooks ------> "+ shelfOfBooks);

        while (!shelfOfBooks.isEmpty()){
            System.out.println("this is the 'polling' results for the shelfOfBooks --------> "+ shelfOfBooks.poll());
        }
        //LinkedList
        LinkedList<String> stringLinkedList =  new LinkedList<>();
        stringLinkedList.add("java");
        stringLinkedList.addFirst("Python");
        stringLinkedList.add(1, "node");

        //Custom LinkedList implementation
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add("Java");
        linkedListExample.add("mern");
        //linkedListExample.addAt(1, "Java");

        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getData());
        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getNextNode().getData());



        System.out.println("This is the linkedlist ----> "+ stringLinkedList);

    }
}
package org.example;


import java.awt.print.Book;
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
        ArrayList<Books> shelfOfBooks = new ArrayList<>();


        Map<String, ArrayList<Books>> searchingBook = new HashMap<>();

//        Queue<Integer> nameQueue = new PriorityQueue<>();

        Books algoexpert = new Books(5, "java");
        Books algoexpert1 = new Books(5, "java");
        searchingBook.put("computer science", shelfOfBooks);
        shelfOfBooks.add(algoexpert);
        shelfOfBooks.add(algoexpert1);




        //LinkedList
        LinkedList<String> stringLinkedList =  new LinkedList<>();
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.add("Java");
        linkedListExample.add("mern");
//        linkedListExample.addAt(1, "Java");

        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getData());
        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getNextNode().getData());

        stringLinkedList.add("java");
        stringLinkedList.addFirst("Python");
        stringLinkedList.add(1, "node");

        System.out.println("This is the linkedlist ----> "+ stringLinkedList);

    }
}
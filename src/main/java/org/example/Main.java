package org.example;

import java.util.*;

public class Main implements GenericsExampleService<Books, Squad>{
    public static void main(String[] args) {
        PriorityQueue<Squad> squadPriorityQueue = new PriorityQueue<Squad>(5, new ComparingSquads());
        squadPriorityQueue.add(new Squad(5, "Java"));
        squadPriorityQueue.add(new Squad(32, "MERN"));
        squadPriorityQueue.add(new Squad(1, "Node"));
        squadPriorityQueue.add(new Squad(5, "Java"));
        System.out.println("print squad priority queue -----> " + squadPriorityQueue);

        Map<String, Object> mapOfObject = new HashMap<>();
        mapOfObject.put("list", new ArrayList<>());
        mapOfObject.put("set", new HashSet<>());
        mapOfObject.put("hashmap", new HashMap<>());

        Set<String> namesOfPeople =  new HashSet<>();
        namesOfPeople.add("daro");
        namesOfPeople.add("Oluwaseyi");
        namesOfPeople.add("daro");

        System.out.println("This is the set Object data -----> "+ namesOfPeople);





        while(!squadPriorityQueue.isEmpty()){
            System.out.println(" each element---> "+squadPriorityQueue.poll());
        }

        //List AND Arraylist... Take home
        List<String> stringList = new ArrayList<>();
        PriorityQueue<Books> shelfOfBooks = new PriorityQueue<>();


        //Queue<Integer> nameQueue = new PriorityQueue<>()
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
        linkedListExample.addAt(1, "Java");

        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getData());
        System.out.println("This is my linkedlist example ------> "+ linkedListExample.getHead().getNextNode().getData());
        System.out.println("MERN ------> "+ linkedListExample.get(1));



        System.out.println("This is the linkedlist ----> "+ stringLinkedList);



        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(1);
        integerQueue.add(3);
        integerQueue.add(2);
        integerQueue.add(4);
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(3);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(4);


        //testing queues
        while(integerQueue.peek()!=null){
            System.out.println("This is a our integers in a priority queue -----> "+ integerPriorityQueue.poll());
        }





    }

    @Override
    public void save(Squad squad) {

    }

    @Override
    public String count(Books books) {
        return null;
    }
}
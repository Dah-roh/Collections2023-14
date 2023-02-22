package org.example;

public class LinkedListExample {
    private Node head;    
    public Node getHead() {        
        return head;    
    }    
    public void setHead(Node head) {        
        this.head = head;    
    }   
    public class Node {        
        private String data;        
        private Node nextNode;        
        public Node(String data){            
            this.data = data;        
        }        
        public String getData() {            
            return data;        
        }        
        public void setData(String data) {            
            this.data = data;        
        }        
        public Node getNextNode() {            
            return nextNode;        
        }        
        public void setNextNode(Node nextNode) {            
            this.nextNode = nextNode;        
        }    
    }    
    public void add(String data){        
        Node newNode = new Node(data);        
        if(this.head == null){            
            head = newNode;        
        }
        else {            
            Node currentNode = head;            
            while(currentNode.getNextNode() != null){                
                currentNode = currentNode.getNextNode();            
            }            currentNode.setNextNode(newNode);        
        }    
    }    
    public void addAt(int index, String data){
        Node nodeToBeInserted = new Node(data);        
        Node node = head;        
        int count = 1;
        while(index > count){
            count++;            
            node = node.getNextNode();        
        }        
        nodeToBeInserted.setNextNode(node.getNextNode());        
        node.setNextNode(nodeToBeInserted);    
    }    
    public String get(int index){
        Node node = head;        
        int count = 0;
        while(index>count){            
            node = node.getNextNode();            
            count++;        }        
        return node.getData();    
    }
}
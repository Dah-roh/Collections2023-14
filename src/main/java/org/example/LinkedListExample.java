package org.example;

//This is a custom implementation of the Java LinkedList. Please note that I have provided you with the logic and
//implementation needed to be able to implement delete or print methods for the custom LinkedList but because I have an endless volume
// of kindness and empathy in my heart. Please find clues in the similarities in the get method and the addAt method below for help in implementing
// custom delete or print methods.
public class LinkedListExample {
    private Node head;//This is a composition(OOP COMPOSITION) of the inner Node class below
                    // in line 17 to line 35
    public Node getHead() {        
        return head;    
    }    
    public void setHead(Node head) {        
        this.head = head;    
    }
    //Below is the structure or blueprint for a singly linkedList node. The node class below is what is referenced
    //in line 4 (private Node head;)
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
        Node dataNode = new Node(data);//the node storing our data to be inserted into our custom-made linkedList.
        if(this.head == null){//if the head has no node stored in it already(basically meaning a new LinkedList), this will be true.
            head = dataNode;// then store the new dataNode in the head location of our LinkedList.
        }
        else {            //if the LinkedList already has a node stored in its head location (basically meaning it is not a new or empty
                          //LinkedList) so we...
            Node currentNode = head;            
            while(currentNode.getNextNode() != null){    //...check if the head node already has a value stored in
                                                        //its next node address. And if it does have a node stored in it, then the else condition is met, and we read, retrieve, or get
                                                        //the node(in the next node location of the head) and continue to check if the next node is 'vacant' or null in the current node we are accessing.
                currentNode = currentNode.getNextNode();            
            }
            currentNode.setNextNode(dataNode);//When we finally find a node with a next node that is 'vacant' or null, we will set our data node to be stored in the 'vacant' and/or null next node.
        }    
    }    
    public void addAt(int index, String data){
        Node nodeToBeInserted = new Node(data);        //we create a new node object to store the data we want to add to the
                                                        //LinkedList
        Node node = head;        
        int count = 1;          //THE BELOW COMMENT IS A CYCLICAL LINKED LIST... WHO CAN SEE IT?
        while(index > count){// {...-->we check if index we intend to add the node is higher than our count that we are using
                            //to track the number of while loop iterations (since each iteration should represent each linkedList element address or location, linearly)
            count++;            //we increment our while loop iteration counter (because one must be added to count for each loop
            node = node.getNextNode(); //Then we change operational focus to the next node and ...-->}
        }        
        nodeToBeInserted.setNextNode(node.getNextNode());   //Once we've gotten to this line it means our while loop has
        node.setNextNode(nodeToBeInserted);                 //finally found a null or 'vacant' location to store our data node and we store it here
    }    
    public String get(int index){//This method is an extract from the above method. The only difference is the fact that we are not doing
        Node node = head;        //ANY WRITE OPERATIONS on the node or it's data.
        int count = 0;
        while(index > count){
            node = node.getNextNode();
            count++;
        }
        return node.getData();    //return the data of the node
    }
}
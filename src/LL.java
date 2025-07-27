package com.yooo;

public class LL {

     private Node head = null;
     private Node tail = null;
     private int size;

    public LL() {
        // constructor
        this.size = 0;
        this.head = null;
        this.tail = null;
    }


    private class Node{
        // node is a class , like every box is a node ( it has a value and a next pointer of node type cos it points to node)
         private int value;
         private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // 1.Insert first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;
    }

    // 2.Insert Last
    public void insertLast(int val) {
        if (tail == null) {
            // single element only
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //3.Insert node at any index
    public void insert(int val ,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // Delete first node
    public int deleteFirst() {
        // Check if list is empty
//        if (isEmpty()) {
//            throw new RuntimeException("List is empty");
//        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    // Delete last node
    public int deleteLast() {
        // Check if list is empty
//        if (isEmpty()) {
//            throw new RuntimeException("List is empty");
//        }
        // If only one element exists
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // Get node at specific index
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // this method finds the node in the linkedlist
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Helper method to check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        // basically displaying the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

}

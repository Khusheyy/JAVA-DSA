package com.yooo;

public class DLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node; // check for null pointer
        }
        head = node;
    }

    public void insertLast(int val) {
       Node node = new Node(val);
       Node last = head;

       if(head == null){
           //if there is no element (empty list)
           node.next = null;
           head = node;
           return;
       }
       while(last.next != null){
           last = last.next;
       }
       last.next = node;// last.next -> new node which we created
       node.prev = last;
       node.next=null;

    }

    public void insert(int after, int value){
        Node p = find(after);
        if(p == null){
            System.out.println("index does not exists!");
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev =  node;
        }

    }
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

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
//        System.out.println("\ndisplaying linked list in reverse : ");
//        while (last != null) {
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.print("start");

    }
    // display in reverse
    public void displayRev() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }

    private class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}

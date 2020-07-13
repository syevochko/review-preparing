package com.google.ievochko;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write java function to reverse elements in one directional linked list
 */
public class ReverseList {
    static class Node {
        public String name;
        public Node next;
        public Node(String name, Node next) {
            this.name = name;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        Node n4 = new Node("4", null);
        Node n3 = new Node("3", n4);
        Node n2 = new Node("2", n3);
        Node n1 = new Node("1", n2);

        printNodes(n1);
        printNodes(reverseList.reverse(n1));
    }

    public static void printNodes(Node root)   {
        Node r = root;
        while (r != null) {
            System.out.print(r.name + " -> ");
            r = r.next;
        }
        System.out.println();
    }

    public Node reverse(Node root)  {
        Node prev = root;
        Node curr = root.next;
        prev.next = null;
        while (curr != null)    {
            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}

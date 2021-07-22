/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rntongo.iterationtorecursion;

/**
 *
 * @author rogersentongo
 */
class Solution { 
    /* Returns count of nodes in linked list */
    public static int lengthOfList(Node head) 
    { 
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    } 
  
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
        llist.push(1); 
        llist.push(3); 
        llist.push(1); 
        llist.push(2); 
        llist.push(1); 
  
        System.out.println("Count of nodes is = " + lengthOfList(llist.head)); 
    } 
} 
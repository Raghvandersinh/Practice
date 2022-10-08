/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytointeger;

/**
 *
 * @author nitir
 */
public class LinkedList
{
    private Node head;
    private int size;
    
    private class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data = data;
        }
        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    
    public void addFirst(int item)
    {
        head = new Node(item, head);
        size++;
    }
    
    public void addLast(int item)
    {
        Node n = new Node(item);
        if(head == null)
        {
            head = n;
        }
        else
        {
            Node curr = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = n;          
        }
    }
    public void printList()
    {
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.next != null)
            {
                System.out.print(temp.data + " ==> ");
            }
            if(temp.next == null)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    
    public Node deleteEnd(int data)
    {
        Node curr = head;
        if(curr == null || curr.next == null)
        {
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        
        if(nextNode.next != null)
        {
            if(nextNode.next == null)
            {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;  
    }
    
    public Node deleteFirst()
    {
        if(head != null)
        {
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }
    
    
    public int getDecimal()
    {
        int res = 0;
        while(head != null)
        {
            res *= 2;
            res += head.data;
            head = head.next;     
        }
        return res;
    }
    
}
